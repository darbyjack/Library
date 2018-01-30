package me.glaremasters.library;

import me.glaremasters.library.commands.base.CommandHandler;
import org.bukkit.plugin.java.JavaPlugin;


public class Library extends JavaPlugin {

    private Library i;
    private CommandHandler commandHandler;

    public Library getI() {
        return i;
    }

    @Override
    public void onEnable() {

        i = this;

        commandHandler = new CommandHandler();
        commandHandler.enable();

        getCommand("library").setExecutor(commandHandler);

    }

    @Override
    public void onDisable() {

    }

}
