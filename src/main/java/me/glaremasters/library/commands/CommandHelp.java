package me.glaremasters.library.commands;

import me.glaremasters.library.Library;
import me.glaremasters.library.commands.base.CommandBase;
import me.glaremasters.library.util.ColorUtil;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class CommandHelp extends CommandBase {

    public CommandHelp() {
        super("help", "List all commands", "library.help", false, null, null, 0, 0);
    }

    public void execute(CommandSender sender, String[] args) {
        FileConfiguration config = Library.getI().getConfig();

        sender.sendMessage(ColorUtil.color(config.getString("messages.help")));
        sender.sendMessage(ColorUtil.color(config.getString("messages.save")));
    }

}