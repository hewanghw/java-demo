package com.hw;

import java.util.List;

public class Building {
    private String id;
    private String name;
    private String pid;
    private List<Building> children;

    public Building(String id, String name, String pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List<Building> getChildren() {
        return children;
    }

    public void setChildren(List<Building> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": \"" + id + "\"" +
                ", \"name\": \"" + name + "\"" +
                ", \"pid\": \"" + pid + "\"" +
                ", \"children\": " + children +
                "}";
    }
}
