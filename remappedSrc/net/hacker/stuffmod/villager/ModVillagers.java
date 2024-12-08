package net.hacker.stuffmod.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.hacker.stuffmod.StuffMod;
import net.hacker.stuffmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> EEEE_BOY_POI_KEY = poiKey("eeeeboypoi");
    public static final PointOfInterestType EEEE_BOY_POI = registerPoi("eeeeboypoi", ModBlocks.DEALER_TABLE);

    public static final VillagerProfession EEEE_BOY = registerProfession("eeeeboy", EEEE_BOY_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(StuffMod.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(StuffMod.MOD_ID, name), 1, 3, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(StuffMod.MOD_ID, name));
    }


    public static void registerModVillagers() {


        StuffMod.LOGGER.info("registering villagers for" + StuffMod.MOD_ID);
    }
}
