package xyz.banthatloser.clearchat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.md_5.bungee.api.ChatColor;

public class clearchat
        implements CommandExecutor
{
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args)
    {
        if (!(s instanceof Player))
        {
            s.sendMessage(ChatColor.RED + "You must be a player to do this.");
            return false;
        }
        Player p = (Player)s;
        if (cmd.getName().equalsIgnoreCase("clearchat"))
        {
            if (p.hasPermission("clearchat.use"))
            {
                for (int i = 0; i < 100; i++) {
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        all.sendMessage("");
                    }
                }
                Bukkit.broadcastMessage(ChatColor.GRAY + "Chat cleared by" + ChatColor.RED + p.getName());
                return true;
            } 
            p.sendMessage(ChatColor.RED + "You dont have permissions!");
        }
        return false;
    }
}
