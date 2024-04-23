package io.github.EndMaster69.ChemX.init;

import io.github.EndMaster69.ChemX.init.ItemInit;
import io.github.EndMaster69.ChemX.init.TagInit;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier ALUMINIUM = new ForgeTier(
            1,
            2,
            0f,
            0,
            0,
            TagInit.NEEDS_ALUMINIUM_TOOL,
            () -> Ingredient.of(ItemInit.ALUMINIUM_INGOT::get)
    );
}
