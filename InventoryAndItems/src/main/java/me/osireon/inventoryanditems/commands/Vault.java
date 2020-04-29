package me.osireon.inventoryanditems.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Vault implements CommandExecutor{


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(sender instanceof Player){
            Player player = (Player) sender;
            Inventory vault = Bukkit.createInventory(player,36, "Vault");
            player.sendMessage("You have opened your vault");
            ItemStack Item1 = new ItemStack(Material.DIAMOND, 64);
            ItemStack Item2 = new ItemStack(Material.GOLD_INGOT, 64);
            ItemStack Item3 = new ItemStack(Material.SKELETON_SPAWN_EGG, 64);
            ItemStack[] items = {Item1, Item2, Item3};
            Item1.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 10000);
            ItemMeta meta = Item1.getItemMeta();
            meta.setDisplayName("Special Diamond");
            Item1.setItemMeta(meta);
            vault.setContents(items);
            player.openInventory(vault);
        }else{
            System.out.println("You must be a player to run this command");
        }




        return true;
    }
}
