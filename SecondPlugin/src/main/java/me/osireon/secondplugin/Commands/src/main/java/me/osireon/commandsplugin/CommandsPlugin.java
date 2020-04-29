package me.osireon.commandsplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class CommandsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(command.getName().equals("speed")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 2500, 5));}

        }else{
            System.out.println("You need to be the player to use this command");
        }
        if(command.getName().equals("jump")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 2500, 5));}

        }else{
            System.out.println("You need to be the player to use this command");
        }


        return false;
    }
}
