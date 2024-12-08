package net.hacker.stuffmod.world.biome;

import net.hacker.stuffmod.StuffMod;
import net.minecraft.client.sound.MusicType;
import net.minecraft.client.sound.Sound;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;


public class ModBiomes {
    public static final RegistryKey<Biome> END_WASTE_BIOME = RegistryKey.of(RegistryKeys.BIOME, new Identifier(StuffMod.MOD_ID, "end_waste_biome"));
    public static final RegistryKey<Biome> END_PLANES_BIOME = RegistryKey.of(RegistryKeys.BIOME, new Identifier(StuffMod.MOD_ID, "end_planes_biome"));

    public static void bootstrap(Registerable<Biome> context) {
        context.register(END_WASTE_BIOME, endwastebiome(context));
        context.register(END_PLANES_BIOME, endplanesbiome(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome endplanesbiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 8, 20));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);


        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xb300ff)
                        .waterFogColor(0xb300ff)
                        .skyColor(0x000000)
                        .grassColor(0xb58516)
                        .foliageColor(0xb300ff)
                        .fogColor(0xb300ff)
                        .moodSound(BiomeMoodSound.CAVE)
                        .music(MusicType.createIngameMusic(RegistryEntry.of(SoundEvents.ENTITY_ENDERMAN_SCREAM))).build())
                .build();
    }

    public static Biome endwastebiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 8, 20));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));


        //biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.TREES_PLAINS); //TODO
        DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);


        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xe82e3b)
                        .waterFogColor(0xbf1b26)
                        .skyColor(0x30c918)
                        .grassColor(0x7f03fc)
                        .foliageColor(0xd203fc)
                        .fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE)
                        .music(MusicType.createIngameMusic(RegistryEntry.of(SoundEvents.ENTITY_ENDERMAN_SCREAM))).build())
                .build();
    }

}
