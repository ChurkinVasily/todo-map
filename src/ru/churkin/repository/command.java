package ru.churkin.repository;

import java.util.Map;

public abstract class command {

    String commandName;
    String commandCall;

    abstract boolean realize(String key, Map<String, String> map, String name);


}
