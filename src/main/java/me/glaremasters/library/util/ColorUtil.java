package me.glaremasters.library.util;

import me.glaremasters.library.Library;
import org.bukkit.ChatColor;

public class ColorUtil {

    public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', Library.getPrefix() + string);
    }

}