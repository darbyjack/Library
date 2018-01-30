package me.glaremasters.library;

import me.glaremasters.library.commands.base.CommandHandler;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class Library extends JavaPlugin {

    private Library i;
    private CommandHandler commandHandler;
    private static String prefix;

    public Library getI() {
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

    }

    @Override
    public void onDisable() {

    }

    public static String getPrefix() {
        return prefix;
    }

}
