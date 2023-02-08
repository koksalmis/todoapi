package com.koksalmis.todoapi.model;

import lombok.Data;

@Data
public class TodoItem {

    private Long Id;
    private String name;
    private String desc;
    private Boolean isDone;
}