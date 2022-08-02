package net.firecup.mods.techborn.item;


import net.firecup.mods.techborn.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab TECHBORN = new CreativeModeTab("techborn") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM.get());
        }
    };



}
