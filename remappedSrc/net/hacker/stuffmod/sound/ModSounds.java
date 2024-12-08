package net.hacker.stuffmod.sound;

import net.hacker.stuffmod.StuffMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent WHY_DID_YOU_DO_THIS = registerSoundEvent("why_did_you_do_this");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(StuffMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        StuffMod.LOGGER.info("Registering Sounds for " + StuffMod.MOD_ID);
    }
}