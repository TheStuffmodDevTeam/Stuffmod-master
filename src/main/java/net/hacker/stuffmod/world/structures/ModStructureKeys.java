//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.hacker.stuffmod.world.structures;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;

public interface ModStructureKeys {
    RegistryKey<Structure> VILLAGE_HOTTS = of("village_hotts");

    private static RegistryKey<Structure> of(String id) {
        return RegistryKey.of(RegistryKeys.STRUCTURE, new Identifier(id));
    }
}
