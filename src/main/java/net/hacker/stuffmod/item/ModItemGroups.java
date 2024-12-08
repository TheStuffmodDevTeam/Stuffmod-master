package net.hacker.stuffmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hacker.stuffmod.StuffMod;
import net.hacker.stuffmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup EEEE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(StuffMod.MOD_ID, "eeee"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eeee"))
                    .icon(() -> new ItemStack(ModItems.EEEE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.EEEE);
                        entries.add(ModItems.EEEE_HELMET);
                        entries.add(ModItems.EEEE_CHESTPLATE);
                        entries.add(ModItems.EEEE_LEGGINGS);
                        entries.add(ModItems.EEEE_BOOTS);
                        entries.add(ModItems.EEEE_AXE);
                        entries.add(ModItems.EEEE_PICKAXE);
                        entries.add(ModItems.EEEE_HOE);
                        entries.add(ModItems.EEEE_SCYTHE);
                        entries.add(ModItems.EEEE_SWORD);
                        entries.add(ModItems.EEEE_SHOVEL);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.ENDERITE_SHOVEL);
                        entries.add(ModItems.ENDERITE_AXE);
                        entries.add(ModItems.ENDERITE_PICKAXE);
                        entries.add(ModItems.ENDERITE_HOE);
                        entries.add(ModItems.ENDERITE_SWORD);
                        entries.add(ModItems.ENDERITE_INGOT);
                        entries.add(ModItems.ENDERITE);
                        entries.add(ModItems.ENDERITE_HELMET);
                        entries.add(ModItems.ENDERITE_CHESTPLATE);
                        entries.add(ModItems.ENDERITE_LEGGINGS);
                        entries.add(ModItems.ENDERITE_BOOTS);
                        entries.add(ModBlocks.ENDERITE_BLOCK);
                        entries.add(ModBlocks.ENDERITE_INGOT_BLOCK);
                        entries.add(ModBlocks.ENDERITE_ORE);

                        entries.add(ModBlocks.FIREY_VOID_LEAVES);
                        entries.add(ModBlocks.FIREY_VOID_LOG);
                        entries.add(ModBlocks.FIREY_VOID_PLANKS);
                        entries.add(ModBlocks.FIREY_VOID_WOOD);
                        entries.add(ModBlocks.STRIPPED_FIREY_VOID_LOG);
                        entries.add(ModBlocks.STRIPPED_FIREY_VOID_WOOD);
                        entries.add(ModBlocks.FIREY_VOID_SAPLING);

                        entries.add(ModBlocks.FIREY_VOID_BUTTON);
                        entries.add(ModBlocks.FIREY_VOID_PRESSURE_PLATE);
                        entries.add(ModBlocks.FIREY_VOID_STAIRS);
                        entries.add(ModBlocks.FIREY_VOID_SLAB);
                        entries.add(ModBlocks.FIREY_VOID_DOOR);
                        entries.add(ModBlocks.FIREY_VOID_TRAPDOOR);
                        entries.add(ModBlocks.FIREY_VOID_FENCE);
                        entries.add(ModBlocks.FIREY_VOID_FENCE_GATE);
                        entries.add(ModBlocks.FIREY_VOID_WALL);

                        entries.add(ModBlocks.ICEE_VOID_LEAVES);
                        entries.add(ModBlocks.ICEE_VOID_LOG);
                        entries.add(ModBlocks.ICEE_VOID_PLANKS);
                        entries.add(ModBlocks.ICEE_VOID_WOOD);
                        entries.add(ModBlocks.STRIPPED_ICEE_VOID_LOG);
                        entries.add(ModBlocks.STRIPPED_ICEE_VOID_WOOD);

                        entries.add(ModBlocks.ICEE_VOID_BUTTON);
                        entries.add(ModBlocks.ICEE_VOID_PRESSURE_PLATE);
                        entries.add(ModBlocks.ICEE_VOID_STAIRS);
                        entries.add(ModBlocks.ICEE_VOID_SLAB);
                        entries.add(ModBlocks.ICEE_VOID_DOOR);
                        entries.add(ModBlocks.ICEE_VOID_TRAPDOOR);
                        entries.add(ModBlocks.ICEE_VOID_FENCE);
                        entries.add(ModBlocks.ICEE_VOID_FENCE_GATE);
                        entries.add(ModBlocks.ICEE_VOID_WALL);

                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.EMERALD_SWORD);
                        entries.add(ModItems.EMERALD_BOOTS);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_HELMET);

                        entries.add(ModItems.LAOC);
                        entries.add(ModItems.EEEEAPPLE);
                        entries.add(ModItems.METAL_DETECTORT1);
                        entries.add(ModItems.METAL_DETECTORT2);
                        entries.add(ModItems.METAL_DETECTORT3);
                        entries.add(ModItems.DIAMOND_ROD);
                        entries.add(ModItems.EEEE_INGOT);
                        entries.add(ModItems.EEEE_MADALIEAN);
                        entries.add(ModBlocks.EEEE_BLOCK);
                        entries.add(ModBlocks.DEALER_TABLE);
                        entries.add(ModBlocks.EEEE_MEDALIEAN_BLOCK);
                        entries.add(ModBlocks.EEEE_ORE);
                        entries.add(ModBlocks.LAOC_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LAOC_ORE);
                        entries.add(ModBlocks.LAOC_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_EEEE_ORE);
                        entries.add(ModBlocks.EEEE_INGOT_BLOCK);
                        entries.add(ModBlocks.CORSE_END_DIRT);


                    }).build());

    public static void registerItemgroups () {
        StuffMod.LOGGER.info("Registering itemgroups for " + StuffMod.MOD_ID);
    }
}
