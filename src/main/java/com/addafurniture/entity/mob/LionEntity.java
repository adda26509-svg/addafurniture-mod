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
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
/** Lion - King of the Savanna! Hostile, drops Lion Mane. HP: 40 hearts */
public class LionEntity extends AnimalEntity {
    public LionEntity(EntityType<? extends AnimalEntity> type, World world) { super(type, world); }
    public static DefaultAttributeContainer.Builder createLionAttributes() {
        return MobEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 80.0)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.35)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 12.0)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20.0)
            .add(EntityAttributes.GENERIC_ARMOR, 6.0);
    }
    @Override protected void initGoals() {
        goalSelector.add(0, new SwimGoal(this));
        goalSelector.add(1, new MeleeAttackGoal(this, 1.3, true));
        goalSelector.add(2, new WanderAroundFarGoal(this, 1.0));
        goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 8f));
        targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, false));
        targetSelector.add(2, new RevengeGoal(this));
    }
    @Override public boolean isBreedingItem(ItemStack s) { return s.isOf(Items.RAW_BEEF); }
    @Nullable @Override public PassiveEntity createChild(ServerWorld w, PassiveEntity e) { return null; }
    @Override protected SoundEvent getAmbientSound() { return SoundEvents.ENTITY_CAT_AMBIENT; }
    @Override protected SoundEvent getHurtSound(DamageSource s) { return SoundEvents.ENTITY_IRON_GOLEM_HURT; }
    @Override protected SoundEvent getDeathSound() { return SoundEvents.ENTITY_IRON_GOLEM_DEATH; }
}
