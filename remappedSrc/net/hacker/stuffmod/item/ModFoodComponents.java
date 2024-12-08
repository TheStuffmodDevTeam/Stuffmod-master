package net.hacker.stuffmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent EEEEAPPLE = new FoodComponent.Builder().hunger(10).saturationModifier(0.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 10), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2400, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2400, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2400, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2400, 3), 1.0f)
            .alwaysEdible().build();
    public static final FoodComponent CHOKLETCHIP_COOKIE = new FoodComponent.Builder().hunger(11).saturationModifier(1.0f)
            .build();


}
