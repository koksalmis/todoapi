package com.koksalmis.todoapi.web;

import com.koksalmis.todoapi.model.TodoItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class TodoApiController {

    @GetMapping("/todoitems")
    public String getAllTodoItems() {
        log.info("getAllTodoItems is called");
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/todoitems")
    public String saveTodoItem(@RequestBody TodoItem todoItem) {
        log.info("saveTodoItem is called");
        return "Greetings from Spring Boot!";
    }

    @PutMapping("/todoitems/{id}")
    public String updateTodoItem(@RequestBody TodoItem todoItem) {
        log.info("updateTodoItem is called");
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/todoitems/{id}")
    public String deleteTodoItem(@RequestBody Long id) {
        log.info("deleteTodoItem is called");
        return "Greetings from Spring Boot!";
    }

}