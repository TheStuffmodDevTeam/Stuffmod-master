package net.hacker.stuffmod.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.hacker.stuffmod.item.ModItems;
import net.minecraft.advancement.*;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementsProvider extends FabricAdvancementProvider {
    public ModAdvancementsProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }
    @Override
    public void generateAdvancement(Consumer<AdvancementEntry> consumer) {
        AdvancementEntry rootAdvancement_eeee = Advancement.Builder.create()
                .display(
                        ModItems.EEEE, // The display icon
                        Text.literal("The Power Of EEEE"), // The title
                        Text.literal("Obtain some EEEE"), // The description
                        new Identifier("textures/gui/advancements/backgrounds/eeee.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("stuffmod:eeee_ingot_from_smelting_eeee_ore")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("stuffmod:eeee_ingot_from_blasting_eeee_ore")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("stuffmod:eeee_ingot_from_blasting_eeee")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("stuffmod:eeee_ingot_from_smelting_eeee")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("stuffmod:diamond_rod")))
                .criterion("got_eeee", InventoryChangedCriterion.Conditions.items(ModItems.EEEE))
                .build(consumer, "stuffmod" + "/root");


        AdvancementEntry gotEEEEIngotAdvancement = Advancement.Builder.create().parent(rootAdvancement_eeee)
                .display(
                        ModItems.EEEE_INGOT,
                        Text.literal("Acquire Superwere"),
                        Text.literal("Obtain an EEEE ingot"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_sword")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_axe")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_pickaxe")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_hoe")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_shovel")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_scythe")))
                .criterion("got_eeee_ingot", InventoryChangedCriterion.Conditions.items(ModItems.EEEE_INGOT))
                .build(consumer, "stuffmod" + "/got_eeee_ingot");

        AdvancementEntry gotEEEETools = Advancement.Builder.create().parent(gotEEEEIngotAdvancement)
                .display(
                        ModItems.EEEE_AXE,
                        Text.literal("Super Tools"),
                        Text.literal("Get a full set of glory filled EEEE tools"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_helmet")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_chestplate")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_leggings")))
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("eeee_boots")))
                .criterion("got_eeee_tools", InventoryChangedCriterion.Conditions.items(ModItems.EEEE_SHOVEL, ModItems.EEEE_SWORD, ModItems.EEEE_AXE, ModItems.EEEE_PICKAXE, ModItems.EEEE_HOE))
                .build(consumer, "stuffmod" + "/got_eeee_tools");

        AdvancementEntry gotEEEEArmour = Advancement.Builder.create().parent(gotEEEETools)
                .display(
                        ModItems.EEEE_CHESTPLATE,
                        Text.literal("Super Armour"),
                        Text.literal("Get a full st of glory filled EEEE armour"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("got_eeee_armour", InventoryChangedCriterion.Conditions.items(ModItems.EEEE_HELMET, ModItems.EEEE_CHESTPLATE, ModItems.EEEE_LEGGINGS, ModItems.EEEE_BOOTS))
                .build(consumer, "stuffmod" + "/got_eeee_armour");

        AdvancementEntry gotDIAMONDrodAdvancement = Advancement.Builder.create().parent(rootAdvancement_eeee)
                .display(
                        ModItems.DIAMOND_ROD,
                        Text.literal("The Longer The Better"),
                        Text.literal("Make a diamond rod"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("got_diamond", InventoryChangedCriterion.Conditions.items(ModItems.DIAMOND_ROD))
                .build(consumer, "stuffmod" + "/got_diamond");

        AdvancementEntry gotThehiddenone = Advancement.Builder.create().parent(gotDIAMONDrodAdvancement)
                .display(
                        ModItems.EEEE_CHESTPLATE,
                        Text.literal("Hidden In Plane Sight"),
                        Text.literal("find the hidden item (Its really OP) think villagers"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.recipe(new Identifier("totem_of_undying")))
                .criterion("got_the_hidden_one", InventoryChangedCriterion.Conditions.items(ModItems.THEHIDDENONE))
                .build(consumer, "stuffmod" + "/got_thehiddenone");

        AdvancementEntry OverPowerd = Advancement.Builder.create().parent(gotThehiddenone)
                .display(
                        ModItems.EEEE_CHESTPLATE,
                        Text.literal("Get 5 totems in a stack"),
                        Text.literal("find the hidden item in the hidden items (Its really OP) think the parent advancement"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("got_the_hidden_one_two", InventoryChangedCriterion.Conditions.items(Items.TOTEM_OF_UNDYING))
                .build(consumer, "stuffmod" + "/got_thehiddenone_two");

    }
}