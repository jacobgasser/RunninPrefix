package com.runninplugins.prefix;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnChat(), this);
        getServer().getPluginManager().registerEvents(new OnJoin(), this);
    }
}
//Hoverable tags
//colorable tags
//custom tags
