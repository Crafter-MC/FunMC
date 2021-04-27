package rocks.crafter.funmc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Welcome implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("hello")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (player.hasPermission("hello.use")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Hey welcome to the server!");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1H&2a&3v&4e &5f&6u&7n&8!"));
                    return true;
                }
                player.sendMessage(ChatColor.RED + "You do not have permission to use this commmand!");
                return true;
            }
            else {
                sender.sendMessage("Hey console");
                return true;
            }
        }


        return false;
    }
}
