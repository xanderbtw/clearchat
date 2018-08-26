package xyz.banthatloser.clearchat;

import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class main
        extends JavaPlugin
{
    public void onEnable()
    {
        getCommand("clearchat").setExecutor(new clearchat());
    }



}
