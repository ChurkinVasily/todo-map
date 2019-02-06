package ru.churkin.repository;

import ru.churkin.entity.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCommand extends Command {

    private String key;
    private String name;

    public ReadCommand() {
        setKey("-r");
        setName("reading");
    }

    @Override
    public void realize() throws IOException {
        System.out.println("enter id");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String id = reader.readLine();

        if (taskList.containsKey(id)){
            System.out.println(taskList.get(id).toString());
        }
        else {
            System.out.println("no such name. cannot read");
        }
    }
}

