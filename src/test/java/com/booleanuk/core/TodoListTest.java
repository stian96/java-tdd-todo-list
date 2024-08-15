package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {


    @Test
    public void testAddTaskAddsATaskToTodoList() {
        TodoList todoList = new TodoList();
        todoList.addTask("Walk the dog.");

        Assertions.assertEquals(1, todoList.list.size());

    }
}
