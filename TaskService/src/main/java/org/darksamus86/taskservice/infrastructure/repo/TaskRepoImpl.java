package org.darksamus86.taskservice.infrastructure.repo;

import org.darksamus86.taskservice.application.mapper.TaskMapper;
import org.darksamus86.taskservice.domain.model.Task;
import org.darksamus86.taskservice.domain.model.TaskId;
import org.darksamus86.taskservice.domain.repo.TaskRepo;
import org.darksamus86.taskservice.infrastructure.entities.TaskEntity;
import org.darksamus86.taskservice.infrastructure.jpa_repo.JpaTaskPriorityRepo;
import org.darksamus86.taskservice.infrastructure.jpa_repo.JpaTaskRepo;
import org.darksamus86.taskservice.infrastructure.jpa_repo.JpaTaskStatusRepo;
import org.darksamus86.taskservice.presentation.dto.request.CreateTaskRequest;
import org.darksamus86.taskservice.presentation.dto.response.CreateTaskResponse;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class TaskRepoImpl implements TaskRepo {
    private final JpaTaskRepo jpaTaskRepo;
    private final TaskMapper mapper;
    private final JpaTaskStatusRepo statusRepo;
    private final JpaTaskPriorityRepo priorityRepo;

    public TaskRepoImpl(JpaTaskRepo jpaTaskRepo,
                        TaskMapper mapper,
                        JpaTaskStatusRepo statusRepo,
                        JpaTaskPriorityRepo priorityRepo
    ) {
        this.jpaTaskRepo = jpaTaskRepo;
        this.mapper = mapper;
        this.statusRepo = statusRepo;
        this.priorityRepo = priorityRepo;
    }

    @Override
    public TaskId save(Task task) {
        TaskEntity entity = mapper.toEntity(task, statusRepo, priorityRepo);
        TaskEntity saved = jpaTaskRepo.saveAndFlush(entity);

        Long id = saved.getId();

        return new TaskId(id);
    }

    @Override
    public CreateTaskResponse createTask(CreateTaskRequest req) {
        return null;
    }

    @Override
    public Optional<Task> findById(TaskId taskId) {
        return jpaTaskRepo
                .findById(taskId.getId())
                .map(mapper::toDomain);
    }
}
