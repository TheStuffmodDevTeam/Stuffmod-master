
package net.hacker.stuffmod.world;

import net.hacker.stuffmod.StuffMod;
import net.hacker.stuffmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.client.particle.CampfireSmokeParticle;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> EEEE_ORE_KEY = registerKey("eeee_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDERITE_ORE_KEY = registerKey("enderite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAOC_ORE_KEY = registerKey("laoc_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> FIREY_VOID_KEY = registerKey("firey_void");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ICEE_VOID_KEY = registerKey("icee_void");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldEEEEOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.EEEE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_EEEE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLAOCOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.LAOC_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_LAOC_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endEnderiteOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.ENDERITE_ORE.getDefaultState()));

        register(context, EEEE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldEEEEOres, 3));
        register(context, LAOC_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLAOCOres, 5));
        register(context, ENDERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endEnderiteOres, 5));

        register(context, FIREY_VOID_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(ModBlocks.FIREY_VOID_LOG),
                new StraightTrunkPlacer(4, 3, 2),

            BlockStateProvider.of(ModBlocks.FIREY_VOID_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(3), 3   ),

                new TwoLayersFeatureSize(1,0,1)).build()
        );

        register(context, ICEE_VOID_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ICEE_VOID_LOG),
                new StraightTrunkPlacer(4, 3, 2),

                BlockStateProvider.of(ModBlocks.ICEE_VOID_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 4),

                new TwoLayersFeatureSize(1,0,3)).build()
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(StuffMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
