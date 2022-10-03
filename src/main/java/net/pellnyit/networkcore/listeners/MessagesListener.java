package net.pellnyit.networkcore.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MessagesListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.AQUA + player.getName() + "" + ChatColor.GRAY + "Joined the Server ...");
        //Message when you join.

    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.AQUA + player.getName() + "" + ChatColor.GRAY + "Left the Server -.-" );
        //Message when you Quit
    }
}
