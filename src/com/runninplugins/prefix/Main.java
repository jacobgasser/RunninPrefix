package com.runninplugins.prefix;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnChat(), this);
        getServer().getPluginManager().registerEvents(new OnJoin(), this);

        DetectOnlineUsers();
    }
    public void DetectOnlineUsers() {
        for(Player player : Bukkit.getOnlinePlayers()) {
            new User(player);
        }
    }
}
//Hoverable tags
//colorable tags
//custom tags
