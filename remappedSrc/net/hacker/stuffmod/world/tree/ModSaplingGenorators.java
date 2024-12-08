package net.hacker.stuffmod.world.tree;

import net.hacker.stuffmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenorators {

    public static final SaplingGenerator VOIDFIREY =
            new SaplingGenerator("void_firey", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.FIREY_VOID_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
    public static final SaplingGenerator VOIDICEE =
            new SaplingGenerator("void_icee", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.ICEE_VOID_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}
