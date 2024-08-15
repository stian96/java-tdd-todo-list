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
        if (doesListContainKey(message)) {
            this.list.put(message, status);
            return true;
        }
        return false;
    }

    // Helper method.
    private Boolean doesListContainKey(String key) {
        return this.list.containsKey(key);
    }

}
