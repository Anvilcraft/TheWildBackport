package com.cursedcauldron.wildbackport.common.utils;

import net.minecraft.core.GlobalPos;
import net.minecraft.core.Registry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class GlobalPosEntityDataSerializer implements EntityDataSerializer<GlobalPos> {
    public static final GlobalPosEntityDataSerializer INSTANCE
        = new GlobalPosEntityDataSerializer();
    public static final OptionalEntityDataSerializer<GlobalPos>
        OPTIONAL_INSTANCE = new OptionalEntityDataSerializer<>(INSTANCE);

    static {
        EntityDataSerializers.registerSerializer(INSTANCE);
        EntityDataSerializers.registerSerializer(OPTIONAL_INSTANCE);
    }

    @Override
    public GlobalPos copy(GlobalPos object) {
        return object;
    }

    @Override
    public GlobalPos read(FriendlyByteBuf fbb) {
        return GlobalPos.of(
            ResourceKey.create(
                Registry.DIMENSION_REGISTRY, new ResourceLocation(fbb.readUtf())
            ),
            fbb.readBlockPos()
        );
    }

    @Override
    public void write(FriendlyByteBuf fbb, GlobalPos obj) {
        fbb.writeUtf(obj.dimension().location().toString());
        fbb.writeBlockPos(obj.pos());
    }
}
