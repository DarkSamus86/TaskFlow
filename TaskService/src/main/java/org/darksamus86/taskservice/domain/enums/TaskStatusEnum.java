package org.darksamus86.taskservice.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TaskStatusEnum {
    IN_WORK(1, "В работе"),
    DONE(2, "Готово"),
    CANCELED(3, "Отменено"),
    CREATED(4, "Создано");

    private final int id;
    private final String description;

    public static TaskStatusEnum fromId(int id) {
        for (TaskStatusEnum status: values()) {
            if (status.id == id) {
                return status;
            }
        }

        throw new IllegalArgumentException("Unknown TaskStatusEnum id:"  + id);
    }
}
