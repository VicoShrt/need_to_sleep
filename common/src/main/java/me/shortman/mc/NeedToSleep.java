package me.shortman.mc;

import net.minecraft.resources.ResourceLocation;

public final class NeedToSleep {
    public static final String MOD_ID = "need_to_sleep";

    public static ResourceLocation res(String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }

    public static void init() {
        // Write common init code here.
    }
}
