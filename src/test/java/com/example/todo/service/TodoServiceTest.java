package com.example.todo.service;

import com.example.todo.dao.TodoDAO;
import com.example.todo.model.State;
import com.example.todo.model.Todo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest  // Achtung wichtig!!!
class TodoServiceTest {



    @Autowired
    TodoService todoService;

    @Autowired
    TodoDAO todoDAO;

    @BeforeEach
    void setUp() {

//        todoDAO.deleteAll();
//        todoService.save(new Todo(0, "einkaufen", "Nudeln", LocalDate.now(), State.NEW));
//        todoService.save(new Todo(1, "lesen", "Buch", LocalDate.now(), State.DONE));
//        todoService.save(new Todo(2, "programmieren", "Python", LocalDate.now(), State.IN_PROGRESS));
//        todoService.save(new Todo(3, "Schwimmen", "buchen 20.00 Uhr", LocalDate.now(), State.NEW));
//        todoService.save(new Todo(4, "einkaufen", "Nudeln", LocalDate.now(), State.NEW));

    }

    @AfterEach
    void tearDown() {

    }
   // BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
   // boolean isPasswordMatches = bcrypt.matches(userenteredpasswordWithotEncryoted, encryptedPasswordFromDb);
    @Test
    void passwordTest() {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String en = encoder.encode("hallo");
        System.out.println(en);
        assertTrue(encoder.matches("hallo",en));

    }

    //@Test //
    void findAll() {

       List<Todo> todos = todoService.findAll();
       assertEquals(4,todos.size());

    }
}