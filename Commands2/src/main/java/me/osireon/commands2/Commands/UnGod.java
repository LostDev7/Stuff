package me.osireon.commands2.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class UnGod implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(sender instanceof Player){
        Player player = (Player) sender;
            if(player.hasPermission( "Commands2.UnGod")){
                player.sendMessage(ChatColor.BLACK + "You can now be harmed");
                player.setInvulnerable(false);
            }else{player.sendMessage("You don't have the permission to run this command");}
        }
        return false;
    }



}
