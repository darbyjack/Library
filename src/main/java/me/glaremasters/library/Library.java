package me.glaremasters.library;

import org.bukkit.plugin.java.JavaPlugin;

public class Library extends JavaPlugin {

    private Library i;

    public Library getI() {
        return i;
    }

    @Override
    public void onEnable() {

        i = this;

    }

    @Override
    public void onDisable() {

    }

}
