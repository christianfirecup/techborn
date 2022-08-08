package net.firecup.mods.techborn.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier TITANIUM = new ForgeTier(4, 2000, 8f, 1f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.TITANIUM.get()));

}
