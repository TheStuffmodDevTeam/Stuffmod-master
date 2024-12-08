package net.hacker.stuffmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hacker.stuffmod.block.ModBlocks;
import net.hacker.stuffmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_EEEE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EEEE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_INGOT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAOC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAOC_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LAOC_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EEEE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EEEE_MEDALIEAN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EEEE_INGOT_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.FIREY_VOID_LOG).log(ModBlocks.FIREY_VOID_LOG).wood(ModBlocks.FIREY_VOID_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_FIREY_VOID_LOG).log(ModBlocks.STRIPPED_FIREY_VOID_LOG).wood(ModBlocks.STRIPPED_FIREY_VOID_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIREY_VOID_LEAVES);
        BlockStateModelGenerator.BlockTexturePool fireyVoidPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIREY_VOID_PLANKS);

        fireyVoidPlanksPool.stairs(ModBlocks.FIREY_VOID_STAIRS);
        fireyVoidPlanksPool.button(ModBlocks.FIREY_VOID_BUTTON);
        fireyVoidPlanksPool.slab(ModBlocks.FIREY_VOID_SLAB);
        fireyVoidPlanksPool.wall(ModBlocks.FIREY_VOID_WALL);
        fireyVoidPlanksPool.fence(ModBlocks.FIREY_VOID_FENCE);
        fireyVoidPlanksPool.fenceGate(ModBlocks.FIREY_VOID_FENCE_GATE);
        fireyVoidPlanksPool.pressurePlate(ModBlocks.FIREY_VOID_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.FIREY_VOID_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FIREY_VOID_TRAPDOOR);

        blockStateModelGenerator.registerLog(ModBlocks.ICEE_VOID_LOG).log(ModBlocks.ICEE_VOID_LOG).wood(ModBlocks.ICEE_VOID_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ICEE_VOID_LOG).log(ModBlocks.STRIPPED_ICEE_VOID_LOG).wood(ModBlocks.STRIPPED_ICEE_VOID_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICEE_VOID_LEAVES);
        BlockStateModelGenerator.BlockTexturePool iceeVoidPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ICEE_VOID_PLANKS);

        iceeVoidPlanksPool.stairs(ModBlocks.ICEE_VOID_STAIRS);
        iceeVoidPlanksPool.button(ModBlocks.ICEE_VOID_BUTTON);
        iceeVoidPlanksPool.slab(ModBlocks.ICEE_VOID_SLAB);
        iceeVoidPlanksPool.wall(ModBlocks.ICEE_VOID_WALL);
        iceeVoidPlanksPool.fence(ModBlocks.ICEE_VOID_FENCE);
        iceeVoidPlanksPool.fenceGate(ModBlocks.ICEE_VOID_FENCE_GATE);
        iceeVoidPlanksPool.pressurePlate(ModBlocks.ICEE_VOID_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ICEE_VOID_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ICEE_VOID_TRAPDOOR);



        blockStateModelGenerator.registerTintableCross(ModBlocks.FIREY_VOID_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.EEEEAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THEHIDDENONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EEEE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAOC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.EEEE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.EEEE_MADALIEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTORT1, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTORT2, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTORT3, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_INGOT, Models.GENERATED);



        itemModelGenerator.register(ModItems.EEEE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EEEE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EEEE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EEEE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EEEE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EEEE_SCYTHE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ENDERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EEEE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EEEE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EEEE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EEEE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_HELMET));


    }
}
