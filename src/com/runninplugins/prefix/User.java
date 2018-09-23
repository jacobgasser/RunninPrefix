package com.runninplugins.prefix;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Player player;
    private String displayName;
    private Tag tag;
    private static List<User> users = new ArrayList<>();
    public User(Player player) {
        this.displayName = player.getDisplayName();
        this.player = player;
        users.add(this);
    }

    public String getDisplayName() {
        return displayName;
    }
    public Player getPlayer() {
        return player;
    }

    public static List<User> getUsers() {
        return users;
    }

    public static User getUserByPlayer(Player player) {
        for(User user : users) {
            if(user.getPlayer().equals(player)) {return user;}
        }
        return null;
    }
}
