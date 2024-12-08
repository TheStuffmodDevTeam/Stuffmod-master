package net.hacker.stuffmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class ACEMTM_PigerEnchantment extends Enchantment {
    public ACEMTM_PigerEnchantment(Rarity rarity, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(rarity, target, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) user.getWorld();
            BlockPos position = target.getBlockPos();

            if (level == 1) {
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.PIG.spawn(world, position, SpawnReason.TRIGGERED);
            }

            if (level == 2) {
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.PIG.spawn(world, position, SpawnReason.TRIGGERED);
            }
            if (level == 3) {
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.PIG.spawn(world, position, SpawnReason.TRIGGERED);

            }

        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
