package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class TodoList {
    public Map<String, Boolean> list;

    public TodoList() {
        this.list = new HashMap<>();
    }

    public void addTask(String message) {
        list.put(message, false);
    }

    public String seeAllTasks() {
        return "";
    }

}
