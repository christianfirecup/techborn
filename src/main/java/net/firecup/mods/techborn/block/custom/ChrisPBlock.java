package net.firecup.mods.techborn.block.custom;
import java.util.Random;

import net.firecup.mods.techborn.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.Nullable;

import static com.ibm.icu.impl.ValidIdentifiers.Datatype.x;


public class ChrisPBlock extends Block {
    public ChrisPBlock(Properties properties) {
        super(properties);
    }



    public void playerDestroy(Level pLevel, Player pPlayer, BlockPos pPos, BlockState pState, @Nullable BlockEntity pBlockEntity, ItemStack pTool, LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel _level) {
            if ((world.getBlockState(new BlockPos(x, y, z))).getBlock().equals(ModBlocks.CHRIS_BLOCK)) {
                Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
                entityToSpawn.moveTo(x, y, z, 0, 0);
                entityToSpawn.setYBodyRot(0);
                entityToSpawn.setYHeadRot(0);
                if (entityToSpawn instanceof Mob _mobToSpawn)
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
                            null);
                world.addFreshEntity(entityToSpawn);
            }
        }
        super.playerDestroy(pLevel, pPlayer, pPos, pState, pBlockEntity, pTool);
    }
}