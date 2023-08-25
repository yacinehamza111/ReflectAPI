package me.yacinehamza111.reflectapi.commands;

import me.yacinehamza111.reflectapi.utils.Color;
import me.yacinehamza111.reflectapi.utils.CommandCreator;
import me.yacinehamza111.reflectapi.utils.CommandInfo;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

@CommandInfo(name = "reflect", requiresPlayer = true)
public class ReflectCommand extends CommandCreator {

    public String[] playermsg = {
            "&6=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=",
            "",
            "&aReflectAPI made by &byacinehamza111",
            "",
            "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
    };

    @Override
    public void execute(Player player, String[] args) {
        if (args.length > 0) {

            if (args[0].equals("help")) {
                player.sendMessage(Color.color("&6=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="));
                player.sendMessage(Color.color(""));
                player.sendMessage(Color.color("&a/reflect - The main command for ReflectAPI"));
                player.sendMessage(Color.color(""));
                player.sendMessage(Color.color("&6=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="));
            }

        } else {
            player.sendMessage(Color.color("&6=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="));
            player.sendMessage(Color.color(""));
            player.sendMessage(Color.color("&aReflectAPI made by &byacinehamza111"));
            player.sendMessage(Color.color(""));
            player.sendMessage(Color.color("&6=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="));
        }
    }
}
