package xyz.banthatloser.clearchat;

import java.io.PrintStream;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Server;
import org.bukkit.event.Listener;


public class clout
    extends JavaPlugin
        implements Listener
    {
        public void onEnable()
        {
            System.out.print("clearchat Developed by banthatloser");
            System.out.print("");
            System.out.print("clearchat Enabled!");
            System.out.print("");
            System.out.print("Plugin now will help you manage your chat messages!");
            getServer().getPluginManager().registerEvents(this, this);
        }

        public void onDisable()
        {
            System.out.print("clearchat Developed by banthatloser");
            System.out.print("");
            System.out.print("clearchat Disabled!");
        }


}
