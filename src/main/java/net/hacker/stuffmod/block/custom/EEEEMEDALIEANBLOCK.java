package net.hacker.stuffmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EEEEMEDALIEANBLOCK extends Block {
    public EEEEMEDALIEANBLOCK(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_STEP, SoundCategory.BLOCKS, 2f, 1f);
        sendEEEEinChat(player);

        return ActionResult.SUCCESS;
    }

    private void sendEEEEinChat(PlayerEntity player) {
        player.sendMessage(Text.literal("EEEE"), false);
    }
}
