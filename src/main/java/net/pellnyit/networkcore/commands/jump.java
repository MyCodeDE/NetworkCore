
package net.pellnyit.networkcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class jump implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.hasPermission("perm.command.jump");
        sender.sendMessage("you cant jump here.");
        return false;
    }
}
