package org.example.MyPlugin.myPlugin.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.example.MyPlugin.myPlugin.MyPlugin;

public class TorchHandler implements Listener {
    public TorchHandler(MyPlugin plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.LOW)
    public void OnTorchPlace_Low(BlockPlaceEvent event) {
        Block block = event.getBlock();

        if (block.getType() == Material.DIRT) {
            event.getBlock().setType(Material.GOLD_BLOCK);
            Bukkit.getLogger().info("A DIRT wAS TURNED INTO A DIAMOND BLOCK");
        }
    }

    @EventHandler
    public void OnTorchPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();

        if (block.getType() != Material.TORCH) {
            return;
        }
        Bukkit.getLogger().info("A torch was placed (PLACED TORCH");
    }

}
