package org.darksamus86.taskservice.infrastructure.jpa_repo;

import org.darksamus86.taskservice.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTaskRepo extends JpaRepository<Long, TaskEntity> {
}
