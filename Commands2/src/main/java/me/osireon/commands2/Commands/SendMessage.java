package me.osireon.commands2.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SendMessage implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player){
            Player player = (Player) sender;

            if(args.length > 0){
               if(args[0].equalsIgnoreCase("Kitten")){
                   player.sendMessage("HI KITTEN!");
               }else{player.sendMessage("Wrong Word");}
            }else{
                player.sendMessage("Must input a word to the command");
                player.sendMessage("/SendMessage (word)");
            }

        }else{System.out.println("You need to be a player u fucking dip shit");}



        return false;
    }
}
