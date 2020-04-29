package me.osireon.playerjoinandleaveplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class PlayerLeave implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerQuitEvent event){

        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.GOLD + "Why u leave" + " " + ChatColor.AQUA + player.getDisplayName() + " ");


    }
}
