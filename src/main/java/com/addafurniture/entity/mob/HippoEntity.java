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
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
public class HippoEntity extends AnimalEntity {
    public HippoEntity(EntityType<? extends AnimalEntity> type, World world) { super(type, world); }
    public static DefaultAttributeContainer.Builder createHippoEntityAttributes() {
        return MobEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 40.0)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 6.0)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 16.0);
    }
    @Override protected void initGoals() {
        goalSelector.add(0, new SwimGoal(this));
        goalSelector.add(1, new EscapeDangerGoal(this, 1.4));
        goalSelector.add(2, new WanderAroundFarGoal(this, 1.0));
        goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 8f));
        goalSelector.add(4, new LookAroundGoal(this));
        targetSelector.add(1, new RevengeGoal(this));
    }
    @Override public boolean isBreedingItem(ItemStack s) { return false; }
    @Nullable @Override public PassiveEntity createChild(ServerWorld w, PassiveEntity e) { return null; }
    @Override protected SoundEvent getAmbientSound() { return SoundEvents.ENTITY_COW_AMBIENT; }
    @Override protected SoundEvent getHurtSound(DamageSource s) { return SoundEvents.ENTITY_COW_HURT; }
    @Override protected SoundEvent getDeathSound() { return SoundEvents.ENTITY_COW_DEATH; }
}
