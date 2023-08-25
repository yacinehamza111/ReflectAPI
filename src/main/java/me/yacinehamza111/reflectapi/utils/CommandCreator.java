package me.yacinehamza111.reflectapi.utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class CommandCreator implements CommandExecutor {

    private final CommandInfo commandInfo;

    public CommandCreator() {
        commandInfo = getClass().getDeclaredAnnotation(CommandInfo.class);
        Objects.requireNonNull(commandInfo, "Commands must have the CommandInfo annotations.");
    }

    public CommandInfo getCommandInfo() {
        return commandInfo;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!commandInfo.permission().isEmpty()) {
            if (!sender.hasPermission(commandInfo.permission())) {
                sender.sendMessage(Color.color("&cYou don't have permission to execute this command."));
                return true;
            }
        }

        if (commandInfo.requiresPlayer()) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(Color.color("&cYou must be a player to execute this command."));
                return true;
            }

            execute((Player) sender, args);
            return true;
        }

        execute(sender, args);
        return true;
    }

    public void execute(Player player, String[] args) {}
    public void execute(CommandSender sender, String[] args) {}
}
