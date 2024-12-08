package net.hacker.stuffmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.hacker.stuffmod.block.ModBlocks;
import net.hacker.stuffmod.datagen.ModWorldGenorator;
import net.hacker.stuffmod.enchantment.ModEnchantments;
import net.hacker.stuffmod.item.ModItemGroups;
import net.hacker.stuffmod.item.ModItems;
import net.hacker.stuffmod.sound.ModSounds;
import net.hacker.stuffmod.util.ModCustomTrades;
import net.hacker.stuffmod.util.ModLootTableModifiers;
import net.hacker.stuffmod.villager.ModVillagers;
import net.hacker.stuffmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class StuffMod implements ModInitializer {
    public static final String MOD_ID = "stuffmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	Random rn = new Random();
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemgroups();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyloottables();
		ModSounds.registerSounds();
		ModCustomTrades.RegisterCustomTrades();

		ModVillagers.registerModVillagers();
		ModWorldGeneration.generateModWorldGen();
		ModEnchantments.registerModEnchantments();


		FuelRegistry.INSTANCE.add(ModItems.LAOC, 1000);
		FuelRegistry.INSTANCE.add(ModBlocks.LAOC_BLOCK, 10000);

		StrippableBlockRegistry.register(ModBlocks.FIREY_VOID_LOG, ModBlocks.STRIPPED_FIREY_VOID_LOG);
		StrippableBlockRegistry.register(ModBlocks.FIREY_VOID_WOOD, ModBlocks.STRIPPED_FIREY_VOID_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIREY_VOID_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_FIREY_VOID_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIREY_VOID_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_FIREY_VOID_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIREY_VOID_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FIREY_VOID_LEAVES, 30, 60);

		StrippableBlockRegistry.register(ModBlocks.ICEE_VOID_LOG, ModBlocks.STRIPPED_ICEE_VOID_LOG);
		StrippableBlockRegistry.register(ModBlocks.ICEE_VOID_WOOD, ModBlocks.STRIPPED_ICEE_VOID_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ICEE_VOID_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ICEE_VOID_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ICEE_VOID_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ICEE_VOID_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ICEE_VOID_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ICEE_VOID_LEAVES, 30, 60);
	}
}