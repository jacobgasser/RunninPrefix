package com.runninplugins.prefix.commands;

import com.runninplugins.prefix.utilities.Tag;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.ArrayList;

@com.runninplugins.prefix.commands.Command

public class NewPrefix extends BukkitCommand {

    protected NewPrefix() {
        super("NewPrefix");
        ArrayList<String> aliases = new ArrayList<>();
        aliases.add("newprefix");
        this.description = "Set the prefix of a player ";
        this.usageMessage = "/SetPrefix <player> <prefix>";

        this.setPermission("prefix");
        this.setAliases(aliases);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        boolean isHoverable = false;
        if(args[2] == "true") {
            isHoverable = true;
        }
        Tag tag = new Tag(args[0],args[1],isHoverable,args[3]);
        return true;
    }
}
