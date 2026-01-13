package org.darksamus86.taskservice.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "task_priority")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskPriorityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", length = 20)
    private String name;
}
