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
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

/**
 * Tiger Entity - Fierce predator!
 *
 * Behavior:
 * - Hostile to players unless tamed
 * - Can be tamed with raw meat (low chance)
 * - Tamed tigers follow and protect owner
 * - Very fast movement speed
 * - Spawns in Jungle biome at night
 * - Drops: Tiger Fur, Raw Meat
 * - HP: 30 hearts
 * - Leaps at target (pounce attack)
 */
public class TigerEntity extends AnimalEntity {

    private boolean isTamed = false;
    private boolean isSitting = false;

    public TigerEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createTigerAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 60.0)       // 30 hearts
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.38)   // Very fast!
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10.0)    // Deadly attack
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1.5)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 24.0)
                .add(EntityAttributes.GENERIC_ARMOR, 4.0);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));

        if (isTamed) {
            this.goalSelector.add(1, new SitGoal(this));
            this.goalSelector.add(2, new FollowOwnerGoal(this, 1.0, 10.0f, 2.0f, false));
        }

        this.goalSelector.add(3, new MeleeAttackGoal(this, 1.4, true));
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(6, new LookAroundGoal(this));

        if (!isTamed) {
            // Wild tiger attacks players and animals
            this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, false));
            this.targetSelector.add(2, new RevengeGoal(this));
        } else {
            // Tamed tiger protects owner
            this.targetSelector.add(1, new RevengeGoal(this));
        }
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        // Try to tame with raw meat - 10% chance
        if (!isTamed && (stack.isOf(Items.RAW_BEEF) || stack.isOf(Items.RAW_PORKCHOP))) {
            if (!player.getAbilities().creativeMode) stack.decrement(1);
            this.playSound(SoundEvents.ENTITY_GENERIC_EAT, 1.0f, 1.0f);

            if (!this.getWorld().isClient && this.getRandom().nextFloat() < 0.10f) {
                this.isTamed = true;
                this.playSound(SoundEvents.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
            }
            return ActionResult.success(this.getWorld().isClient);
        }

        // Sit/stand toggle for tamed tiger
        if (isTamed && player.getMainHandStack().isEmpty()) {
            this.isSitting = !isSitting;
            return ActionResult.success(this.getWorld().isClient);
        }

        return super.interactMob(player, hand);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(Items.RAW_BEEF) || stack.isOf(Items.COOKED_BEEF);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_CAT_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_CAT_HISS;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_CAT_DEATH;
    }
}
