//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.hacker.stuffmod.world.structures;

import java.util.Map;

import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.structure.PlainsVillageData;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.world.StructureSpawns;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.StructureTerrainAdaptation;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.GenerationStep.Feature;
import net.minecraft.world.gen.heightprovider.ConstantHeightProvider;
import net.minecraft.world.gen.structure.*;

public class ModStructures {
    public ModStructures() {
    }

    public static Structure.Config createConfig(RegistryEntryList<Biome> biomes, Map<SpawnGroup, StructureSpawns> spawns, GenerationStep.Feature featureStep, StructureTerrainAdaptation terrainAdaptation) {
        return new Structure.Config(biomes, spawns, featureStep, terrainAdaptation);
    }

    private static Structure.Config createConfig(RegistryEntryList<Biome> biomes, GenerationStep.Feature featureStep, StructureTerrainAdaptation terrainAdaptation) {
        return createConfig(biomes, Map.of(), featureStep, terrainAdaptation);
    }

    private static Structure.Config createConfig(RegistryEntryList<Biome> biomes, StructureTerrainAdaptation terrainAdaptation) {
        return createConfig(biomes, Map.of(), Feature.SURFACE_STRUCTURES, terrainAdaptation);
    }

    public static void bootstrap(Registerable<Structure> structureRegisterable) {
        RegistryEntryLookup<Biome> registryEntryLookup = structureRegisterable.getRegistryLookup(RegistryKeys.BIOME);
        RegistryEntryLookup<StructurePool> registryEntryLookup2 = structureRegisterable.getRegistryLookup(RegistryKeys.TEMPLATE_POOL);

        structureRegisterable.register(ModStructureKeys.VILLAGE_HOTTS, new ModJigsawStructure(createConfig(registryEntryLookup.getOrThrow(BiomeTags.VILLAGE_PLAINS_HAS_STRUCTURE), StructureTerrainAdaptation.BEARD_THIN), registryEntryLookup2.getOrThrow(PlainsVillageData.TOWN_CENTERS_KEY), 6, ConstantHeightProvider.create(YOffset.fixed(0)), true, Type.WORLD_SURFACE_WG));
        }
}
