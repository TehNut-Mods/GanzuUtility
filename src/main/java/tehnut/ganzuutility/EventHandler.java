package tehnut.ganzuutility;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.BlockLeaves;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

import java.util.Random;

public class EventHandler {

	Random random = new Random();

	@SubscribeEvent
	public void onHarvestDrops(BlockEvent.HarvestDropsEvent event) {
		if (event.block instanceof BlockLeaves && !event.isSilkTouching)
			if (random.nextInt(100) <= ConfigHandler.chance)
				event.drops.add(new ItemStack(Items.stick, 1, 0));
	}
}
