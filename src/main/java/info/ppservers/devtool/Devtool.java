package info.ppservers.devtool;

import info.ppservers.devtool.lib.Reference;
import info.ppservers.devtool.moditems.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;


@Mod(modid = Reference.MOD_ID, version = Reference.VERSION , name = Reference.MOD_NAME)
public class Devtool {

	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent pre){
		
		ModItems.addItems();
		ModItems.RegisterItems();
	}
	
	
	@EventHandler
	public static void Init(FMLInitializationEvent init){
		
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent post){
		
		
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandHandler());
	}
	
	
	
}
