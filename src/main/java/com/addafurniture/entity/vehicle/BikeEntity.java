package com.addafurniture.entity.vehicle;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
public class BikeEntity extends BoatEntity {
    public BikeEntity(EntityType<? extends BoatEntity> type, World world) { super(type, world); }
    @Override public Item asItem() { return Items.OAK_BOAT; }
    @Override public ActionResult interact(PlayerEntity player, Hand hand) {
        if (!this.getWorld().isClient) player.startRiding(this);
        return ActionResult.success(this.getWorld().isClient);
    }
}
