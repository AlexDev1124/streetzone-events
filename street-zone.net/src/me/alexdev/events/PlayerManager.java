package me.alexdev.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerManager implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage("§aEntrou ➤ §7" + e.getPlayer().getName() + " §c❤");
    }

}
