package com.example.todo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;



@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "todo")
public class Todo  implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private int id;
    @Column(length = 20)
    private String task;
    @Column(length = 100)
    private String description;

   // @Column(name = "date", nullable= false)
    private LocalDate deadline;


    @Column(columnDefinition = "ENUM('NEW', 'IN_PROGRESS', 'DONE')")
    @Enumerated(EnumType.STRING)
    private State state = State.NEW;  //NEW, IN_PROGRESS, DONE


    public Todo(String task) {
        this.task = task;
    }


    public Todo(int id, String task, String description, LocalDate deadline, State state) {
        super();
        this.id = id;
        this.task = task;
        this.description = description;
        this.deadline = deadline;
        this.state = state;

    }


    public Todo(String task, String description, LocalDate deadline,State state) {
        super();
        this.task = task;
        this.description = description;
        this.deadline = deadline;
        this.state = state;
        ;
    }

    public Todo() {

    }




}
