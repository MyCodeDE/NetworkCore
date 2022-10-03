package net.pellnyit.networkcore.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

//Thats a weird System xD

public class MovementListener implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent event){
        Player player = event.getPlayer();
        player.sendMessage("you have moved ...");
        player.kickPlayer("Moving is not enable on this network ...");

    }
}
