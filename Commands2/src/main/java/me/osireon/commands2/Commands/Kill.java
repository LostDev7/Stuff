package me.osireon.commands2.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kill implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {



        if(sender instanceof Player){
            Player player = (Player) sender;
            if(args.length == 0){
                player.sendMessage("You Committed Suicide");
                player.setHealth(0);
            }else{
                Player Target = Bukkit.getPlayerExact(args[0]);
                if(Target instanceof Player){
                    Target.sendMessage("You were killed");
                    Target.setHealth(0);
                    player.sendMessage("You killed a player named" + " " + Target.getDisplayName());
                }else{
                    player.sendMessage("You need to target a real player.");
                }

            }

        }





        return false;
    }
}
