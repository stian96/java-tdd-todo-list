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
        StringBuilder result = new StringBuilder("\n");
        for (Object item : list.keySet()) {
            result.append(item).append("\n");
        }
        return result.toString();
    }

    public Boolean changeTaskStatus(String message, Boolean status) {
        return false;
    }


}
