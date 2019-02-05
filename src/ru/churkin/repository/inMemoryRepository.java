package ru.churkin.repository;

import ru.churkin.entity.Todo;

import java.util.Map;

public class inMemoryRepository implements todoRepository {

    @Override
    public void createTodo() {

    }

    @Override
    public String readTodo() {
        return null;
    }

    @Override
    public boolean updateTodo() {
        return false;
    }

    @Override
    public boolean deleteTodo() {
        return false;
    }

    @Override
    public Map<Integer, Todo> showAll() {
        return null;
    }
}
