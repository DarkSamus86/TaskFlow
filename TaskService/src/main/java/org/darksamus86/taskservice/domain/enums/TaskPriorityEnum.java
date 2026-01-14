package org.darksamus86.taskservice.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TaskPriorityEnum {
    LOW(1, "Низкий"),
    MEDIUM(2, "Средний"),
    HIGH(3, "Высокий");

    private final int id;
    private final String description;

    public static TaskPriorityEnum fromId(int id) {
        for (TaskPriorityEnum priorityEnum: values()) {
            if (priorityEnum.id == id) {
                return priorityEnum;
            }
        }

        throw new IllegalArgumentException("Unknown TaskPriorityEnum id:"  + id);
    }
}
