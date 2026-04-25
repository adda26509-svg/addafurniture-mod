package com.addafurniture.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DrinkItem extends Item {
    public DrinkItem(Settings settings) { super(settings); }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);
        return TypedActionResult.consume(user.getStackInHand(hand));
    }

    @Override
    public SoundEvent getDrinkSound() { return SoundEvents.ITEM_HONEY_BOTTLE_DRINK; }

    @Override
    public SoundEvent getEatSound() { return SoundEvents.ITEM_HONEY_BOTTLE_DRINK; }
}
