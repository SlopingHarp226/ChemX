package io.github.EndMaster69.ChemX.init;

import com.google.common.cache.LoadingCache;
import io.github.EndMaster69.ChemX.ChemX;
import io.github.EndMaster69.ChemX.block.SuperDuperMenuBlocks;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class MenuInit {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, ChemX.MODID);

    public static final RegistryObject<MenuType<Menu>> MENU = MENU_TYPES.register("menu",
            ()-> IForgeMenuType.create(Menu::new));

}
