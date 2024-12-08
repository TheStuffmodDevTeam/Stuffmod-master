package net.hacker.stuffmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.hacker.stuffmod.world.ModPlacedFeatures;
import net.hacker.stuffmod.world.biome.ModBiomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGenoration {

    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.END_PLANES_BIOME    ),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FIREY_VOID_PLACED_KEY);
    }
}
