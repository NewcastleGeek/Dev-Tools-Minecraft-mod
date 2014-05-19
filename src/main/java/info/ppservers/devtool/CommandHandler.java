package info.ppservers.devtool;

import info.ppservers.devtool.lib.TextUtil;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;

public class CommandHandler extends CommandBase{

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "dev";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		
		return "/" + this.getCommandName() + "help";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		int amount = Integer.parseInt(args[1]);
		if(args.length <= 0)
			throw new WrongUsageException("type "+ this.getCommandUsage(sender) + " for help");
		
		if(args[0].matches("Help".toLowerCase())){
			sendChat(sender, "Dev Tool adds a bunch of useful ingame Commands to help during testing");
			sendChat(sender, "Visit <ADDRESS HERE> for more info");
		}
		
	}
	
	
	private void sendChat(ICommandSender sender, String string) 
	{
		//sender.sendChatToPlayer(ChatMessageComponent.createFromText(string));
        sender.addChatMessage(TextUtil.getChatComponent(string, EnumChatFormatting.WHITE));
	}

}
