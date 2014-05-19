package info.ppservers.devtool.lib;

import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import info.ppservers.devtool.moditems.timeLocky;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent.Tick;

public class TimeHandler extends TickEvent{
	
	
	


	public TimeHandler(Type type, Side side, Phase phase) {
		super(type, side, phase);
		
	}

	public static void LockTime(World world){
		
		if(timeLocky.Locked == true){
			
			
		}
		
		
	}
	

	

}
