package me.shortman.mc.neoforge;

import net.neoforged.fml.common.Mod;

import me.shortman.mc.NeedToSleep;

@Mod(NeedToSleep.MOD_ID)
public final class NeedToSleepForge {
    public NeedToSleepForge() {
        // Run our common setup.
        NeedToSleep.init();
    }
}
