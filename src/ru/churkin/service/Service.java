package ru.churkin.service;

import ru.churkin.entity.Command;
import ru.churkin.repository.CreateCommand;
import ru.churkin.repository.DeleteCommand;
import ru.churkin.repository.ReadCommand;
import ru.churkin.repository.UpdateCommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Service {


    public Service() {
    }

    public void startService() throws IOException {

        Map<String, Command> commands = new HashMap<>();
        commands.put("-c", new CreateCommand());
        commands.put("-r", new ReadCommand());
        commands.put("-u", new UpdateCommand());
        commands.put("-d", new DeleteCommand());

        System.out.println("enter code: -c for create, -r for read, -u for update, -d for remove, exit for exit");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = reader.readLine();

        while (!"exit".equals(key)){
            if (commands.containsKey(key)) {
                commands.get(key).realize();
            }
            else {
                System.out.println("no such key. enter another key");
            }
        }
        reader.close();

    }

}


