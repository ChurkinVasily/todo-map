package ru.churkin.repository;

import java.util.Map;

public class createCommand extends command{


    @Override
    boolean realize(String key, Map<String, String> map, String name) {
        return false;
    }
}
