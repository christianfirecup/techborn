package net.firecup.mods.techborn.block;

import net.firecup.mods.techborn.Techborn;
import net.firecup.mods.techborn.block.custom.TeleportBlock;
import net.firecup.mods.techborn.block.custom.entity.custom.TeleportBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntity {
    public static  final DeferredRegister<BlockEntityType<?>> BLOCK_ENT = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Techborn.MOD_ID);


        public static final RegistryObject<BlockEntityType<TeleportBlockEntity>> Teleporter = BLOCK_ENT.register("teleport_block", () -> BlockEntityType.Builder.of(TeleportBlockEntity::new, ModBlocks.TELEPORT_BLOCK.get()).build(null));
    public static void register(IEventBus eventBus){
        BLOCK_ENT.register(eventBus);
    }
}
