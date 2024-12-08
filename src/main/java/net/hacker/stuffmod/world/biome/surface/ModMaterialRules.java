package net.hacker.stuffmod.world.biome.surface;

import net.hacker.stuffmod.block.ModBlocks;
import net.hacker.stuffmod.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule ENDSTONE = makeStateRule(Blocks.END_STONE);
    private static final MaterialRules.MaterialRule ENDDIRT = makeStateRule(Blocks.GRASS_BLOCK);


    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, ENDSTONE), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.END_WASTE_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, ENDSTONE)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, ENDSTONE)),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
                );
    }

    public static MaterialRules.MaterialRule makeRulesendplaines() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, ENDDIRT), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.END_WASTE_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, ENDDIRT)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, ENDDIRT)),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}