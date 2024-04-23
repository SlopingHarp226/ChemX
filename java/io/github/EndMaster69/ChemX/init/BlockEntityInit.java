package io.github.EndMaster69.ChemX.init;

import io.github.EndMaster69.ChemX.ChemX;

import io.github.EndMaster69.ChemX.block.SuperDuperBlocks;
import io.github.EndMaster69.ChemX.blockentity.SuperDuperBlocksEntity;
import io.github.EndMaster69.ChemX.blockentity.SuperDuperMenuBlocksEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ChemX.MODID);

    public static final RegistryObject<BlockEntityType<SuperDuperBlocksEntity>> SUPER_DUPER_BLOCKS_ENTITY =
            BLOCK_ENTITIES.register("super_duper_blocks_entity",
                    () -> BlockEntityType.Builder.of(SuperDuperBlocksEntity::new, BlockInit.ATOMIC_DECONSTRUCTOR.get(), BlockInit.PULVERIZER.get())
                            .build(null));

    public static final RegistryObject<BlockEntityType<SuperDuperMenuBlocksEntity>> SUPER_DUPER_MENU_BLOCKS_ENTITY =
            BLOCK_ENTITIES.register("super_duper_menu_blocks_entity",
                    () -> BlockEntityType.Builder.of(SuperDuperMenuBlocksEntity::new, BlockInit.ATOMIC_DECONSTRUCTOR.get(), BlockInit.PULVERIZER.get())
                            .build(null));
}
