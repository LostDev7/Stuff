package me.osireon.inventoryanditems;

import me.osireon.inventoryanditems.commands.Vault;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;


public final class InventoryAndItems extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Inventory Plugin Beginning");

        Objects.requireNonNull(getCommand("Vault")).setExecutor(new Vault());
    }
}
