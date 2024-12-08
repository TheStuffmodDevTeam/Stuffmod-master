package net.hacker.stuffmod.enchantment;

import net.hacker.stuffmod.StuffMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static Enchantment ACENTM_PIGER = register("acem_tm_piger",
            new ACEMTM_PigerEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(StuffMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        StuffMod.LOGGER.info("Registering Enchantments for " + StuffMod.MOD_ID);
    }
}
