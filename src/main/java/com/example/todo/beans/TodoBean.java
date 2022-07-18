package com.example.todo.beans;

import com.example.todo.model.State;
import com.example.todo.model.Todo;

import com.example.todo.service.TodoService;
import org.apache.commons.lang3.SerializationUtils;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.List;

@Named
@ViewScoped
public class TodoBean {

    @Autowired
    private TodoService todoService;
    private List<Todo> todoList;
    private Todo saveTodo = new Todo();
    private Todo selectTodo = new Todo();

    public Todo getSelectTodo() {
        return selectTodo;
    }

    public void setSelectTodo(Todo selectTodo) {
        this.selectTodo = selectTodo;
    }


    public Todo getSaveTodo() {
        return saveTodo;
    }

    public void setSaveTodo(Todo saveTodo) {
        this.saveTodo = saveTodo;
    }


    public List<Todo> getTodoList() {
        return todoList;
    }

    @PostConstruct
    public void init() {
        System.out.println("init Bean...");
        // dao = new TodoDummyDAO();
        todoList = todoService.findAll();
    }

    public State[] getStates(){
        return State.values();
    }
    /*

     */
    public void save() {

        System.out.println("Bean save");
        Todo newTodo = SerializationUtils.clone(saveTodo);// neues Objekt
        Todo savedTodo = todoService.save(newTodo);
        if (savedTodo != null) {
            todoList = todoService.findAll();
            msg(newTodo,"Save erfolgreich");
        }
    }

    private void msg(Todo newTodo,String text) {
        FacesMessage msg = new FacesMessage(text, newTodo.getTask());
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void delete() {
        System.out.println("select " + selectTodo);
        todoService.remove(selectTodo.getId());
        todoList = todoService.findAll();
    }

    public void onRowEdit(RowEditEvent<Todo> event) {
        Todo t = event.getObject();
        //System.out.println("update event"+t;
        Todo updatedTodo = todoService.update(t);
        if(updatedTodo!=null) {
            msg(updatedTodo, "Update erfolgreich!");
            todoList = todoService.findAll();//refresh
        }

    }
    public void select(SelectEvent e) {

        System.out.println(  e.getObject());
    }

}
