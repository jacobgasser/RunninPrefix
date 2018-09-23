package com.runninplugins.prefix;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
            User user = new User(event.getPlayer());

    }
}
