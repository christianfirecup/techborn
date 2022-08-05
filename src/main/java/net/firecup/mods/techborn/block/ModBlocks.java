package net.firecup.mods.techborn.block;

import net.firecup.mods.techborn.Techborn;
import net.firecup.mods.techborn.block.custom.ChrisPBlock;
import net.firecup.mods.techborn.block.custom.SpeedBlock;
import net.firecup.mods.techborn.item.CreativeTab;
import net.firecup.mods.techborn.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Techborn.MOD_ID);
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeTab.TECHBORN);
    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeTab.TECHBORN);
    public static final RegistryObject<Block> SPEED_BLOCK = registerBlock("speed_block", () -> new SpeedBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), CreativeTab.TECHBORN);
    public static final RegistryObject<Block> CHRIS_BLOCK = registerBlock("chris_block", () -> new ChrisPBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), CreativeTab.TECHBORN);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab ){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));



    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
