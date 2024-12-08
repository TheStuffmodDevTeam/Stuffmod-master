package net.hacker.stuffmod.world.tree;

import net.hacker.stuffmod.world.ModConfiguredFeatures;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.Optional;

public class ModSaplingGenorators {

    public static final SaplingGenerator VOIDFIREY =
            new SaplingGenerator("void_firey", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.FIREY_VOID_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
                     public boolean canPlant(BlockState state, BlockView world, BlockPos pos) {
                        return world.getBlockState(pos.down()).isOf(Blocks.END_STONE);
    }
    public static final SaplingGenerator VOIDICEE =
            new SaplingGenerator("void_icee", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.ICEE_VOID_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}
