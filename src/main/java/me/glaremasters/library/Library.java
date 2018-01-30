package me.glaremasters.library;

import me.glaremasters.library.commands.CommandSave;
import me.glaremasters.library.commands.CommandHelp;
import me.glaremasters.library.commands.base.CommandHandler;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.stream.Stream;


public class Library extends JavaPlugin {

    private static Library i;
    private CommandHandler commandHandler;
    private static String prefix;

    public static Library getI() {
        return i;
    }

    @Override
    public void onEnable() {

        i = this;

        prefix = ChatColor.translateAlternateColorCodes('&', getConfig().getString("plugin-prefix"))
                + ChatColor.RESET + " ";

        saveDefaultConfig();

        commandHandler = new CommandHandler();
        commandHandler.enable();

        getCommand("library").setExecutor(commandHandler);

        Stream.of(
                new CommandHelp(), new CommandSave()
        ).forEach(commandHandler::register);

    }

    @Override
    public void onDisable() {

    }

    public static String getPrefix() {
        return prefix;
    }

}
