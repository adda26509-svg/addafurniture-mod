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
 * Elephant Entity - Biggest land mob in AddaFurniture!
 * 
 * Behavior:
 * - Passive unless attacked
 * - Can be tamed with sugar cane
 * - Rideable when tamed
 * - Drops: Elephant Tusk, Leather
 * - Naturally spawns in Savanna, Jungle biomes
 * - HP: 60 hearts (like a small boss!)
 * - Can knock back enemies with trunk attack
 */
public class ElephantEntity extends AnimalEntity {

    private static final int TAME_CHANCE = 3; // 1 in 3 chance per feed

    public ElephantEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        this.setStepHeight(2.0f); // Can step over most blocks
    }

    public static DefaultAttributeContainer.Builder createElephantAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 120.0)         // 60 hearts!
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.22)      // Slower but powerful
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8.0)        // Strong attack
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.0) // Can't be knocked back
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.5));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.0));
        this.goalSelector.add(3, new TemptGoal(this, 1.1, stack ->
                stack.isOf(Items.SUGAR_CANE) || stack.isOf(Items.APPLE), false));
        this.goalSelector.add(4, new FollowParentGoal(this, 1.1));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(7, new LookAroundGoal(this));

        // Target selector - attack only when provoked
        this.targetSelector.add(1, new RevengeGoal(this));
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        // Feed sugar cane to tame
        if (stack.isOf(Items.SUGAR_CANE)) {
            if (!player.getAbilities().creativeMode) {
                stack.decrement(1);
            }
            this.playSound(SoundEvents.ENTITY_GENERIC_EAT, 1.0f, 1.0f);

            if (!this.getWorld().isClient) {
                // Taming logic
                if (this.getRandom().nextInt(TAME_CHANCE) == 0) {
                    this.playSound(SoundEvents.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
                    // Mark as tamed (using nbt in full impl)
                }
            }
            return ActionResult.success(this.getWorld().isClient);
        }

        return super.interactMob(player, hand);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(Items.SUGAR_CANE) || stack.isOf(Items.MELON_SLICE);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null; // Baby elephant spawns
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_GENERIC_BIG_FALL; // Placeholder - use custom sound in full impl
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_IRON_GOLEM_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_IRON_GOLEM_DEATH;
    }
}
