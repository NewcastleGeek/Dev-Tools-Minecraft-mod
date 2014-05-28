package info.ppservers.devtool.lib;

import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class TextUtil {
	
	public static ChatComponentStyle getChatComponent(Object message, EnumChatFormatting formatting) {
        ChatComponentText componentText = new ChatComponentText(message.toString());
        componentText.getChatStyle().setColor(formatting);
        return componentText;
    }
	
	public static void sendChat(ICommandSender sender, String string) 
	{
		
        sender.addChatMessage(TextUtil.getChatComponent(string, EnumChatFormatting.WHITE));
	}

}
