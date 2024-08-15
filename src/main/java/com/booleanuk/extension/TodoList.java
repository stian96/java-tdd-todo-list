package com.booleanuk.extension;
import java.util.ArrayList;

public class TodoList {
    private ArrayList<Item> list;

    public void addTask(String message) {
        list.add(new Item(message));
    }

    public Item getTaskById(String id) {
        return new Item("test");
    }
}
