package io.github.EndMaster69.ChemX.menu;

import io.github.EndMaster69.ChemX.blockentity.SuperDuperMenuBlocksEntity;
import io.github.EndMaster69.ChemX.init.BlockInit;
import io.github.EndMaster69.ChemX.init.MenuInit;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

import static io.github.EndMaster69.ChemX.init.BlockInit.ATOMIC_DECONSTRUCTOR;

public class Menu extends AbstractContainerMenu {
    private final SuperDuperMenuBlocksEntity blockEntity;
    private final ContainerLevelAccess levelAccess;
    // Client Constructor
    public Menu(int containerId, Inventory playerInv, FriendlyByteBuf additionalData, ContainerLevelAccess levelAccess, ContainerLevelAccess levelAccess1) {
        this(containerId, playerInv, playerInv.player.level().getBlockEntity(additionalData.readBlockPos()));
    }

    // Server Constructor
    public Menu(int containerId, Inventory playerInv, BlockEntity blockEntity) {
        super(MenuInit.MENU.get(), containerId);
        if(blockEntity instanceof SuperDuperMenuBlocksEntity be) {
            this.blockEntity = be;
        } else {
            throw new IllegalStateException("Incorrect block entity class (%s) passed into Menu!"
                    .formatted(blockEntity.getClass().getCanonicalName()));
        }

        this.levelAccess = ContainerLevelAccess.create(blockEntity.getLevel(), blockEntity.getBlockPos());

        createPlayerHotbar(playerInv);
        createPlayerInventory(playerInv);
        createBlockEnityInventory(be);
    }

    private void createBlockEnityInventory(SuperDuperMenuBlocksEntity be) {
        be.getOptional().ifPresent(inventory -> {
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 9; column++) {
                    addSlot(new SlotItemHandler(inventory,
                            column + (row * 9),
                            8 + (column * 18),
                            18 + (row * 18)));
                }
            }
        });
    }

    private void createPlayerInventory(Inventory playerInv) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 9; column++) {
                addSlot(new Slot(playerInv,
                        9 + column + (row * 9),
                        8 + (column * 18),
                        84 + (row * 18)));
            }
        }
    }

    private void createPlayerHotbar(Inventory playerInv) {
        for (int column = 0; column < 9; column++) {
            addSlot(new Slot(playerInv, column,
                    8 + (column * 18),
                    142));
        }
    }

    @Override
    public ItemStack quickMoveStack(@NotNull Player pPlayer, int pIndex) {
        Slot fromSlot = getSlot(pIndex);
        ItemStack fromStack = fromSlot.getItem();

        if(fromStack.getCount() <= 0)
            fromSlot.set(ItemStack.EMPTY);

        if(!fromSlot.hasItem())
            return ItemStack.EMPTY;
    }

    @Override
    public boolean stillValid(@NotNull Player pPlayer) {
        return stillValid(this.levelAccess, pPlayer, BlockInit.PULVERIZER.get());
    }

    public SuperDuperMenuBlocksEntity getBlockEntity() {
        return this.blockEntity;
    }
}
