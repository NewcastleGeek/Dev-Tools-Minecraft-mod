package info.ppservers.devtool.moditems;

import info.ppservers.devtool.lib.Reference;
import info.ppservers.devtool.lib.TextUtil;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class timeLocky extends Item {
	
	public static boolean Locked;
	public boolean unLocked;
	
	
	public timeLocky() {
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("time lock");
		this.setTextureName(Reference.MOD_ID + ":timelock");
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world,
			Entity entity, int par4, boolean par5) {
	long current = world.getWorldTime();
			if(current > 0){
				world.setWorldTime(0);
			}
		super.onUpdate(stack, world, entity, par4, par5);
	}
	
	
	@Override
	public void addInformation(ItemStack stack,
			EntityPlayer player, List list, boolean par4) {
		String username = player.getDisplayName();
		list.add("Your a timelord " + username);
		
		super.addInformation(stack, player, list, par4);
	}

}
