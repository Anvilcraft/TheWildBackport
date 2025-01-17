package com.cursedcauldron.wildbackport.common.items;

import javax.annotation.Nullable;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;
import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;

public class CompassItemPropertyFunction implements ClampedItemPropertyFunction {
    private final CompassItemPropertyFunction.CompassWobble wobble
        = new CompassItemPropertyFunction.CompassWobble();
    private final CompassItemPropertyFunction.CompassWobble wobbleRandom
        = new CompassItemPropertyFunction.CompassWobble();
    public final CompassItemPropertyFunction.CompassTarget compassTarget;

    public CompassItemPropertyFunction(CompassItemPropertyFunction.CompassTarget target) {
        this.compassTarget = target;
    }

    public float unclampedCall(
        ItemStack p_234960_,
        @Nullable ClientLevel p_234961_,
        @Nullable LivingEntity p_234962_,
        int p_234963_
    ) {
        Entity entity
            = p_234962_ != null ? p_234962_ : p_234960_.getEntityRepresentation();
        if (entity == null) {
            return 0.0F;
        } else {
            p_234961_ = this.tryFetchLevelIfMissing(entity, p_234961_);
            return p_234961_ == null
                ? 0.0F
                : this.getCompassRotation(p_234960_, p_234961_, p_234963_, entity);
        }
    }

    private float getCompassRotation(
        ItemStack p_234955_, ClientLevel p_234956_, int p_234957_, Entity p_234958_
    ) {
        GlobalPos globalpos = this.compassTarget.getPos(p_234956_, p_234955_, p_234958_);
        long i = p_234956_.getGameTime();
        return !this.isValidCompassTargetPos(p_234958_, globalpos)
            ? this.getRandomlySpinningRotation(p_234957_, i)
            : this.getRotationTowardsCompassTarget(p_234958_, i, globalpos.pos());
    }

    private float getRandomlySpinningRotation(int p_234937_, long p_234938_) {
        if (this.wobbleRandom.shouldUpdate(p_234938_)) {
            this.wobbleRandom.update(p_234938_, Math.random());
        }

        double d0 = this.wobbleRandom.rotation
            + (double) ((float) this.hash(p_234937_) / 2.14748365E9F);
        return Mth.positiveModulo((float) d0, 1.0F);
    }

    private float getRotationTowardsCompassTarget(
        Entity p_234942_, long p_234943_, BlockPos p_234944_
    ) {
        double d0 = this.getAngleFromEntityToPos(p_234942_, p_234944_);
        double d1 = this.getWrappedVisualRotationY(p_234942_);
        if (p_234942_ instanceof Player player) {
            if (player.isLocalPlayer()) {
                if (this.wobble.shouldUpdate(p_234943_)) {
                    this.wobble.update(p_234943_, 0.5D - (d1 - 0.25D));
                }

                double d3 = d0 + this.wobble.rotation;
                return Mth.positiveModulo((float) d3, 1.0F);
            }
        }

        double d2 = 0.5D - (d1 - 0.25D - d0);
        return Mth.positiveModulo((float) d2, 1.0F);
    }

    @javax.annotation.Nullable
    private ClientLevel tryFetchLevelIfMissing(
        Entity p_234946_, @javax.annotation.Nullable ClientLevel p_234947_
    ) {
        return p_234947_ == null && p_234946_.level instanceof ClientLevel
            ? (ClientLevel) p_234946_.level
            : p_234947_;
    }

    private boolean isValidCompassTargetPos(
        Entity p_234952_, @javax.annotation.Nullable GlobalPos p_234953_
    ) {
        return p_234953_ != null && p_234953_.dimension() == p_234952_.level.dimension()
            && !(p_234953_.pos().distToCenterSqr(p_234952_.position()) < (double) 1.0E-5F
            );
    }

    private double getAngleFromEntityToPos(Entity p_234949_, BlockPos p_234950_) {
        Vec3 vec3 = Vec3.atCenterOf(p_234950_);
        return Math.atan2(vec3.z() - p_234949_.getZ(), vec3.x() - p_234949_.getX())
            / (double) ((float) Math.PI * 2F);
    }

    private double getWrappedVisualRotationY(Entity entity) {
        return Mth.positiveModulo(entity.getYRot() / 360.0F, 1.0D);
    }

    private int hash(int p_234935_) {
        return p_234935_ * 1327217883;
    }

    public interface CompassTarget {
        @Nullable
        GlobalPos getPos(ClientLevel level, ItemStack stack, Entity entity);
    }

    static class CompassWobble {
        double rotation;
        private double deltaRotation;
        private long lastUpdateTick;

        boolean shouldUpdate(long updateTick) {
            return this.lastUpdateTick != updateTick;
        }

        void update(long updateTick, double rotation) {
            this.lastUpdateTick = updateTick;
            double d0 = rotation - this.rotation;
            d0 = Mth.positiveModulo(d0 + 0.5D, 1.0D) - 0.5D;
            this.deltaRotation += d0 * 0.1D;
            this.deltaRotation *= 0.8D;
            this.rotation = Mth.positiveModulo(this.rotation + this.deltaRotation, 1.0D);
        }
    }
}