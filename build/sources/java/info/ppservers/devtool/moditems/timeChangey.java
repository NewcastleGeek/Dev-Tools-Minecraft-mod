package info.ppservers.devtool.moditems;

import info.ppservers.devtool.lib.Reference;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class timeChangey extends Item {
		
	
		public timeChangey(){
			this.setMaxStackSize(1);
			this.setCreativeTab(CreativeTabs.tabMisc);
			this.setUnlocalizedName("timchanger");
			this.setTextureName(Reference.MOD_ID +  ":timechanger");
			
		}
			
			@Override
			public ItemStack onItemRightClick(ItemStack stack, World world,
					EntityPlayer player) {
				
				long currentTime = world.getWorldTime();
				
				if(player.isSneaking()){
					world.setWorldTime(18000);
					
				}
				else{
					world.setWorldTime(0);
				}	
				return super.onItemRightClick(stack, world, player);
			}
			
			
			@Override
			public void addInformation(ItemStack stack,
					EntityPlayer player, List list, boolean par4) {
				list.add("Right clicking maki it day");
				list.add("Sneaking right click makes night");
				
				super.addInformation(stack, player, list, par4);
			}
			
		
}
