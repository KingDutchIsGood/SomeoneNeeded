package discord.m41n.di.customfhelp;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.EventListener;

public class Command implements Listener {
    @EventHandler
    public void onCommandEvent(PlayerCommandPreprocessEvent event)
    {
        if(event.getMessage().equalsIgnoreCase("/f help"))
        {
            JavaPlugin plugin = JavaPlugin.getPlugin(CustomFHELP.class);
            for (int i = 0; i < plugin.getConfig().getList("CustomMessageForFHELP").size(); i++)
            {
                String[] message = plugin.getConfig().getStringList("CustomMessageForFHELP").toArray(new String[0]);
                event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&' ,message[i]));
            }
            event.setCancelled(true);
        }
    }
}
