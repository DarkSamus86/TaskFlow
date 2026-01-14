package org.darksamus86.taskservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.darksamus86.taskservice.domain.enums.TaskStatusEnum;

@Data
@AllArgsConstructor
public class TaskStatus {
    private int taskStatusId;
}
