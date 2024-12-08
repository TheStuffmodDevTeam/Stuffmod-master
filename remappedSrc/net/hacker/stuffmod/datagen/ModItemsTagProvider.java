package net.hacker.stuffmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hacker.stuffmod.block.ModBlocks;
import net.hacker.stuffmod.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemsTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.EEEE_HELMET, ModItems.EEEE_CHESTPLATE, ModItems.EEEE_LEGGINGS, ModItems.EEEE_BOOTS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.FIREY_VOID_PLANKS.asItem());


        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.FIREY_VOID_LOG.asItem())
                .add(ModBlocks.STRIPPED_FIREY_VOID_LOG.asItem())
                .add(ModBlocks.STRIPPED_FIREY_VOID_WOOD.asItem())
                .add(ModBlocks.FIREY_VOID_WOOD.asItem());

    }
}
