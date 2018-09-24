package com.runninplugins.prefix.commands;

import com.runninplugins.prefix.Tag;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CMDnew implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        boolean isHoverable = false;
        if(args[2] == "true") {
            isHoverable = true;
        }
        Tag tag = new Tag(args[0],args[1],isHoverable,args[3]);
        return true;
    }
}
