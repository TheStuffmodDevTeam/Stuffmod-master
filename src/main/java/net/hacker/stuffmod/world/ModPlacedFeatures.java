package net.hacker.stuffmod.world;

import net.hacker.stuffmod.StuffMod;
import net.hacker.stuffmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> EEEE_ORE_PLACED_KEY = registerKey("eeee_ore_placed");
    public static final RegistryKey<PlacedFeature> LAOC_ORE_PLACED_KEY = registerKey("laoc_ore_placed");
    public static final RegistryKey<PlacedFeature> ENDERITE_ORE_PLACED_KEY = registerKey("enderite_ore_placed");

    public static final RegistryKey<PlacedFeature> FIREY_VOID_PLACED_KEY = registerKey("firey_void_placed");
    public static final RegistryKey<PlacedFeature> ICEE_VOID_PLACED_KEY = registerKey("icee_void_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, LAOC_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LAOC_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, EEEE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LAOC_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, ENDERITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ENDERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, FIREY_VOID_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FIREY_VOID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 3),
                        Blocks.END_STONE));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(StuffMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}