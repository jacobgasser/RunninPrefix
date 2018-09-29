package com.runninplugins.prefix.utilities;

import com.runninplugins.prefix.Main;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    private static List<Tag> tags = new ArrayList<>();
    private boolean isHoverable;
    private String hoverContent;
    private String content;
    private String tagName;
    public Tag(String tagName, String content, boolean isHoverable, String hoverContent) {
        this.tagName = tagName;
        this.content = content;
        this.isHoverable = isHoverable;
        this.hoverContent = hoverContent;
        tags.add(this);
        writeTag(this);
    }


    public List<Tag> getTags() {
        return tags;
    }
    public static Tag getTagByName(String name) {
        for(Tag tag : tags) {
            if(tag.getTagName().equals(name)) {
                return tag;
            }
        }
        return null;
    }

    public void writeTag(Tag tag) {
        FileConfiguration config = Main.getMain().getConfig();
        String name = tag.getTagName();
        config.set(name + ".content", getContent());
        config.set(name + ".hoverContent", getHoverContent());
        config.set(name + ".isHoverable", getIsHoverable());
        Main.getMain().saveConfig();
    }
    public String getTagName() { return tagName;}
    public String getContent(){ return this.content;}
    public String getHoverContent(){ return this.hoverContent;}
    public boolean getIsHoverable(){ return this.isHoverable;}
}


