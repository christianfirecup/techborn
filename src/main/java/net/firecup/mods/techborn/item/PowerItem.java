package net.firecup.mods.techborn.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class PowerItem extends Item {
    private final int capacity;
    private final int maxReceive;
    private final int maxExtract;

    private  Player player1;



    public PowerItem(Properties pProperties, int capacity, int maxReceive, int maxExtract) {
        super(pProperties);
        this.capacity = capacity;
        this.maxReceive = maxReceive;
        this.maxExtract = maxExtract;

    }

    @Override
    public boolean canBeDepleted() {
        return true;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        ItemStack stack1 = pContext.getItemInHand();
        
        setEnergyStored(stack1, getEnergyStored(stack1) + 50);


        return super.useOn(pContext);
    }

    public int getEnergyStored(ItemStack stack) {
        if (stack.hasTag() && stack.getTag().contains("Energy")) {
            return stack.getTag().getInt("Energy");
        } else {
            return 0;
        }
    }

    public void setEnergyStored(ItemStack stack, int energy) {
        stack.getOrCreateTag().putInt("Energy", energy);
    }

    public int getMaxEnergyStored(ItemStack stack) {

    return capacity;
    }

    public int receiveEnergy(ItemStack stack, int maxReceive, boolean simulate) {
        int energy = getEnergyStored(stack);
        int energyReceived = Math.min(capacity - energy, Math.min(this.maxReceive, maxReceive));
        if (!simulate) {
            energy += energyReceived;
            setEnergyStored(stack, energy);
        }
        return energyReceived;
    }

    public int extractEnergy(ItemStack stack, int maxExtract, boolean simulate) {
        int energy = getEnergyStored(stack);
        int energyExtracted = Math.min(energy, Math.min(this.maxExtract, maxExtract));
        if (!simulate) {
            energy -= energyExtracted;
            setEnergyStored(stack, energy);
        }
        return energyExtracted;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        int energyStored = getEnergyStored(pStack);
        int maxEnergyStored = getMaxEnergyStored(pStack);
        double energyPercent = Math.round(((double) energyStored / (double) maxEnergyStored) * 10000.0) / 100.0;
        pTooltipComponents.add(new TranslatableComponent("tooltip.techborn.poweritem.tooltip", energyStored, maxEnergyStored, energyPercent));
    }
}