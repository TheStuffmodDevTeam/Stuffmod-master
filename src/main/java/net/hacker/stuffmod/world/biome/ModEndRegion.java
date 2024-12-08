package net.hacker.stuffmod.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.EndBiomeRegistry;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.Regions;

import java.util.function.Consumer;

public class ModEndRegion extends Region {

    public ModEndRegion(Identifier name, RegionType type, int weight) {
        super(name, type, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.END_HIGHLANDS, ModBiomes.END_WASTE_BIOME);
        });
    }
}
