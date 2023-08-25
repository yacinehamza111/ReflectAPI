package me.yacinehamza111.reflectapi;

import me.yacinehamza111.reflectapi.utils.CommandCreator;
import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;

public final class ReflectAPI extends JavaPlugin {


    @Override
    public void onEnable() {
        String packageName = getClass().getPackage().getName();

        getLogger().info("Plugin Enabled!");

        for (Class<? extends CommandCreator> clazz : new Reflections(packageName + ".commands").getSubTypesOf(CommandCreator.class)) {
            try {
                CommandCreator commandCreator = clazz.getDeclaredConstructor().newInstance();
                getCommand(commandCreator.getCommandInfo().name()).setExecutor(commandCreator);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // commands

        // events

        // utils

        // random stuff



    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Disabled!");
    }
}
