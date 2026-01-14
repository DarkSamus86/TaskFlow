package org.darksamus86.taskservice.domain.repo;

import org.darksamus86.taskservice.domain.model.Task;
import org.darksamus86.taskservice.domain.model.TaskId;

import java.util.Optional;

public interface TaskRepo {
    TaskId save(Task task);

    Optional<Task> findById(TaskId taskId);
}
