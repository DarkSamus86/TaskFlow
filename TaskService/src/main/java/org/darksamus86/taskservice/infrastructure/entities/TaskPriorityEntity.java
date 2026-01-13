package org.darksamus86.taskservice.infrastructure.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "task_priority")
public class TaskPriorityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 20)
    private String name;
}
