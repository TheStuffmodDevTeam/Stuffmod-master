package net.hacker.stuffmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.hacker.stuffmod.world.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {

    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.EEEE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LAOC_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ENDERITE_ORE_PLACED_KEY);
    }
}
