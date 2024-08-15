package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoListTest {
    TodoList todoList = new TodoList();

    @BeforeEach
    public void fillDummyData() {
        todoList.addTask("Walk the dog");
        todoList.addTask("Make dinner");
        todoList.addTask("Read");
    }

    @Test
    public void testAddTaskAddsATaskToTodoList() {
        Assertions.assertEquals(3, todoList.list.size());
    }

    @Test
    public void testSeeAllTasksReturnTasksNicelyFormatted() {
        String testString = "\nRead\nMake dinner\nWalk the dog\n";
        Assertions.assertEquals(testString, todoList.seeAllTasks());
    }

    @Test
    public void testChangeStatusChangesStatusOfSpecificTask() {
        Assertions.assertTrue(todoList.changeTaskStatus("Read", true));
        Assertions.assertTrue(todoList.changeTaskStatus("Read", false));
    }

    @Test
    public void testGetTasksReturnsOnlyCompletedTasks() {
        todoList.changeTaskStatus("Walk the dog", true);
        String completedTestString = "\nWalk the dog\n";
        Assertions.assertEquals(todoList.getTasks(), completedTestString);
    }

    @Test
    public void testGetTasksReturnsOnlyUncompletedTasks() {
        todoList.changeTaskStatus("Walk the dog", true);
        todoList.changeTaskStatus("Make dinner", true);

        String uncompletedTestString = "\nRead\n";
        Assertions.assertEquals(todoList.getTasks(), uncompletedTestString);

    }
}
