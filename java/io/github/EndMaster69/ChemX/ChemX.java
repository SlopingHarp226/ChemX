package io.github.EndMaster69.ChemX;

import io.github.EndMaster69.ChemX.init.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.awt.*;

@Mod("chemx")
public class ChemX {
    public static final String MODID = "chemx";

    public ChemX() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
        BlockEntityInit.BLOCK_ENTITIES.register(bus);
        MenuInit.MENU_TYPES.register(bus);
    }
}
