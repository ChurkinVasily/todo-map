package ru.churkin.entity;

import java.io.IOException;

public abstract class Command {

    private String name;
    private String key;

    public abstract void realize() throws IOException;





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
