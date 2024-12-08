package net.hacker.stuffmod.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.hacker.stuffmod.item.ModItems;

public class ModLootTableModifiers {

    public static final Identifier END_CITY_ID =
            new Identifier("minecraft", "chest/end_city_treasure");

    public static void modifyloottables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.EEEE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());


                tableBuilder.pool(poolBuilder.build());
            }
            if(END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.20f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.EEEE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());


                tableBuilder.pool(poolBuilder.build());
            }
        });

    }
}
