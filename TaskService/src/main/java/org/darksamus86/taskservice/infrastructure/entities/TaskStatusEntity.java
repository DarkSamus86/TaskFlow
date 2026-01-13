package org.darksamus86.taskservice.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "task_status")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "description", length = 1000)
    private String description;
}
