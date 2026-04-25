package com.addafurniture.block;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class LampBlock extends Block {
    public static final BooleanProperty LIT = BooleanProperty.of("lit");
    public LampBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(LIT, false));
    }
    @Override public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) world.setBlockState(pos, state.cycle(LIT));
        return ActionResult.SUCCESS;
    }
    @Override protected void appendProperties(StateManager.Builder<Block, BlockState> builder) { builder.add(LIT); }
}
