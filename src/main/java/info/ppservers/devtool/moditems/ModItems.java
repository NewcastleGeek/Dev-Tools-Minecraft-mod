package info.ppservers.devtool.moditems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item foodmody;
	public static Item HealthMody;
	public static Item timeLocky;
	public static Item timeChangey;
	
	
	
	public static void addItems(){
		
		foodmody = new foodmody();
		HealthMody = new HealthMody();
		timeChangey = new timeChangey();
		timeLocky = new timeLocky();
		
	}
	
	
	public static void RegisterItems(){
		GameRegistry.registerItem(foodmody, "FoodModifier");
		GameRegistry.registerItem(HealthMody, "Health modifier");
		GameRegistry.registerItem(timeChangey, "Timechanger");
		GameRegistry.registerItem(timeLocky, "time lock");
		
		
	}

}
