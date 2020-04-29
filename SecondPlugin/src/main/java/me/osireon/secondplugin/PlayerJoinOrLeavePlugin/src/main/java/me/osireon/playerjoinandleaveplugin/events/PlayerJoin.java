package me.osireon.playerjoinandleaveplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.GOLD + "Welcome back to the server" + " " + ChatColor.AQUA + player.getDisplayName() + " ");

    }

}
