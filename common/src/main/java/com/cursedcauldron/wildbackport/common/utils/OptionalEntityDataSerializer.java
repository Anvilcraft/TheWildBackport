package com.cursedcauldron.wildbackport.common.utils;

import java.util.Optional;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.syncher.EntityDataSerializer;

public class OptionalEntityDataSerializer<T>
    implements EntityDataSerializer<Optional<T>> {
    final EntityDataSerializer<T> inner;

    public OptionalEntityDataSerializer(EntityDataSerializer<T> inner) {
        this.inner = inner;
    }

    @Override
    public Optional<T> copy(Optional<T> object) {
        return object.map(this.inner::copy);
    }

    @Override
    public Optional<T> read(FriendlyByteBuf fbb) {
        return fbb.readBoolean() ? Optional.of(this.inner.read(fbb)) : Optional.empty();
    }

    @Override
    public void write(FriendlyByteBuf fbb, Optional<T> object) {
        fbb.writeBoolean(object.isPresent());
        object.ifPresent(innerObj -> this.inner.write(fbb, innerObj));
    }
}
