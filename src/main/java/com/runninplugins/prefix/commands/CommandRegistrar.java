package com.runninplugins.prefix.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.command.defaults.BukkitCommand;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.Set;

public class CommandRegistrar {



    public void registerCommand(BukkitCommand command){
        try {
            final Field bukkitCommandMap = Bukkit.getServer().getClass().getDeclaredField("commandMap");

            bukkitCommandMap.setAccessible(true);
            CommandMap commandMap = (CommandMap) bukkitCommandMap.get(Bukkit.getServer());

            commandMap.register(command.getName(), command.getClass().newInstance());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void addCommands(){
        Reflections reflections = new Reflections("com.runninplugins.prefix.commands");
        Set<Class<? extends BukkitCommand>> commands = reflections.getSubTypesOf(BukkitCommand.class);
        try {
            for(Class<? extends BukkitCommand> clazz : commands){
                    registerCommand((BukkitCommand) clazz.newInstance());
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }




}
