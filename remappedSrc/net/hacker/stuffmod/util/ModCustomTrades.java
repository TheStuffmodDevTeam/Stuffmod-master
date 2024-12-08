package net.hacker.stuffmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.hacker.stuffmod.item.ModItems;
import net.hacker.stuffmod.villager.ModVillagers;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {

    public static void RegisterCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.EEEE, 1),
                    new ItemStack(Items.EMERALD, 32),
                    4, 10, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.EEEE_INGOT, 1),
                    new ItemStack(Items.EMERALD, 64),
                    4, 20, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.EEEE_INGOT, 1),
                    new ItemStack(Items.EMERALD, 64),
                    4, 20, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EEEE_BOY, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.THEHIDDENONE, 1),
                    new ItemStack(Items.EMERALD_BLOCK, 127),
                    2, 20, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EEEE_BOY, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.THEHIDDENONE, 1),
                    new ItemStack(Items.GOLD_BLOCK, 127),
                    2, 20, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EEEE_BOY, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.THEHIDDENONE, 1),
                    new ItemStack(Items.DIAMOND_BLOCK, 127),
                    2, 20, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EEEE_BOY, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.THEHIDDENONE, 1),
                    new ItemStack(Items.NETHERITE_BLOCK, 127),
                    2, 20, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EEEE_BOY, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.THEHIDDENONE, 1),
                    new ItemStack(Items.BEACON, 127),
                    2, 20, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EEEE_BOY, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.THEHIDDENONE, 1),
                    new ItemStack(Items.SHULKER_SHELL, 127),
                    2, 20, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EEEE_BOY, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.THEHIDDENONE, 1),
                    new ItemStack(Items.ENDER_CHEST, 127),
                    2, 20, 0.09f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EEEE_BOY, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.THEHIDDENONE, 1),
                    new ItemStack(Items.OBSIDIAN, 127),
                    2, 20, 0.09f));
        });
    }
}
