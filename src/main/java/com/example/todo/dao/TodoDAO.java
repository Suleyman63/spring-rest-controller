package com.example.todo.dao;

import java.util.List;

import com.example.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoDAO extends JpaRepository<Todo,Integer> {


}
