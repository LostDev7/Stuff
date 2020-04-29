package me.osireon.secondplugin;

import com.google.common.cache.CacheStats;
import com.sun.java.swing.action.OpenAction;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;


public final class SecondPlugin extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("It was the funniest shit I've ever seen he turned himself into a pickle");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEatFood(PlayerItemConsumeEvent event) {

        Player player = event.getPlayer();


        if (event.getItem().getType() == Material.COOKED_BEEF) {

            player.sendMessage("Mmmm, Steak.");

        } else if (event.getItem().getType() == Material.COOKED_RABBIT){

            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 600, 10));

        }
        else if (event.getItem().getType() == Material.COOKED_CHICKEN){
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 3000, 10));
        }

    }
    @EventHandler
    public void onHitSheep(EntityDamageByEntityEvent event){

        Player player = (Player) event.getDamager();
        ItemStack weapon = player.getInventory().getItemInMainHand();

        if(event.getDamager() instanceof Player && event.getEntity().getType() == EntityType.SHEEP && weapon.getType() == Material.STONE_SWORD){
            event.setCancelled(true);
            player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 3000, 3));
        }


    }


    @EventHandler
    public void wakeUpFromBed(PlayerBedLeaveEvent event){
        //when the player leaves the bed it will trigger this effect giving slowness
        Player player = event.getPlayer();
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 900, 1000));
    }
    @EventHandler
    public void doorBroken(PlayerInteractEvent event){

        if (Objects.requireNonNull(event.getClickedBlock()).getType() == Material.OAK_DOOR){
            event.setCancelled(true);
            event.getPlayer().sendMessage("Worked");
        }
    }

    @EventHandler
    public void hitBee(EntityDamageByEntityEvent event){
        Player player = (Player) event.getDamager();

        if (event.getEntity().getType() == EntityType.BEE){
            event.setCancelled(true);
            player.setHealth(0);
            player.sendMessage("Death to you.");
        }
    }
    @EventHandler
    public void collectFlower(PlayerInteractEvent event){
        Player player = event.getPlayer();

        if(Objects.requireNonNull(event.getClickedBlock()).getType() == Material.RED_TULIP){
            event.setCancelled(true);
            player.sendMessage("Do not touch the flowers.");
        }
        else if(Objects.requireNonNull(event.getClickedBlock()).getType() == Material.ORANGE_TULIP){
            event.setCancelled(true);
            player.sendMessage("Do not touch the flowers.");
        }
        else if(Objects.requireNonNull(event.getClickedBlock()).getType() == Material.PINK_TULIP){
            event.setCancelled(true);
            player.sendMessage("Do not touch the flowers.");
        }

    }
    @EventHandler
    public void openChest(PlayerInteractEvent event){

        Player player = event.getPlayer();

        if (event.getAction() == Action.RIGHT_CLICK_BLOCK && Objects.requireNonNull(event.getClickedBlock()).getType() == Material.CHEST){

            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 30));
        }

    }

    @EventHandler
    public void hitCow(EntityDamageByEntityEvent event){

        Player player = (Player) event.getDamager();
        ItemStack weapon = player.getInventory().getItemInMainHand();
        if (event.getEntity().getType() == EntityType.COW && weapon.getType() == Material.STONE_SHOVEL){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 8000, 4));
        }

    }

    @EventHandler
    public void enterBed(PlayerBedEnterEvent event){

        Player player = event.getPlayer();
        player.damage(2);
    }
    @EventHandler
    public void eatFish(PlayerItemConsumeEvent event){
        Player player = event.getPlayer();

        if (event.getItem().getType() == Material.SALMON){
            player.damage(8);
        }

    }

    @EventHandler
    public void hitBeeHive(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Material beehive = Material.BEEHIVE;
        Material beehiveNest = Material.BEE_NEST;

        if (event.getAction() == Action.LEFT_CLICK_BLOCK && Objects.requireNonNull(event.getClickedBlock()).getType() == beehive){
            event.setCancelled(true);
            player.setHealth(0);
            player.sendMessage(ChatColor.YELLOW + "heehee.. mistake :>");
        }
        else if (event.getAction() == Action.LEFT_CLICK_BLOCK && Objects.requireNonNull(event.getClickedBlock()).getType() == beehiveNest){
            event.setCancelled(true);
            player.setHealth(0);
            player.sendMessage(ChatColor.YELLOW + "heehee.. mistake :>");
        }

    }

    @EventHandler
    public void squidAttack(EntityDamageByEntityEvent event){
        Player player = (Player) event.getDamager();

        if (event.getEntity().getType() == EntityType.SQUID){

            player.damage(12);
            player.sendMessage(ChatColor.DARK_BLUE + "Punched Squid");
        }

    }

    @EventHandler
    public void waterAndLava (PlayerMoveEvent event){

        Player player = event.getPlayer();

        if (player.getLocation().getBlock().getType() == Material.WATER){
            player.setHealth(0);
        }
        else if (player.getLocation().getBlock().getType() == Material.LAVA){
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000, 5));
        }
    }

    @EventHandler
    public void hitSpider(EntityDamageByEntityEvent event){

        Player player = (Player) event.getDamager();

        if (event.getEntity().getType() == EntityType.SPIDER){

            event.setCancelled(true);
            player.sendMessage(ChatColor.BLACK + "nice try");
        }


    }

    @EventHandler
    public void fireWork(PlayerInteractEvent event){

        Player player = event.getPlayer();

        if (Objects.requireNonNull(event.getItem()).getType() == Material.FIREWORK_ROCKET && event.getAction() == Action.LEFT_CLICK_AIR){

            player.sendMessage(ChatColor.RED + "yay boom boom bee :>");
        }

    }
    @EventHandler
    public void isSneaking(PlayerToggleSneakEvent event){

        Player player = event.getPlayer();

        if (event.isSneaking()){
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000, 50));
        }
        if (!event.isSneaking()){
            player.removePotionEffect(PotionEffectType.NIGHT_VISION);
        }
    }
    @EventHandler
    public void potionGlassConsume(PlayerItemConsumeEvent event){

        Player player = event.getPlayer();

        if (event.getItem().getType() == Material.POTION){

            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 5000, 500));

        }
    }
}



