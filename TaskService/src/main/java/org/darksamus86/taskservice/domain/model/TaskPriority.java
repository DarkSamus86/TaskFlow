package org.darksamus86.taskservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskPriority {
    private int priorityId;
    private final String namePriority;
}
