package com.example.todo.restcontroller;

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todolist")
public class TodoRestController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public List<Todo> getAll(){
        return todoService.findAll();
    }

    @PostMapping("/bew-todo")
    public Todo newTodo(Todo todo){
        return todoService.save(todo);
    }


    @DeleteMapping("/del")
    public void delete(@RequestParam("id") int id){
        todoService.remove(id);
    }

    @PutMapping("/update")
    public Todo update(@RequestParam Todo todo){
        return todoService.update(todo);
    }
}


