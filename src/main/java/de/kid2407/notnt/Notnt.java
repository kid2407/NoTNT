package de.kid2407.notnt;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Notnt.MOD_ID, name = Notnt.MOD_NAME, version = Notnt.VERSION, acceptableRemoteVersions = "*")
public class Notnt {

    public static final String MOD_ID = "notnt";
    public static final String MOD_NAME = "Notnt";
    public static final String VERSION = "1.0.0";

    public Notnt() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onExplosion(ExplosionEvent.Start explosionEvent) {
        explosionEvent.setCanceled(true);
    }
}
