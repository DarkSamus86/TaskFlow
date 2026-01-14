package org.darksamus86.taskservice.application.mapper;

import org.darksamus86.taskservice.domain.enums.TaskPriorityEnum;
import org.darksamus86.taskservice.domain.enums.TaskStatusEnum;
import org.darksamus86.taskservice.domain.model.*;
import org.darksamus86.taskservice.infrastructure.entities.TaskEntity;
import org.darksamus86.taskservice.infrastructure.entities.TaskPriorityEntity;
import org.darksamus86.taskservice.infrastructure.entities.TaskStatusEntity;
import org.darksamus86.taskservice.infrastructure.jpa_repo.JpaTaskPriorityRepo;
import org.darksamus86.taskservice.infrastructure.jpa_repo.JpaTaskStatusRepo;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public Task toDomain(TaskEntity entity) {
        if (entity == null) {
            return null;
        }

        return new Task(
          new TaskId(entity.getId()),
          new TaskTitle(entity.getTitle()),
          new TaskMessage(entity.getMessage()),
          new TaskPriority(entity.getPriorityId().getId()),
          new TaskStatus(entity.getStatusId().getId())
        );
    }


    public TaskEntity toEntity(Task domain, JpaTaskStatusRepo statusRepo, JpaTaskPriorityRepo priorityRepo) {
        if (domain == null) {
            return null;
        }
        TaskStatusEntity statusEntity = statusRepo.findById(domain.getTaskStatus().getTaskStatusId())
                .orElseThrow(() -> new IllegalStateException(
                        "TaskStatus id" + domain.getTaskStatus().getTaskStatusId() + "not found in db"
                ));

        TaskPriorityEntity priorityEntity = priorityRepo.findById(domain.getTaskPriority().getPriorityId())
                .orElseThrow(() -> new IllegalStateException(
                        "Priority id" + domain.getTaskPriority().getPriorityId() + "not found in db"
                ));

        TaskEntity entity = new TaskEntity();
        entity.setId(domain.getTaskId().getId());
        entity.setTitle(domain.getTaskTitle().getTitle());
        entity.setMessage(domain.getMessage().getMessage());
        entity.setPriorityId(priorityEntity);
        entity.setStatusId(statusEntity);


        return entity;
    }
}
