package net.pellnyit.networkcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class helpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.hasPermission("perm.command.help");
        sender.sendMessage("our discord: discord.gg/yourdiscord");
        return false;
    }
}
