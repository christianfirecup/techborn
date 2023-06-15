package net.firecup.mods.techborn.item;

import net.firecup.mods.techborn.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier TITANIUM = new ForgeTier(4, 2000, 8f, 1f, 22, ModTags.Blocks.TITANIUM_PICKAXE,
            () -> Ingredient.of(ModItems.TITANIUM.get()));
    public static final ForgeTier INSANECOMPOUND = new ForgeTier(4, 2000, 8f, 1f, 22, ModTags.Blocks.TITANIUM_PICKAXE,
            () -> Ingredient.of(ModItems.INSANECOMPOUND.get()));

}
