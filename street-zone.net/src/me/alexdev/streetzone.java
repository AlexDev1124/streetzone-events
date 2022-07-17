package me.alexdev;

import me.alexdev.commands.StreetCommands;
import me.alexdev.events.PlayerManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class streetzone extends JavaPlugin {

    public void onEnable() {
        getCommand("street").setExecutor(new StreetCommands());

        Bukkit.getPluginManager().registerEvents(new PlayerManager(), this);
        Bukkit.getConsoleSender().sendMessage("§aPlugin Ativado");
    }
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§cPlugin Desativado");
    }

}
