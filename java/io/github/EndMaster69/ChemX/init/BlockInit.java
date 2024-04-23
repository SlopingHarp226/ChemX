package io.github.EndMaster69.ChemX.init;

import io.github.EndMaster69.ChemX.ChemX;
import io.github.EndMaster69.ChemX.block.SuperDuperBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChemX.MODID);

    public static final RegistryObject<Block> BEAN_BLOCK = BLOCKS.register("bean_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.5f,0.5f)
            ));
    public static final RegistryObject<Block> BAUXITE = BLOCKS.register("bauxite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(1f,1f)
            ));
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(3f,3f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(4.5f,4.5f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(3f,3f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(4.5f,4.5f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> PLUTONIUM_ORE = BLOCKS.register("plutonium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(4f,4f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_PLUTONIUM_ORE = BLOCKS.register("deepslate_plutonium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(6f,6f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(2.5f,2.5f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(3f,3f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = BLOCKS.register("deepslate_tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(4.69f,4.5f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(4f,4f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = BLOCKS.register("deepslate_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(6f,6f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> PULVERIZER = BLOCKS.register("pulverizer",
            () -> new SuperDuperBlocks(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(3f,3f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> ATOMIC_DECONSTRUCTOR = BLOCKS.register("atomic_deconstructor",
            () -> new SuperDuperBlocks(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .mapColor(MapColor.COLOR_BLUE)
                    .strength(3f,3f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> THRONGLER = BLOCKS.register("throngler",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(15f,100f)
            ));
    public static final RegistryObject<Block> PLACEHOLDER = BLOCKS.register("placeholder",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(1f,1f)
            ));
}

