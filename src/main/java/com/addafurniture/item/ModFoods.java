package com.addafurniture.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoods {

    public static final FoodComponent WATER_BOTTLE = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60, 0), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent BEER = new FoodComponent.Builder()
            .hunger(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 0), 0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0), 0.5f)
            .alwaysEdible()
            .build();

    public static final FoodComponent COLD_DRINK = new FoodComponent.Builder()
            .hunger(2).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 300, 0), 0.6f)
            .alwaysEdible()
            .build();

    public static final FoodComponent COFFEE = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 400, 0), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent JUICE = new FoodComponent.Builder()
            .hunger(3).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 80, 0), 0.8f)
            .alwaysEdible()
            .build();

    public static final FoodComponent GREEN_TEA = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 120, 1), 0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200, 0), 0.5f)
            .alwaysEdible()
            .build();

    public static final FoodComponent ENERGY_DRINK = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0), 0.8f)
            .alwaysEdible()
            .build();

    public static final FoodComponent BURGER = new FoodComponent.Builder()
            .hunger(8).saturationModifier(0.8f)
            .build();

    public static final FoodComponent PIZZA = new FoodComponent.Builder()
            .hunger(6).saturationModifier(0.6f)
            .build();

    public static final FoodComponent SAMOSA = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.5f)
            .build();

    public static final FoodComponent BIRYANI = new FoodComponent.Builder()
            .hunger(10).saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 0.7f)
            .build();
}
