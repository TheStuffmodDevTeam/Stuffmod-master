package net.hacker.stuffmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hacker.stuffmod.block.ModBlocks;
import net.hacker.stuffmod.util.ModTags;
import net.hacker.stuffmod.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKST1)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COAL_ORES)
                .add(ModBlocks.LAOC_ORE)
                .add(ModBlocks.DEEPSLATE_LAOC_ORE)
                .forceAddTag(BlockTags.COPPER_ORES);

        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKST2)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES);

        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKST3)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                        .add(ModBlocks.EEEE_ORE)
                        .add(ModBlocks.DEEPSLATE_EEEE_ORE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.FIREY_VOID_LOG)
                .add(ModBlocks.STRIPPED_FIREY_VOID_LOG)
                .add(ModBlocks.STRIPPED_FIREY_VOID_WOOD)
                .add(ModBlocks.FIREY_VOID_WOOD);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.EEEE_BLOCK)
                .add(ModBlocks.DEEPSLATE_EEEE_ORE)
                .add(ModBlocks.LAOC_ORE)
                .add(ModBlocks.DEEPSLATE_EEEE_ORE)
                .add(ModBlocks.LAOC_BLOCK)
                .add(ModBlocks.DEEPSLATE_LAOC_ORE)
                .add(ModBlocks.EEEE_INGOT_BLOCK)
                .add(ModBlocks.EEEE_MEDALIEAN_BLOCK)
                .add(ModBlocks.EEEE_ORE)
                .add(ModBlocks.ENDERITE_ORE)
                .add(ModBlocks.ENDERITE_INGOT_BLOCK)
                .add(ModBlocks.ENDERITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.STRIPPED_FIREY_VOID_LOG)
                .add(ModBlocks.STRIPPED_FIREY_VOID_WOOD)
                .add(ModBlocks.FIREY_VOID_PLANKS)
                .add(ModBlocks.FIREY_VOID_LOG)
                .add(ModBlocks.FIREY_VOID_WOOD)
                .add(ModBlocks.FIREY_VOID_SLAB)
                .add(ModBlocks.FIREY_VOID_STAIRS)
                .add(ModBlocks.FIREY_VOID_DOOR)
                .add(ModBlocks.FIREY_VOID_TRAPDOOR)
                .add(ModBlocks.FIREY_VOID_BUTTON)
                .add(ModBlocks.FIREY_VOID_FENCE)
                .add(ModBlocks.FIREY_VOID_FENCE_GATE)
                .add(ModBlocks.FIREY_VOID_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);


        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.EEEE_BLOCK)
                .add(ModBlocks.DEEPSLATE_EEEE_ORE)
                .add(ModBlocks.EEEE_INGOT_BLOCK)
                .add(ModBlocks.EEEE_ORE)
                .add(ModBlocks.ENDERITE_ORE)
                .add(ModBlocks.ENDERITE_INGOT_BLOCK)
                .add(ModBlocks.ENDERITE_BLOCK);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.EEEE_MEDALIEAN_BLOCK)
                .add(ModBlocks.DEALER_TABLE);


        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.FIREY_VOID_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.FIREY_VOID_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.FIREY_VOID_WALL);
    }
}
