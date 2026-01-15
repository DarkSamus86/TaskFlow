package org.darksamus86.taskservice.presentation.controller;

import org.darksamus86.taskservice.application.mapper.CreateTaskMapper;
import org.darksamus86.taskservice.domain.model.Task;
import org.darksamus86.taskservice.domain.model.TaskId;
import org.darksamus86.taskservice.domain.service.TaskService;
import org.darksamus86.taskservice.presentation.dto.request.CreateTaskRequest;
import org.darksamus86.taskservice.presentation.dto.response.CreateTaskResponse;
import org.darksamus86.taskservice.presentation.dto.response.GetRespTaskDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    public final TaskService service;
    public final CreateTaskMapper createTaskMapper;

    public TaskController(
            TaskService service,
            CreateTaskMapper createTaskMapper
    ) {
        this.service = service;
        this.createTaskMapper = createTaskMapper;
    }
// TODO: Implement
    @GetMapping("/{taskId}")
    public GetRespTaskDto findById(@PathVariable Long taskId) {
        TaskId init = new TaskId(taskId);

        Task task = service.findById(init)
                .orElseThrow(() -> new RuntimeException("Task not found: " + taskId));

        return new GetRespTaskDto(
                task.getTaskId().getId(),
                task.getTaskTitle().getTitle(),
                task.getMessage().getMessage(),
                task.getTaskStatus().getTaskStatusId(),
                task.getTaskPriority().getPriorityId()
                );
    }


    @PostMapping("/createTask")
    public CreateTaskResponse createTask(@RequestBody CreateTaskRequest req) {
        Task task = createTaskMapper.toTask(req);
        TaskId id = service.createTask(task);

        return new CreateTaskResponse(id.getId());
    }

}
