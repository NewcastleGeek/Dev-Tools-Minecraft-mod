package info.ppservers.devtool.moditems;

import info.ppservers.devtool.lib.Reference;
import info.ppservers.devtool.lib.TextUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class XpChanger extends Item {
	
	public XpChanger (){
		this.setMaxStackSize(0);
		this.setUnlocalizedName("XPmod");
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setTextureName(Reference.MOD_ID + ":XpMod");
		
		
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		int current = player.experienceLevel;
		float maxXP = 999;
		//Removing food
		if(!world.isRemote){
			if(player.isSneaking() && current > 2){	
				//TextUtil.sendChat(player, "Currently " + current);
				player.experienceLevel = (current -10);
					//TextUtil.sendChat(player, "hearts removed");
				}
		//Adding food
		else 
			if(current < maxXP ){
				//TextUtil.sendChat(player, "Currently " + current);
				player.addExperienceLevel(current +1);
				
				//TextUtil.sendChat(player, "Food added" + foodOut );
			}	
		
	}
		return super.onItemRightClick(stack, world, player);
	}

}
