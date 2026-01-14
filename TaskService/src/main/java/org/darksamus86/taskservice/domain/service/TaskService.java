package org.darksamus86.taskservice.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.darksamus86.taskservice.application.mapper.TaskMapper;
import org.darksamus86.taskservice.domain.model.Task;
import org.darksamus86.taskservice.domain.model.TaskId;
import org.darksamus86.taskservice.domain.repo.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class TaskService {
    private final TaskRepo taskRepo;
    private final TaskMapper mapper;

    public TaskService(TaskRepo taskRepo, TaskMapper mapper) {
        this.taskRepo = taskRepo;
        this.mapper = mapper;
    }

    public TaskId save(Task task) {
        return taskRepo.save(task);
    }

    public Optional<Task> findById(TaskId id) {
        return taskRepo.findById(id);
    }
}
