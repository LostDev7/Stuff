package me.osireon.commands2.Commands;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodMode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(sender instanceof Player){

         Player player = (Player) sender;
         player.setInvulnerable(true);
         player.sendMessage(ChatColor.WHITE + "You now cannot be harmed.");

        }


        return false;
    }
}
