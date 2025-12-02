package me.shortman.mc.items;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shortman.mc.NeedToSleep;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ModItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(NeedToSleep.MOD_ID, Registries.ITEM);



    public static void init() {
        ITEMS.register();
    }

    public static RegistrySupplier<Item> registerItem(String name, Supplier<Item> item){
        return ITEMS.register(ResourceLocation.fromNamespaceAndPath(NeedToSleep.MOD_ID, name), item);
    }

    public static Item.Properties baseProperties(String name){
        return new Item.Properties.getId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(NeedToSleep.MOD_ID, name)));
    }
}
