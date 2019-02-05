package ru.churkin.repository;


public class createCommand extends command{

    private String commandName = "creating";
    private String commandCall = "-c";

    public createCommand(String commandCall) {
        this.commandCall = commandCall;
    }

    @Override
    boolean realize(String key) {
        return false;
    }
}
