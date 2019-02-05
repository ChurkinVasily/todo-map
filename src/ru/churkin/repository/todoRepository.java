package ru.churkin.repository;

import ru.churkin.entity.Todo;

import java.util.Map;

public interface todoRepository {

    void createTodo();

    String readTodo();

    boolean updateTodo();

    boolean deleteTodo();

    Map<Integer, Todo> showAll();
}
