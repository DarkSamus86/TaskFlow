package org.darksamus86.taskservice.presentation.dto.response;

public record GetRespTaskDto(
        Long id,
        String title,
        String message,
        Integer status,
        Integer priority
) {}
