package com.example.todo;

import com.example.todo.model.State;
import com.example.todo.model.Todo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@SpringBootApplication
public class TodoApplication {
    static final String POST_PATH ="http://localhost:8080/todolist/new-todo";
    static final String GET_PATH ="http://localhost:8080/todolist";
    static final String DEL_PATH ="http://localhost:8080/todolist/del?id=2";

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);

        /// --------------- Rest Client -------------------------------------------------------
//        RestTemplate template = new RestTemplate();
//
//        //######################## GET  -- lesen #################################
//        ResponseEntity<Todo[]> re =template.getForEntity(GET_PATH, Todo[].class);
//        List<Todo> list = Arrays.asList(re.getBody());
//        System.out.println(list);
//
//
//
//        Todo saveTodo =new Todo("lesen");
//        ResponseEntity<String>  result=  template.postForEntity(POST_PATH,saveTodo ,String.class);// String
//
//
//        System.out.println(result.getStatusCode());
//        System.out.println(result.getBody());


        // delete, update...

    }




}
