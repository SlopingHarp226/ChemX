package io.github.EndMaster69.ChemX.init;

import io.github.EndMaster69.ChemX.ChemX;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChemX.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = TABS.register("main_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.main_tab"))
                    .icon(ItemInit.BEANS.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        output.accept(ItemInit.ALUMINIUM_AXE.get());
                        output.accept(ItemInit.ALUMINIUM_HOE.get());
                        output.accept(ItemInit.ALUMINIUM_PICKAXE.get());
                        output.accept(ItemInit.ALUMINIUM_SHOVEL.get());
                        output.accept(ItemInit.ALUMINIUM_SWORD.get());
                        output.accept(ItemInit.BEANS.get());
                        output.accept(ItemInit.SALT.get());
                        output.accept(ItemInit.BEAN_BLOCK_ITEM.get());
                        output.accept(ItemInit.PULVERIZER_ITEM.get());
                        output.accept(ItemInit.LEAD_INGOT.get());
                        output.accept(ItemInit.ALUMINIUM_INGOT.get());
                        output.accept(ItemInit.PLUTONIUM_INGOT.get());
                        output.accept(ItemInit.PLATINUM_INGOT.get());
                        output.accept(ItemInit.TUNGSTEN_INGOT.get());
                        output.accept(ItemInit.URANIUM_INGOT.get());
                        output.accept(ItemInit.TIN_INGOT.get());
                        output.accept(ItemInit.RAW_LEAD.get());
                        output.accept(ItemInit.RAW_PLUTONIUM.get());
                        output.accept(ItemInit.RAW_PLATINUM.get());
                        output.accept(ItemInit.RAW_TUNGSTEN.get());
                        output.accept(ItemInit.RAW_URANIUM.get());
                        output.accept(ItemInit.RAW_TIN.get());
                        output.accept(ItemInit.BAUXITE_ITEM.get());
                        output.accept(ItemInit.LEAD_ORE_ITEM.get());
                        output.accept(ItemInit.DEEPSLATE_LEAD_ORE_ITEM.get());
                        output.accept(ItemInit.PLATINUM_ORE_ITEM.get());
                        output.accept(ItemInit.DEEPSLATE_PLATINUM_ORE_ITEM.get());
                        output.accept(ItemInit.PLUTONIUM_ORE_ITEM.get());
                        output.accept(ItemInit.DEEPSLATE_PLUTONIUM_ORE_ITEM.get());
                        output.accept(ItemInit.TUNGSTEN_ORE_ITEM.get());
                        output.accept(ItemInit.DEEPSLATE_TUNGSTEN_ORE_ITEM.get());
                        output.accept(ItemInit.URANIUM_ORE_ITEM.get());
                        output.accept(ItemInit.DEEPSLATE_URANIUM_ORE_ITEM.get());
                        output.accept(ItemInit.TIN_ORE_ITEM.get());
                        output.accept(ItemInit.THRONGLER_ITEM.get());
                        output.accept(ItemInit.PULVERIZER_ITEM.get());
                        output.accept(ItemInit.ATOMIC_DECONSTRUCTOR_ITEM.get());
                        output.accept(ItemInit.HORRIFIC_CHEESEBURGER.get());
                    })
                    .build()
    );
}