# Todo List - Domain Model

### Core Requirements
* I want to add tasks to my todo list.
* I want to see all the tasks in my todo list.
* I want to change the status of a task between incomplete and complete.
* I want to be able to get only the complete tasks.
* I want to be able to get only the incomplete tasks.
* I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
* I want to remove tasks from my list.
* I want to see all the tasks in my list ordered alphabetically in ascending order.
* I want to see all the tasks in my list ordered alphabetically in descending order.

| Class    | Member  | Type                 |
|----------|---------|----------------------|
| TodoList | list    | Map<String, Boolean> |



| Requirement | Method                                             | Return     | Note                                                                                                                       |
|-------------|----------------------------------------------------|------------|----------------------------------------------------------------------------------------------------------------------------|
| **1**       | `addTask(String message)`                          | `void`     | Adds a task to the list and sets the boolean value to 'false' as default, <br/> indicating that the task is not completed. |
| **2**       | `seeAllTasks()`                                    | `String`   | Returns all the tasks nicely formatted as a string.                                                                        |
| **3**       | `changeTaskStatus(String message, Boolean status)` | `Boolean`  | Provide the task message and a boolean value to change the status of the task.                                             |
| **4**       | `getCompletedTasks()`                              | `String`   | Provide the completed tasks as a nicely formatted string.                                                                  |
