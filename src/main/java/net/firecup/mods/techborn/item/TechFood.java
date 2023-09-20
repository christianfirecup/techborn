package net.firecup.mods.techborn.item;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.firecup.mods.techborn.item.ModItems;
public class TechFood extends Item {


    public TechFood(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        if (pLivingEntity instanceof Player){
            ((Player) pLivingEntity).addItem(new ItemStack(new ItemStack(ModItems.TECHFOOD.get()).getItem()));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffect.byId(5),2000));

        }

        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
    }
    public int eatcount(ItemStack stack){


        return eatcount(stack);
    }
    private int eatcount;
}
