package org.darksamus86.taskservice.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TaskStatusEnum {
    IN_WORK(1),
    DONE(2),
    CANCELED(3),
    CREATED(4);

    private final int id;

    public static TaskStatusEnum fromId(int id) {
        for (TaskStatusEnum status: values()) {
            if (status.id == id) {
                return status;
            }
        }

        throw new IllegalArgumentException("Unknown TaskStatusEnum id:"  + id);
    }
}
