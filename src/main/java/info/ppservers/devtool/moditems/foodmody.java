package info.ppservers.devtool.moditems;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import info.ppservers.devtool.CommandHandler;
import info.ppservers.devtool.lib.Reference;
import info.ppservers.devtool.lib.TextUtil;
import net.minecraft.command.ICommandSender;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class foodmody extends Item {
	
	public foodmody(){
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("foody");
		this.setTextureName(Reference.MOD_ID + ":FoodMod");
		
	}
	
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		int maxFood = 20;
		int currentFood = player.getFoodStats().getFoodLevel();
		int foodOut = currentFood +2;
		//Removing food
		if(!world.isRemote){
			if(player.isSneaking() && currentFood > 2){	
				TextUtil.sendChat(player, "Currently " + currentFood);
				player.getFoodStats().setFoodLevel(currentFood -2);
					TextUtil.sendChat(player, "Food removed");
				}
		//Adding food
		else 
			if(currentFood < maxFood ){
				
				player.getFoodStats().setFoodLevel(currentFood +2);
				TextUtil.sendChat(player, "Food added" );
			}	
		if(currentFood > 20){
					player.getFoodStats().setFoodLevel(maxFood);
		
		}
	}
		return super.onItemRightClick(stack, world, player);
	}
	
	
	@Override
	public void addInformation(ItemStack stack,
			EntityPlayer player, List list, boolean par4) {
		list.add("Right clicking adds a nugget");
		list.add("Sneaking right clicking takes a nugget");
		
		super.addInformation(stack, player, list, par4);
	}
	

}
