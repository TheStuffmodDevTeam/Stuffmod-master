package net.hacker.stuffmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hacker.stuffmod.StuffMod;
import net.hacker.stuffmod.item.custom.EEEEMadaliean;
import net.hacker.stuffmod.item.custom.MetalDetectorItemT1;
import net.hacker.stuffmod.item.custom.MetalDetectorItemT2;
import net.hacker.stuffmod.item.custom.MetalDetectorItemT3;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item EEEE = registerItem("eeee", new Item(new FabricItemSettings()));
    public static final Item THEHIDDENONE = registerItem("thehiddenone", new Item(new FabricItemSettings()));
    public static final Item LAOC = registerItem("laoc", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_ROD = registerItem("diamond_rod", new Item(new FabricItemSettings()));
    public static final Item EEEE_INGOT = registerItem("eeee_ingot", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new FabricItemSettings()));
    public static final Item ENDERITE = registerItem("enderite", new Item(new FabricItemSettings()));
    public static final Item EEEEAPPLE = registerItem("eeee_apple", new Item(new FabricItemSettings().food(ModFoodComponents.EEEEAPPLE)));


    public static final Item EEEE_MADALIEAN = registerItem("eeee_madaliean",
            new EEEEMadaliean(new FabricItemSettings().maxDamage(69)));
    public static final Item METAL_DETECTORT1 = registerItem("metal_detector_1",
            new MetalDetectorItemT1(new FabricItemSettings().maxDamage(64)));
    public static final Item METAL_DETECTORT2 = registerItem("metal_detector_2",
            new MetalDetectorItemT2(new FabricItemSettings().maxDamage(128)));
    public static final Item METAL_DETECTORT3 = registerItem("metal_detector_3",
            new MetalDetectorItemT3(new FabricItemSettings().maxDamage(256)));

    //TOOLS
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(ModToolMaterial.COPPER, 3, 3f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe", new AxeItem(ModToolMaterial.COPPER, 3f, 3f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterial.COPPER, 3, 3f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterial.COPPER, 3f, 3f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new HoeItem(ModToolMaterial.COPPER, 0, 3f, new FabricItemSettings()));

    public static final Item EEEE_PICKAXE = registerItem("eeee_pickaxe", new PickaxeItem(ModToolMaterial.EEEE, 1, 3f, new FabricItemSettings()));
    public static final Item EEEE_AXE = registerItem("eeee_axe", new AxeItem(ModToolMaterial.EEEE, 8f, 3f, new FabricItemSettings()));
    public static final Item EEEE_SWORD = registerItem("eeee_sword", new SwordItem(ModToolMaterial.EEEE, 10, 6f, new FabricItemSettings()));
    public static final Item EEEE_SHOVEL = registerItem("eeee_shovel", new ShovelItem(ModToolMaterial.EEEE, 1f, 3f, new FabricItemSettings()));
    public static final Item EEEE_HOE = registerItem("eeee_hoe", new HoeItem(ModToolMaterial.EEEE, 0, 3f, new FabricItemSettings()));
    public static final Item EEEE_SCYTHE = registerItem("eeee_scythe", new SwordItem(ModToolMaterial.EEEE, 16, 2f, new FabricItemSettings()));

    public static final Item ENDERITE_AXE = registerItem("enderite_axe", new AxeItem(ModToolMaterial.ENDERITE, 8f, 2f, new FabricItemSettings()));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe", new PickaxeItem(ModToolMaterial.ENDERITE, 5, 2f, new FabricItemSettings()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel", new ShovelItem(ModToolMaterial.ENDERITE, 5, 2f, new FabricItemSettings()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe", new HoeItem(ModToolMaterial.ENDERITE, 5, 2f, new FabricItemSettings()));
    public static final Item ENDERITE_SWORD = registerItem("enderite_sword", new SwordItem(ModToolMaterial.ENDERITE, 9, 2f, new FabricItemSettings()));

    public static final Item EMERALD_AXE = registerItem("emerald_axe", new AxeItem(ModToolMaterial.EMERALD, 5, 2f, new FabricItemSettings()));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(ModToolMaterial.EMERALD, 5, 2f, new FabricItemSettings()));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(ModToolMaterial.EMERALD, 5, 2f, new FabricItemSettings()));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", new HoeItem(ModToolMaterial.EMERALD, 5, 2f, new FabricItemSettings()));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ModToolMaterial.EMERALD, 5, 2f, new FabricItemSettings()));

    public static final Item EEEE_HELMET = registerItem("eeee_helmet",
            new ArmorItem(ModArmorMaterials.EEEE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item EEEE_CHESTPLATE = registerItem("eeee_chestplate",
            new ArmorItem(ModArmorMaterials.EEEE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item EEEE_LEGGINGS = registerItem("eeee_leggings",
            new ArmorItem(ModArmorMaterials.EEEE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item EEEE_BOOTS = registerItem("eeee_boots",
            new ArmorItem(ModArmorMaterials.EEEE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
            new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static void additemstoingredentgroup(FabricItemGroupEntries entries) {
        entries.add(EEEE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(StuffMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        StuffMod.LOGGER.info("registering mod items for " + StuffMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::additemstoingredentgroup);
    }
}
