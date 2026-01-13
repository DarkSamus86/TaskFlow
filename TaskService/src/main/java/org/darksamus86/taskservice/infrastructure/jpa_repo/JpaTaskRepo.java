package org.darksamus86.taskservice.infrastructure.jpa_repo;

import org.darksamus86.taskservice.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaTaskRepo extends JpaRepository<TaskEntity, Long> {
    @Override
    Optional<TaskEntity> findById(Long id);
}
