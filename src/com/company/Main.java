package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        String todoName;
        String todoDescription;

        Map<String, String> todoList = new HashMap<>();
        todoList.put("1", "aaa");
        todoList.put("2", "bbb");
        todoList.put("3", "ccc");

        /*Integer id;
        Map<Integer, Todo> todoList2 = new HashMap<>();
        todoList2.put(id++, new Todo("1", "aaa"));
        todoList2.put(id++, new Todo("2", "bbb"));
        todoList2.put(id++, new Todo("3", "ccc"));*/

        System.out.println("enter code: -c for create, -r for read, -u for update, -d for remove or 'show all' ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String code = reader.readLine();

        while (true) {
            switch (code) {
                case "-c":
                    todoName = reader.readLine();
                    if (!todoList.containsKey(todoName)){
                        todoDescription = reader.readLine();
                        todoList.put(todoName, todoDescription);
                        System.out.println("one note successfully add");}
                    else System.out.println("existing name");
                    break;
                case "-r":
                    todoName = reader.readLine();
                    if (todoList.containsKey(todoName)){
                        System.out.println(todoList.get(todoName));}
                    else System.out.println("no such name. cannot read");
                    break;
                case "-u":
                    todoName = reader.readLine();
                    if (todoList.containsKey(todoName)) {
                        todoDescription = reader.readLine();
                        todoList.put(todoName, todoDescription);
                        System.out.println("one note successfully update");
                    }
                    else System.out.println("no such name. cannot update this todo");
                    break;
                case "-d":
                    todoName = reader.readLine();
                    if (todoList.containsKey(todoName)){
                        todoList.remove(todoName);
                        System.out.println("one note successfully remove");}
                    else System.out.println("no such name. cannot remove");
                    break;
                case "exit":
                    return;
                case "show all":
                    System.out.println(todoList.toString());
                    break;
                default:
                    System.out.println("unknown command");
                    break;
            }
            code = reader.readLine();
        }

    }
}

