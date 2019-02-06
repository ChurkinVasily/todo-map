package ru.churkin.repository;


class createCommand extends command{

    private String key;
    private String name;

    public createCommand(String name) {
        setKey("-c");
        setName("creating");
    }

    @Override
    boolean realize(String key) {
        return false;
    }
}
