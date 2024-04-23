package io.github.EndMaster69.ChemX.blockentity;

import io.github.EndMaster69.ChemX.ChemX;
import io.github.EndMaster69.ChemX.init.BlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SuperDuperBlocksEntity extends BlockEntity {
    private int counter;

    public SuperDuperBlocksEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.SUPER_DUPER_BLOCKS_ENTITY.get(), pos, state);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);

        CompoundTag chemxData = nbt.getCompound((ChemX.MODID));
        this.counter = chemxData.getInt("Counter");
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        super.saveAdditional(nbt);

        var chemxData = new CompoundTag();
        chemxData.putInt("Counter", this.counter);
        nbt.put(ChemX.MODID, chemxData);
    }

    public int incrementCounter() {
        return ++this.counter;
    }

    public int getCounter() {
        return this.counter;
    }
}
