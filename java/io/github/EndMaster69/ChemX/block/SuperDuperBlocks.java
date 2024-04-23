package io.github.EndMaster69.ChemX.block;

import io.github.EndMaster69.ChemX.blockentity.SuperDuperBlocksEntity;
import io.github.EndMaster69.ChemX.init.BlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static io.github.EndMaster69.ChemX.init.BlockEntityInit.SUPER_DUPER_BLOCKS_ENTITY;

public class SuperDuperBlocks extends HorizontalDirectionalBlock implements EntityBlock {
    public SuperDuperBlocks(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return SUPER_DUPER_BLOCKS_ENTITY.get().create(pos, state);
    }

    @Override
    protected void createBlockStateDefinition(@NotNull StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }

    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        if(!level.isClientSide()) {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof SuperDuperBlocksEntity blockEntity) {
                int counter = blockEntity.incrementCounter();
                player.sendSystemMessage(Component.literal("BlockEntity has been used %d times".formatted(counter)));
                return InteractionResult.sidedSuccess(level.isClientSide());
            }
        }

        return super.use(state, level, pos, player, hand, hitResult);
    }
}
