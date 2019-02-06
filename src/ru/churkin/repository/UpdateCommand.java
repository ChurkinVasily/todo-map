package ru.churkin.repository;

import ru.churkin.entity.Command;
import ru.churkin.entity.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpdateCommand extends Command {

    public UpdateCommand() {
        setKey("-u");
        setName("updating");
    }

    @Override
    public void realize() throws IOException {
        System.out.println("enter id");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String id = reader.readLine();

        if (!taskList.containsKey(id)) {
            Task task = new Task();
            System.out.println("enter task parameters: name, project, start time, end time, user name");
            task.setTaskName(reader.readLine());
            task.setProject(reader.readLine());
            task.setStartTime(reader.readLine());
            task.setEndTime(reader.readLine());
            task.setUserName(reader.readLine());
            taskList.put(id, task);
            System.out.println("one note successfully updated");
        }
        else {
            System.out.println("no such name. cannot updating");
        }
    }
}
