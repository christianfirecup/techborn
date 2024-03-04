package net.firecup.mods.techborn.block.custom;

import net.firecup.mods.techborn.block.ModBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEventListener;
import org.jetbrains.annotations.Nullable;

public class TeleportBlock extends Block implements EntityBlock {
    public TeleportBlock(Properties pProperties) {
        super(pProperties);
    }


        @Override
        public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
            if(!pLevel.isClientSide()){
                if(pEntity instanceof LivingEntity){
                    LivingEntity livingEntity = ((LivingEntity) pEntity);

                }
            }
            super.stepOn(pLevel, pPos, pState, pEntity);
        }


    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return ModBlockEntity.Teleporter.get().create(pPos, pState);
    }


}

