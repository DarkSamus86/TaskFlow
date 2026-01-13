package org.darksamus86.taskservice.infrastructure.jpa_repo;

import org.darksamus86.taskservice.infrastructure.entities.TaskHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTaskHistoryRepo extends JpaRepository<TaskHistoryEntity, Long> {
}
