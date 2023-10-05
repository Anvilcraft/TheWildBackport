package com.cursedcauldron.wildbackport.core.mixin.access;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.StructureFeature;

@Mixin(StructureFeature.class)
public interface StructureFeatureAccessor {
    @Invoker
    public static <F extends StructureFeature<?>>
        F callRegister(String string, F arg, Decoration arg2) {
        throw new AssertionError();
    }

    @Accessor("STEP")
    public static Map<StructureFeature<?>, Decoration> getStep() {
        throw new AssertionError();
    }
}
