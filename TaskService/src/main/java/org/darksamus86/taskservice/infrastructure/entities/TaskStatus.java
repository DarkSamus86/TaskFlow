package org.darksamus86.taskservice.infrastructure.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "task_status")
public class TaskStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "description", length = 1000)
    private String description;
}
