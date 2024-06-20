package net.firecup.mods.techborn.item;

import net.firecup.mods.techborn.Techborn;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Techborn.MOD_ID);

    public static final RegistryObject<Item> TITANIUM = ITEMS.register("titanium_ingut",
            () -> new Item(new Item.Properties().tab(CreativeTab.TECHBORN)));

    public static final RegistryObject<Item> INSANECOMPOUND = ITEMS.register("insane_compound",
            () -> new Item(new Item.Properties().tab(CreativeTab.TECHBORN)));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(CreativeTab.TECHBORN)));
    public static final RegistryObject<Item> TITANIUM_GEAR = ITEMS.register("titanium_gear",
            () -> new Item(new Item.Properties().tab(CreativeTab.TECHBORN)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTab.TECHBORN)));
    public static final RegistryObject<Item> TITANIUM_POWER_CORE = ITEMS.register("titanium_power_core",
            () -> new PowerItem(new Item.Properties().tab(CreativeTab.TECHBORN).stacksTo(1), 10000,50,100));
    public static final RegistryObject<Item> TECHFOOD = ITEMS.register("techfood",
            () -> new TechFood(new Item.Properties().tab(CreativeTab.TECHBORN).food(ModFoods.TECHFOOD)));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModTiers.TITANIUM, 2, 3f, new Item.Properties().tab(CreativeTab.TECHBORN)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModTiers.TITANIUM, 5, 6f, new Item.Properties().tab(CreativeTab.TECHBORN)));

    public static final RegistryObject<Item> CPICK = ITEMS.register("cpickaxe",
            () -> new PickaxeItem(ModTiers.INSANECOMPOUND, 5, 6f, new Item.Properties().tab(CreativeTab.TECHBORN)));
    public static final RegistryObject<Item> INSANECOMPOUND_SWORD = ITEMS.register("insane_sword",
            () -> new SwordItem(ModTiers.INSANECOMPOUND, 9, 3f, new Item.Properties().tab(CreativeTab.TECHBORN)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
