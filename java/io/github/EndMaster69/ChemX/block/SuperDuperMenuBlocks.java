package io.github.EndMaster69.ChemX.block;

import io.github.EndMaster69.ChemX.blockentity.SuperDuperBlocksEntity;
import io.github.EndMaster69.ChemX.blockentity.SuperDuperMenuBlocksEntity;
import io.github.EndMaster69.ChemX.init.BlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static io.github.EndMaster69.ChemX.init.BlockEntityInit.SUPER_DUPER_BLOCKS_ENTITY;

public class SuperDuperMenuBlocks extends Block implements EntityBlock {
    public SuperDuperMenuBlocks(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return BlockEntityInit.SUPER_DUPER_MENU_BLOCKS_ENTITY.get().create(pos, state);
    }

    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        BlockEntity be = level.getBlockEntity(pos);
        if (!(be instanceof SuperDuperMenuBlocksEntity blockEntity))
            return InteractionResult.PASS;

        if (level.isClientSide())
            return InteractionResult.SUCCESS;

        // open screen
        if(player instanceof ServerPlayer sPlayer) {
            sPlayer.openMenu(blockEntity, pos);
        }

        return InteractionResult.CONSUME;
    }

    @Override
    public void onRemove(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState newState, boolean isMoving) {
        if(!level.isClientSide()) {
            BlockEntity be = level.getBlockEntity(pos);
            if(be instanceof SuperDuperMenuBlocksEntity blocksEntity) {
                ItemStackHandler inventory = blocksEntity.getInventory();
                for (int index = 0; index < inventory.getSlots(); index++) {
                    ItemStack stack = inventory.getStackInSlot(index);
                    var entity = new ItemEntity(level, pPosX: pos.getX() + 0.5D, pPosY: pos.getY() + 0.5D, pPosZ: pos.getZ() + 0.5D);
                    level.addFreshEntity(entity);
                }
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }
}
