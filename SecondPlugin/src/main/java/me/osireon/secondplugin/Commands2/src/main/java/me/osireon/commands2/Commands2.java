package me.osireon.commands2;

import me.osireon.commands2.Commands.GodMode;
import me.osireon.commands2.Commands.Kill;
import me.osireon.commands2.Commands.SendMessage;
import me.osireon.commands2.Commands.UnGod;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Commands2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(getCommand("GodMode")).setExecutor(new GodMode());
        Objects.requireNonNull(getCommand("UnGod")).setExecutor(new UnGod());
        Objects.requireNonNull(getCommand("SendMessage")).setExecutor(new SendMessage());
        Objects.requireNonNull(getCommand("Kill")).setExecutor(new Kill());
    }


}
