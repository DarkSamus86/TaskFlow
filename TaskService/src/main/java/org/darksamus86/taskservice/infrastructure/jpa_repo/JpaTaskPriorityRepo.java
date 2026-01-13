package org.darksamus86.taskservice.infrastructure.jpa_repo;

import org.darksamus86.taskservice.infrastructure.entities.TaskPriorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaTaskPriorityRepo extends JpaRepository<TaskPriorityEntity, Integer> {
    @Override
    Optional<TaskPriorityEntity> findById(Integer id);
}
