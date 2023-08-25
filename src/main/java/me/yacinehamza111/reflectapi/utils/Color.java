package me.yacinehamza111.reflectapi.utils;

import org.bukkit.ChatColor;

public class Color {

    public static String color(String color) {
        return ChatColor.translateAlternateColorCodes('&', color);
    }

}
