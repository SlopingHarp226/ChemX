package io.github.EndMaster69.ChemX.init;

import io.github.EndMaster69.ChemX.ChemX;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChemX.MODID);

    public static final RegistryObject<Item> BEANS = ITEMS.register("beans",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(3)
                    .build())
            ));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationMod(0.2f)
                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200, 0),1f)
                    .build())
            ));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(100)
                    .saturationMod(0)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 999999999, 0),1f)
                    .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 999999999, 0),1f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 250, 0),1f)
                    .build())
            ));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> RAW_PLUTONIUM = ITEMS.register("raw_plutonium",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> PLUTONIUM_INGOT = ITEMS.register("plutonium_ingot",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> O2 = ITEMS.register("o2",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> CO2 = ITEMS.register("co2",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> H2O = ITEMS.register("h2o",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> C6H12O6 = ITEMS.register("c6h12o6",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item> HORRIFIC_CHEESEBURGER = ITEMS.register("horrific_cheeseburger",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(-666)
                    .saturationMod(49)
                    .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 9980, 731),0.9211f)
                    .build())
            ));

   public static final RegistryObject<SwordItem> ALUMINIUM_SWORD = ITEMS.register("aluminium_sword",
            () -> new SwordItem(
                    TierInit.ALUMINIUM,
                    (int) 5.5f,
                    -2.4f,
                    new Item.Properties())
    );
    public static final RegistryObject<AxeItem> ALUMINIUM_AXE = ITEMS.register("aluminium_axe",
            () -> new AxeItem(
                    TierInit.ALUMINIUM,
                    9,
                    -3.15f,
                    new Item.Properties())
    );

    public static final RegistryObject<PickaxeItem> ALUMINIUM_PICKAXE = ITEMS.register("aluminium_pickaxe",
            () -> new PickaxeItem(
                    TierInit.ALUMINIUM,
                    (int) 2.5f,
                    -2.8f,
                    new Item.Properties())
    );
    public static final RegistryObject<ShovelItem> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel",
            () -> new ShovelItem(
                    TierInit.ALUMINIUM,
                    2.5f,
                    -3f,
                    new Item.Properties())
    );
    public static final RegistryObject<HoeItem> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe",
            () -> new HoeItem(
                    TierInit.ALUMINIUM,
                    1,
                    2.5f,
                    new Item.Properties())
    );

    public static final RegistryObject<BlockItem> BEAN_BLOCK_ITEM = ITEMS.register("bean_block",
            () -> new BlockItem(BlockInit.BEAN_BLOCK.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> BAUXITE_ITEM = ITEMS.register("bauxite",
            () -> new BlockItem(BlockInit.BAUXITE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> LEAD_ORE_ITEM = ITEMS.register("lead_ore",
            () -> new BlockItem(BlockInit.LEAD_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> DEEPSLATE_LEAD_ORE_ITEM = ITEMS.register("deepslate_lead_ore",
            () -> new BlockItem(BlockInit.DEEPSLATE_LEAD_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> PLATINUM_ORE_ITEM = ITEMS.register("platinum_ore",
            () -> new BlockItem(BlockInit.PLATINUM_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> DEEPSLATE_PLATINUM_ORE_ITEM = ITEMS.register("deepslate_platinum_ore",
            () -> new BlockItem(BlockInit.DEEPSLATE_PLATINUM_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> PLUTONIUM_ORE_ITEM = ITEMS.register("plutonium_ore",
            () -> new BlockItem(BlockInit.PLUTONIUM_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> DEEPSLATE_PLUTONIUM_ORE_ITEM = ITEMS.register("deepslate_plutonium_ore",
            () -> new BlockItem(BlockInit.DEEPSLATE_PLUTONIUM_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> TUNGSTEN_ORE_ITEM = ITEMS.register("tungsten_ore",
            () -> new BlockItem(BlockInit.TUNGSTEN_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> DEEPSLATE_TUNGSTEN_ORE_ITEM = ITEMS.register("deepslate_tungsten_ore",
            () -> new BlockItem(BlockInit.DEEPSLATE_TUNGSTEN_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> URANIUM_ORE_ITEM = ITEMS.register("uranium_ore",
            () -> new BlockItem(BlockInit.URANIUM_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> DEEPSLATE_URANIUM_ORE_ITEM = ITEMS.register("deepslate_uranium_ore",
        () -> new BlockItem(BlockInit.DEEPSLATE_URANIUM_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> TIN_ORE_ITEM = ITEMS.register("tin_ore",
            () -> new BlockItem(BlockInit.TIN_ORE.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> PULVERIZER_ITEM = ITEMS.register("pulverizer",
            () -> new BlockItem(BlockInit.PULVERIZER.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> ATOMIC_DECONSTRUCTOR_ITEM = ITEMS.register("atomic_deconstructor",
            () -> new BlockItem(BlockInit.ATOMIC_DECONSTRUCTOR.get(), new Item.Properties() ));
    public static final RegistryObject<BlockItem> THRONGLER_ITEM = ITEMS.register("throngler",
            () -> new BlockItem(BlockInit.THRONGLER.get(), new Item.Properties() ));
    public static final RegistryObject<Item> PLACEHOLDER = ITEMS.register("placeholder",
            () -> new Item(new Item.Properties()
            ));
}

