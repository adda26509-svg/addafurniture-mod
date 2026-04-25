package com.addafurniture.entity.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ElephantEntity extends AnimalEntity {
    public ElephantEntity(EntityType<? extends AnimalEntity> type, World world) {
        super(type, world);
        this.setStepHeight(2.0f);
    }

    public static DefaultAttributeContainer.Builder createElephantAttributes() {
        return MobEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 120.0)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.22)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8.0)
            .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.0)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0);
    }

    @Override
    protected void initGoals() {
        goalSelector.add(0, new SwimGoal(this));
        goalSelector.add(1, new EscapeDangerGoal(this, 1.5));
        goalSelector.add(2, new AnimalMateGoal(this, 1.0));
        goalSelector.add(3, new TemptGoal(this, 1.1, Ingredient.ofItems(Items.SUGAR_CANE, Items.APPLE), false));
        goalSelector.add(4, new FollowParentGoal(this, 1.1));
        goalSelector.add(5, new WanderAroundFarGoal(this, 1.0));
        goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8f));
        goalSelector.add(7, new LookAroundGoal(this));
        targetSelector.add(1, new RevengeGoal(this));
    }

    @Override
    public boolean isBreedingItem(ItemStack s) { return s.isOf(Items.SUGAR_CANE); }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld w, PassiveEntity e) { return null; }

    @Override protected SoundEvent getAmbientSound() { return SoundEvents.ENTITY_GENERIC_BIG_FALL; }
    @Override protected SoundEvent getHurtSound(DamageSource s) { return SoundEvents.ENTITY_IRON_GOLEM_HURT; }
    @Override protected SoundEvent getDeathSound() { return SoundEvents.ENTITY_IRON_GOLEM_DEATH; }
}
