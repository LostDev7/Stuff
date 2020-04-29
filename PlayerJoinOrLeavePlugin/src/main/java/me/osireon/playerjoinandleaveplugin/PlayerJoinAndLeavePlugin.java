package me.osireon.playerjoinandleaveplugin;

import me.osireon.playerjoinandleaveplugin.events.PlayerJoin;
import me.osireon.playerjoinandleaveplugin.events.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerJoinAndLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
    }

}
