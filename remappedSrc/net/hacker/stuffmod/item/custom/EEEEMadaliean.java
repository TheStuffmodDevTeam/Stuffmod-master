package net.hacker.stuffmod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class EEEEMadaliean extends Item {
    public EEEEMadaliean(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {

            sendEEEEinChat(context.getPlayer());


        }

        context.getStack().damage(1, context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void sendEEEEinChat(PlayerEntity player) {
        player.sendMessage(Text.literal("EEEE"), false);
    }
}
