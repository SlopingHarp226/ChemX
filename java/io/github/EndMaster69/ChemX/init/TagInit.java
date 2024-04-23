package io.github.EndMaster69.ChemX.init;


import io.github.EndMaster69.ChemX.ChemX;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_ALUMINIUM_TOOL = tag("needs_aluminium_tool.json");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(ChemX.MODID, name));
    }
}
