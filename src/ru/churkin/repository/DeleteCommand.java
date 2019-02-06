package ru.churkin.repository;

import ru.churkin.entity.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteCommand extends Command {

    private String key;
    private String name;

    public DeleteCommand() {
        setKey("-d");
        setName("remove");
    }

    @Override
    public void realize() throws IOException {
        System.out.println("enter id");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String id = reader.readLine();

        if (taskList.containsKey(id)){
            taskList.remove(id);
            System.out.println("one note successfully removed");
        }
        else {
            System.out.println("no such name. cannot remove");
        }
    }
}
