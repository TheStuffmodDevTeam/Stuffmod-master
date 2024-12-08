package net.hacker.stuffmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hacker.stuffmod.StuffMod;
import net.hacker.stuffmod.block.custom.EEEEMEDALIEANBLOCK;
import net.hacker.stuffmod.world.tree.ModSaplingGenorators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //STUFF

    public static final Block EEEE_BLOCK = registerBlock("eeee_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block CORSE_END_DIRT = registerBlock("corse_end_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ENDERITE_INGOT_BLOCK = registerBlock("enderite_ingot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block DEALER_TABLE = registerBlock("dealer_table",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block EEEE_ORE = registerBlock("eeee_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block DEEPSLATE_EEEE_ORE = registerBlock("deepslate_eeee_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final Block EEEE_INGOT_BLOCK = registerBlock("eeee_ingot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block LAOC_BLOCK = registerBlock("laoc_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
    public static final Block LAOC_ORE = registerBlock("laoc_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
    public static final Block DEEPSLATE_LAOC_ORE = registerBlock("deepslate_laoc_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));

    public static final Block EEEE_MEDALIEAN_BLOCK = registerBlock("eeee_medaliean_block",
            new EEEEMEDALIEANBLOCK(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    //WOOD AND TREE STUFF

    public static final Block FIREY_VOID_LOG = registerBlock("firey_void_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2f)));
    public static final Block FIREY_VOID_WOOD = registerBlock("firey_void_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2f)));
    public static final Block STRIPPED_FIREY_VOID_LOG = registerBlock("stripped_firey_void_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2f)));
    public static final Block STRIPPED_FIREY_VOID_WOOD = registerBlock("stripped_firey_void_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2f)));
    public static final Block FIREY_VOID_PLANKS = registerBlock("firey_void_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2f)));
    public static final Block FIREY_VOID_LEAVES = registerBlock("firey_void_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(2f).nonOpaque()));
    public static final Block FIREY_VOID_SAPLING = registerBlock("firey_void_sapling",
            new SaplingBlock(ModSaplingGenorators.VOIDFIREY, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(2f).nonOpaque()));

    public static final Block ICEE_VOID_LOG = registerBlock("icee_void_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2f)));
    public static final Block ICEE_VOID_WOOD = registerBlock("icee_void_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2f)));
    public static final Block STRIPPED_ICEE_VOID_LOG = registerBlock("stripped_icee_void_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2f)));
    public static final Block STRIPPED_ICEE_VOID_WOOD = registerBlock("stripped_icee_void_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2f)));
    public static final Block ICEE_VOID_PLANKS = registerBlock("icee_void_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2f)));
    public static final Block ICEE_VOID_LEAVES = registerBlock("icee_void_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(2f).nonOpaque()));
    public static final Block ICEE_VOID_SAPLING = registerBlock("icee_void_sapling",
            new SaplingBlock(ModSaplingGenorators.VOIDICEE, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(2f).nonOpaque()));


    //NON BLOCK BLOCKS

    public static final Block FIREY_VOID_STAIRS = registerBlock("firey_void_stairs",
            new StairsBlock(ModBlocks.FIREY_VOID_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block FIREY_VOID_SLAB = registerBlock("firey_void_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREY_VOID_BUTTON = registerBlock("firey_void_button",
            new ButtonBlock(BlockSetType.IRON, 1, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREY_VOID_PRESSURE_PLATE = registerBlock("firey_void_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREY_VOID_FENCE = registerBlock("firey_void_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREY_VOID_FENCE_GATE = registerBlock("firey_void_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREY_VOID_WALL = registerBlock("firey_void_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREY_VOID_DOOR = registerBlock("firey_void_door",
            new DoorBlock(BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block FIREY_VOID_TRAPDOOR = registerBlock("firey_void_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block ICEE_VOID_STAIRS = registerBlock("icee_void_stairs",
            new StairsBlock(ModBlocks.ICEE_VOID_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block ICEE_VOID_SLAB = registerBlock("icee_void_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ICEE_VOID_BUTTON = registerBlock("icee_void_button",
            new ButtonBlock(BlockSetType.IRON, 1, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ICEE_VOID_PRESSURE_PLATE = registerBlock("icee_void_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ICEE_VOID_FENCE = registerBlock("icee_void_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ICEE_VOID_FENCE_GATE = registerBlock("icee_void_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ICEE_VOID_WALL = registerBlock("icee_void_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ICEE_VOID_DOOR = registerBlock("icee_void_door",
            new DoorBlock(BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block ICEE_VOID_TRAPDOOR = registerBlock("icee_void_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));



    public static final Block FIREY_VOID_GRASS = registerBlock("firey_void_grass",
            new GrassBlock(FabricBlockSettings.copyOf(Blocks.SHORT_GRASS).strength(0f).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(StuffMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(StuffMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        StuffMod.LOGGER.info("Registering Mod Blocks For " + StuffMod.MOD_ID);
    }
}
