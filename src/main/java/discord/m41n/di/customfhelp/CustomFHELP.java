package discord.m41n.di.customfhelp;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomFHELP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Command(), this );
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
