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

    @Test
    public void testSeeAllTasksReturnTasksNicelyFormatted() {
        TodoList todoList = new TodoList();
        todoList.addTask("Walk the dog");
        todoList.addTask("Make dinner");
        todoList.addTask("Read");

        String testString = "Walk the dog\nMake dinner\nRead\n";
        Assertions.assertEquals(testString, todoList.seeAllTasks());
    }
}
