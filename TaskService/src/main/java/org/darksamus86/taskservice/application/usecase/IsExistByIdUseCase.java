package org.darksamus86.taskservice.application.usecase;

import org.darksamus86.taskservice.application.exception.TaskNotFoundException;
import org.darksamus86.taskservice.domain.model.TaskId;
import org.darksamus86.taskservice.domain.repo.TaskRepo;
import org.springframework.stereotype.Component;

@Component
public class IsExistByIdUseCase {
    private final TaskRepo taskRepo;

    public IsExistByIdUseCase(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public boolean isExist(TaskId taskId) {
        boolean exist = taskRepo.existsById(taskId);

        if (!exist) {
            throw new TaskNotFoundException(taskId);
        }

        return true;
    }
}
