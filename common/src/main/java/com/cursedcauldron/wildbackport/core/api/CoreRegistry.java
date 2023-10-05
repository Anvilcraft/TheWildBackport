package com.cursedcauldron.wildbackport.core.api;

import java.util.function.Supplier;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

/**
 * @author LordMZTE & tilera
 */
public abstract class CoreRegistry<T> {
    public final Registry<T> registry;
    public final String modId;
    public boolean isPresent;

    protected CoreRegistry(Registry<T> registry, String modId) {
        this.registry = registry;
        this.modId = modId;
        this.isPresent = false;
    }

    @ExpectPlatform
    public static <T> CoreRegistry<T> create(Registry<T> key, String modId) {
        throw new AssertionError();
    }

    public abstract <E extends T> Supplier<E> register(String key, Supplier<E> entry);

    public void register() {
        if (this.isPresent)
            throw new IllegalArgumentException(
                "Duplication of Registry: " + this.registry
            );
        this.isPresent = true;
        this.bootstrap();
    }

    protected abstract void bootstrap();

    public static class DefaultRegistry<T> extends CoreRegistry<T> {
        public DefaultRegistry(Registry<T> registry, String modId) {
            super(registry, modId);
        }

        @Override
        public <E extends T> Supplier<E> register(String key, Supplier<E> entry) {
            E registry = Registry.register(
                this.registry, new ResourceLocation(this.modId, key), entry.get()
            );
            return () -> registry;
        }

        @Override
        public void bootstrap() {}
    }
}
