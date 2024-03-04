// The package for the Techborn mod.
package net.firecup.mods.techborn;

// Importing necessary classes and libraries.
import com.mojang.logging.LogUtils;
import net.firecup.mods.techborn.block.ModBlockEntity;
import net.firecup.mods.techborn.block.ModBlocks;
import net.firecup.mods.techborn.item.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// This annotation indicates that this is a Minecraft mod.
// The value in the annotation should match an entry in the META-INF/mods.toml file.
@Mod(Techborn.MOD_ID)
public class Techborn {

    // This is a unique identifier for the mod, used in registering mod components.
    public static final String MOD_ID = "techborn";

    // This is a Logger object that will output logs to the console. It's from the slf4j library.
    private static final Logger LOGGER = LogUtils.getLogger();

    // This is the constructor of the mod class.
    public Techborn() {

        // An instance of the mod event bus is created here. All mod events will be posted to this bus.
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registering the mod's items and blocks to the mod event bus.
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntity.register(eventBus);

        // Adding a listener for the setup event. This event is called when the mod is being set up.
        eventBus.addListener(this::setup);

        // Registering the mod itself to the MinecraftForge event bus. This bus posts events related to the Minecraft game itself.
        MinecraftForge.EVENT_BUS.register(this);
    }

    // This is a method that will be called when the mod is setting up.
    // It's an example of a FML life-cycle event, specifically the common setup event.
    private void setup(final FMLCommonSetupEvent event) {
        // Some pre-initialization code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
