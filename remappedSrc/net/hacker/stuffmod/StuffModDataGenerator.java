package net.hacker.stuffmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hacker.stuffmod.datagen.*;
import net.hacker.stuffmod.world.ModConfiguredFeatures;
import net.hacker.stuffmod.world.ModPlacedFeatures;
import net.hacker.stuffmod.world.biome.ModBiomes;
import net.hacker.stuffmod.world.biome.ModTerrablenderAPI;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.PlacedFeatures;

public class StuffModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModItemsTagProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModAdvancementsProvider::new);
		pack.addProvider(ModPoiTagProvider::new);
		pack.addProvider(ModWorldGenorator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, ModBiomes::bootstrap);
	}
}
