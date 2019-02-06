package ru.churkin.repository;

import java.util.Map;

public abstract class command {

    private String name;
    private String key;

    abstract boolean realize(String key);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
