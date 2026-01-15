package org.darksamus86.taskservice.presentation.dto.request;

public record CreateTaskRequest(
   String title,
   String message,
   Integer status_id,
   Integer priority_id
) {}
