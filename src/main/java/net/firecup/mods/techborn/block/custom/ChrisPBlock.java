package net.firecup.mods.techborn.block.custom;
import java.util.Random;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.monster.Zombie;



public class ChrisPBlock extends Block{
    public ChrisPBlock(Properties properties) {super(properties);}


    @Override
    public void destroy(LevelAccessor pLevel, BlockPos pPos, BlockState pState){
        if(!pLevel.isClientSide()){
            Random mobchance = new Random();
            int randomchance = mobchance.nextInt(3)+1;
            if(randomchance == 1){
                Entity Zombie;



            }

        }
        super.destroy(pLevel, pPos, pState);
    }
}
