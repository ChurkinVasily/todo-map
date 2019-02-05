package ru.churkin.repository;

import java.util.Map;

public abstract class command {

    String name;
    String key;

    abstract boolean realize(String key);


}
