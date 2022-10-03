package net.pellnyit.networkcore;

import net.pellnyit.networkcore.commands.helpCommand;
import net.pellnyit.networkcore.listeners.MessagesListener;
import net.pellnyit.networkcore.listeners.MovementListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

 // (c) Pellny-IT 2022
public final class NetworkCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("System load ...");
        getCommand("help").setExecutor(new helpCommand());
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new MessagesListener(), this);
        pluginManager.registerEvents(new MovementListener(), this);
        // Movement is a nice variable xD

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("System unload ...");
        // Plugin shutdown logic
    }
}
