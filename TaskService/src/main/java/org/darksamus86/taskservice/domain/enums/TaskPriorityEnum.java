package org.darksamus86.taskservice.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TaskPriorityEnum {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int id;

    public static TaskPriorityEnum fromId(int id) {
        for (TaskPriorityEnum priorityEnum: values()) {
            if (priorityEnum.id == id) {
                return priorityEnum;
            }
        }

        throw new IllegalArgumentException("Unknown TaskPriorityEnum id:"  + id);
    }
}
