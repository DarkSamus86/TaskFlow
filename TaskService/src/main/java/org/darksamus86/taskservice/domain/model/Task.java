package org.darksamus86.taskservice.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Task {
    private TaskId taskId;
    private TaskTitle taskTitle;
    private TaskMessage message;
    private TaskPriority taskPriority;
    private TaskStatus taskStatus;
    
}
