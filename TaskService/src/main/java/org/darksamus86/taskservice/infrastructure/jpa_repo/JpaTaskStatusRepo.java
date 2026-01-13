package org.darksamus86.taskservice.infrastructure.jpa_repo;

import org.darksamus86.taskservice.infrastructure.entities.TaskStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaTaskStatusRepo extends JpaRepository<TaskStatusEntity, Integer> {
    @Override
    Optional<TaskStatusEntity> findById(Integer id);
}
