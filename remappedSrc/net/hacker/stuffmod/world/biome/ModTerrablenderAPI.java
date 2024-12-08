package net.hacker.stuffmod.world.biome;

import net.hacker.stuffmod.StuffMod;
import net.hacker.stuffmod.world.biome.surface.ModMaterialRules;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import terrablender.api.*;

public class ModTerrablenderAPI implements TerraBlenderApi {

    @Override
    public void onTerraBlenderInitialized() {

        Regions.register(new ModOverworldRegion(new Identifier(StuffMod.MOD_ID, "end"), 10));
        EndBiomeRegistry.registerHighlandsBiome(ModBiomes.END_PLANES_BIOME, 25);

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, StuffMod.MOD_ID, ModMaterialRules.makeRules());
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.END, StuffMod.MOD_ID, ModMaterialRules.makeRulesendplaines());

    }
}
