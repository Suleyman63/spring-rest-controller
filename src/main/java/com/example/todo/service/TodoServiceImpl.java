package com.example.todo.service;

import com.example.todo.dao.TodoDAO;
import com.example.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // aktuelle Implementierung ->@Autowired
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDAO todoDAO;

    @Override
    public Todo save(Todo newTodo) {
        return todoDAO.save(newTodo);
    }

    @Override
    public List<Todo> findAll(){
        return todoDAO.findAll();
    }

    //FIXME boolean
    @Override
    public void remove(int id){
        todoDAO.deleteById(id);
    }


    @Override
    public  Todo update(Todo todo){
       return  todoDAO.save(todo);
    }
}
