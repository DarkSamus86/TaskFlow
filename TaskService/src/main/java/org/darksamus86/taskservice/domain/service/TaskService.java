package org.darksamus86.taskservice.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.darksamus86.taskservice.domain.model.Task;
import org.darksamus86.taskservice.domain.model.TaskId;
import org.darksamus86.taskservice.domain.repo.TaskRepo;
import org.darksamus86.taskservice.presentation.dto.request.CreateTaskRequest;
import org.darksamus86.taskservice.presentation.dto.response.CreateTaskResponse;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class TaskService {
    private final TaskRepo taskRepo;

    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public TaskId createTask(Task task) {
        return taskRepo.createTask(task);
    }

    public Optional<Task> findById(TaskId id) {
        return taskRepo.findById(id);
    }
}
