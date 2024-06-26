package net.firecup.mods.techborn.features;

import net.firecup.mods.techborn.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModConfigedFeatures {
    public static Holder<PlacedFeature> OW_OreGentitanium;
    public static Holder<PlacedFeature> OW_OreGenspeed;

    public static void registerOreFeatures() {
        OreConfiguration owconfigtitanium = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TITANIUM_ORE.get().defaultBlockState(), 20);
        OreConfiguration owconfigspeed = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TITANIUM_ORE.get().defaultBlockState(), 20);
        OW_OreGentitanium = registerPlacedOreFeature("titanium_ore", new ConfiguredFeature<>(Feature.ORE, owconfigtitanium),
                CountPlacement.of(100),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(75)));
        OW_OreGenspeed= registerPlacedOreFeature("speed_block", new ConfiguredFeature<>(Feature.ORE, owconfigspeed),
                CountPlacement.of(100),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(75)));

    }
    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedOreFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers) {
        return PlacementUtils.register(registryName, Holder.direct(feature), placementModifiers);
    }
    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.BiomeCategory.NETHER) {
        } else if (event.getCategory() == Biome.BiomeCategory.THEEND) {
        } else {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OW_OreGentitanium).addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OW_OreGenspeed);
        }


    }


}
