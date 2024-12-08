package net.hacker.stuffmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hacker.stuffmod.block.ModBlocks;
import net.hacker.stuffmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput)  {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.EEEE_BLOCK);

        addDrop(ModBlocks.FIREY_VOID_LOG);
        addDrop(ModBlocks.FIREY_VOID_PLANKS);
        addDrop(ModBlocks.FIREY_VOID_WOOD);
        addDrop(ModBlocks.STRIPPED_FIREY_VOID_LOG);
        addDrop(ModBlocks.STRIPPED_FIREY_VOID_WOOD);
        addDrop(ModBlocks.FIREY_VOID_LEAVES, leavesDrops(ModBlocks.FIREY_VOID_LEAVES, ModBlocks.FIREY_VOID_SAPLING, 0.005f));

        addDrop(ModBlocks.FIREY_VOID_TRAPDOOR);
        addDrop(ModBlocks.FIREY_VOID_STAIRS);
        addDrop(ModBlocks.FIREY_VOID_BUTTON);
        addDrop(ModBlocks.FIREY_VOID_WALL);
        addDrop(ModBlocks.FIREY_VOID_FENCE);
        addDrop(ModBlocks.FIREY_VOID_FENCE_GATE);
        addDrop(ModBlocks.FIREY_VOID_PRESSURE_PLATE);

        addDrop(ModBlocks.FIREY_VOID_DOOR, doorDrops(ModBlocks.FIREY_VOID_DOOR));
        addDrop(ModBlocks.FIREY_VOID_SLAB, slabDrops(ModBlocks.FIREY_VOID_SLAB));

        addDrop(ModBlocks.ICEE_VOID_LOG);
        addDrop(ModBlocks.ICEE_VOID_PLANKS);
        addDrop(ModBlocks.ICEE_VOID_WOOD);
        addDrop(ModBlocks.STRIPPED_ICEE_VOID_LOG);
        addDrop(ModBlocks.STRIPPED_ICEE_VOID_WOOD);
        addDrop(ModBlocks.ICEE_VOID_LEAVES, leavesDrops(ModBlocks.ICEE_VOID_LEAVES, ModBlocks.ICEE_VOID_SAPLING, 0.005f)); //TODO

        addDrop(ModBlocks.ICEE_VOID_TRAPDOOR);
        addDrop(ModBlocks.ICEE_VOID_STAIRS);
        addDrop(ModBlocks.ICEE_VOID_BUTTON);
        addDrop(ModBlocks.ICEE_VOID_WALL);
        addDrop(ModBlocks.ICEE_VOID_FENCE);
        addDrop(ModBlocks.ICEE_VOID_FENCE_GATE);
        addDrop(ModBlocks.ICEE_VOID_PRESSURE_PLATE);

        addDrop(ModBlocks.ICEE_VOID_DOOR, doorDrops(ModBlocks.ICEE_VOID_DOOR));
        addDrop(ModBlocks.ICEE_VOID_SLAB, slabDrops(ModBlocks.ICEE_VOID_SLAB));

        addDrop(ModBlocks.EEEE_MEDALIEAN_BLOCK);
        addDrop(ModBlocks.EEEE_INGOT_BLOCK);
        addDrop(ModBlocks.ENDERITE_BLOCK);
        addDrop(ModBlocks.ENDERITE_INGOT_BLOCK);
        addDrop(ModBlocks.EEEE_ORE, oredropscoustom(ModBlocks.EEEE_ORE, ModItems.EEEE, 1f, 1f));
        addDrop(ModBlocks.ENDERITE_ORE, oredropscoustom(ModBlocks.ENDERITE_ORE, ModItems.ENDERITE, 1f, 1f));
        addDrop(ModBlocks.DEEPSLATE_EEEE_ORE, oredropscoustom(ModBlocks.DEEPSLATE_EEEE_ORE, ModItems.EEEE, 1f, 1f));
        addDrop(ModBlocks.LAOC_ORE, oredropscoustom(ModBlocks.LAOC_ORE, ModItems.LAOC, 3f, 8f));
        addDrop(ModBlocks.DEEPSLATE_LAOC_ORE, oredropscoustom(ModBlocks.DEEPSLATE_LAOC_ORE, ModItems.LAOC, 4f, 9f));
    }

    public LootTable.Builder oredropscoustom(Block drop, Item item, Float mindrop, Float maxdrop) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ItemEntry.builder(item)
                        .apply(SetCountLootFunction
                                .builder(UniformLootNumberProvider.create(mindrop, maxdrop)))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
