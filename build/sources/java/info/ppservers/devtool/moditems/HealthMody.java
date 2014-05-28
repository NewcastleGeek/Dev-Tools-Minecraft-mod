package info.ppservers.devtool.moditems;

import java.util.List;

import info.ppservers.devtool.lib.Reference;
import info.ppservers.devtool.lib.TextUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HealthMody extends Item {
	
	public HealthMody(){
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("healthmod");
		this.setTextureName(Reference.MOD_ID + ":HealthMod");
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		float current = player.getHealth();
		float maxHealth = player.getMaxHealth();
		//Removing food
		if(!world.isRemote){
			if(player.isSneaking() && current > 2){	
				TextUtil.sendChat(player, "Currently " + current);
				player.setHealth(current -2);
					TextUtil.sendChat(player, "hearts removed");
				}
		//Adding food
		else 
			if(current < maxHealth ){
				TextUtil.sendChat(player, "Currently " + current);
				player.setHealth(current +2);
				//TextUtil.sendChat(player, "Food added" + foodOut );
			}	
		if(current > 20){
					player.setHealth(maxHealth);
		
		}
	}
		return super.onItemRightClick(stack, world, player);
	}
	
	@Override
	public void addInformation(ItemStack stack,
			EntityPlayer player, List list, boolean par4) {
		list.add("Right clicking adds a heart");
		list.add("Sneaking right clicking takes a heart");
		
		super.addInformation(stack, player, list, par4);
	}

}
