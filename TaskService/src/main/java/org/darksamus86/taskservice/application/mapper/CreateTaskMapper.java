package org.darksamus86.taskservice.application.mapper;

import org.darksamus86.taskservice.domain.model.*;
import org.darksamus86.taskservice.presentation.dto.request.CreateTaskRequest;
import org.springframework.stereotype.Component;

@Component
public class CreateTaskMapper {
    public Task toTask(CreateTaskRequest req) {
        return new Task(
                null,
                new TaskTitle(req.title()),
                new TaskMessage(req.message()),
                new TaskPriority(req.priority_id()),
                new TaskStatus(req.status_id())
        );
    }
}
