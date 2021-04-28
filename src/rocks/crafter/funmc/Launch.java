package rocks.crafter.funmc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Launch implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("launch")) {
            if(!(sender instanceof Player)) {
                sender.sendMessage("silly console you cant fly");
                return true;
            }
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage((ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "ZOOOOOOOOOOOOOOOOOOOOOOOM!"));
                player.setVelocity(player.getLocation().getDirection().multiply(2).setY(2));

                return true;
            } else {

                player.sendMessage((ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "ZOOOOOOOOOOOOOOOOOOOOOOOM!"));
                player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[0])).setY(2));

                return true;
            }
        }
        return false;
    }
}
