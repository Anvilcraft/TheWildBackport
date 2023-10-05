package com.cursedcauldron.wildbackport.common.utils;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.cursedcauldron.wildbackport.core.api.CoreRegistry;
import com.mojang.datafixers.util.Either;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;

public class SupplierHolder<E, T extends E> implements Holder<T> {
    public ResourceKey<T> key;
    public Supplier<T> supplier;

    public SupplierHolder(
        ResourceKey<? extends Registry<E>> regKey, String loc, Supplier<T> supplier
    ) {
        this(regKey, new ResourceLocation(loc), supplier);
    }

    @SuppressWarnings("unchecked")
    public SupplierHolder(
        ResourceKey<? extends Registry<E>> regKey,
        ResourceLocation loc,
        Supplier<T> supplier
    ) {
        this((ResourceKey<T>) ResourceKey.create(regKey, loc), supplier);
    }

    public SupplierHolder(ResourceKey<T> key, Supplier<T> supplier) {
        this.key = key;
        this.supplier = supplier;
    }

    public static <E, T extends E> SupplierHolder<E, T>
    createAndRegister(CoreRegistry<E> reg, String loc, Supplier<T> supplier) {
        return new SupplierHolder<E, T>(
            reg.registry.key(), loc, reg.register(loc, supplier)
        );
    }

    @Override
    public boolean is(ResourceLocation resourceLocation) {
        return this.key.location().equals(resourceLocation);
    }

    @Override
    public boolean is(ResourceKey<T> resourceKey) {
        return this.key.equals(resourceKey);
    }

    @Override
    public boolean is(Predicate<ResourceKey<T>> predicate) {
        return predicate.test(this.key);
    }

    @Override
    public boolean is(TagKey<T> tagKey) {
        return false;
    }

    @Override
    public boolean isBound() {
        return true;
    }

    @Override
    public boolean isValidInRegistry(Registry<T> registry) {
        return registry.key().location().equals(this.key.registry());
    }

    @Override
    public Kind kind() {
        return Holder.Kind.REFERENCE;
    }

    @Override
    public Stream<TagKey<T>> tags() {
        return Stream.empty();
    }

    @Override
    public Either<ResourceKey<T>, T> unwrap() {
        // This NEEDS to always return a key and not a value. Otherwise, Mojank's shitty chunk
        // serialization breaks.
        return Either.left(this.key);
    }

    @Override
    public Optional<ResourceKey<T>> unwrapKey() {
        return Optional.of(this.key);
    }

    @Override
    public T value() {
        return this.supplier.get();
    }
}
