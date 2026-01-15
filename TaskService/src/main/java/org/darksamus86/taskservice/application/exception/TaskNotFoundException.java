package org.darksamus86.taskservice.application.exception;

import org.darksamus86.taskservice.domain.model.TaskId;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(TaskId taskId) {
        super("Task not found with id: " + taskId.getId());
    }
}
