package com.example.todo.service;

import com.example.todo.model.Todo;

import java.util.List;

public interface TodoService {
    Todo save(Todo newTodo);

    List<Todo> findAll();

    //FIXME boolean
    void remove(int id);

    Todo update(Todo todo);
}
