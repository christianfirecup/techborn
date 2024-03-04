package net.firecup.mods.techborn.block.custom.entity.custom;

import net.firecup.mods.techborn.block.ModBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TeleportBlockEntity extends BlockEntity {
    public TeleportBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntity.Teleporter.get(), pPos, pBlockState);
    }

}
