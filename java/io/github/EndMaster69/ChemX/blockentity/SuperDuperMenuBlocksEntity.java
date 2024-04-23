package io.github.EndMaster69.ChemX.blockentity;

import io.github.EndMaster69.ChemX.ChemX;
import io.github.EndMaster69.ChemX.init.BlockEntityInit;
import io.github.EndMaster69.ChemX.menu.Menu;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.minecraftforge.common.capabilities.ForgeCapabilities.ITEM_HANDLER;

public class SuperDuperMenuBlocksEntity extends BlockEntity implements MenuProvider {
    private static final Component TITLE =
            Component.translatable("container." + ChemX.MODID + ".super_duper_menu_blocks");

    private final ItemStackHandler inventory = new ItemStackHandler(27){
        @Override
        protected void onContentsChanged(int slot) {
            super.onContentsChanged(slot);
            SuperDuperMenuBlocksEntity.this.setChanged();
        }
    };

    private final LazyOptional<ItemStackHandler> optional = LazyOptional.of(() -> this.inventory);

    public SuperDuperMenuBlocksEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.SUPER_DUPER_MENU_BLOCKS_ENTITY.get(), pos, state);
    }

    @Override
    public void load(@NotNull CompoundTag nbt) {
        super.load(nbt);

        CompoundTag chemxData = nbt.getCompound((ChemX.MODID));
        this.inventory.deserializeNBT(chemxData.getCompound("Inventory"));
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        super.saveAdditional(nbt);

        var chemxData = new CompoundTag();
        chemxData.put("Inventory", this.inventory.serializeNBT());
        nbt.put(ChemX.MODID, chemxData);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap) {
        return cap == ForgeCapabilities ITEM_HANDLER ? this:optional.cast() : super.getCapability(cap);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        this.optional.invalidate();
    }
    public LazyOptional<ItemStackHandler> getOptional() {return this.optional;}

    public ItemStackHandler getInventory() {return this.inventory;}

    @Override
    public Component getDisplayName() {
        return TITLE;
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerID, @NotNull Inventory pPlayerInventory, Player pPlayer) {
        return new Menu(pContainerID, pPlayerInventory, this);
    }
}
