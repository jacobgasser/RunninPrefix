package com.runninplugins.prefix;

import org.bukkit.ChatColor;

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
    }
    public String getTagName() {
        return tagName;
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
}


