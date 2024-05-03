package net.firecup.mods.techborn.ModEvents;

import net.firecup.mods.techborn.Techborn;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Techborn.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ZombieEvents {
    private static int spawnchance;
    private static int amounttospawn;

    @SubscribeEvent(priority = EventPriority.LOW)
     public static void ZombieSpawns(EntityJoinWorldEvent event ) {


        // Assuming we want to spawn a zombie for every entity except for Zombie to avoid an infinite loop
        if ( !(event.getEntity() instanceof Zombie) || event.getWorld().isClientSide()) {
            return;
        }


        spawnchance = (int) Math.floor(Math.random() * 11);
        System.out.println(spawnchance);
        amounttospawn = (int) Math.floor(Math.random() * 5);
        if(spawnchance > 5) {
            for(int i = 0; i < amounttospawn; i++) {
                Zombie zombie = new Zombie(event.getWorld());
                zombie.setPos(event.getEntity().getX() + 1, event.getEntity().getY(), event.getEntity().getZ()+1);
                boolean spawnResult = event.getWorld().addFreshEntity(zombie);


            }
        }
    }

}
