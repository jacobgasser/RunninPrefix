package com.runninplugins.prefix;

import com.runninplugins.prefix.commands.CMDnew;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main instace;
    public static Main getMain() {
        return instace;
    }

    public void onEnable() {
        Bukkit.getPluginCommand("new").setExecutor(new CMDnew());
        getServer().getPluginManager().registerEvents(new OnChat(), this);
        getServer().getPluginManager().registerEvents(new OnJoin(), this);

        DetectOnlineUsers();
    }
    public void DetectOnlineUsers() {
        for(Player player : Bukkit.getOnlinePlayers()) {
            User user = new User(player);

        }
    }
}
//Hoverable tags
//colorable tags
//custom tags
