package webapp.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import webapp.scheduler.model.TaskType;
import webapp.scheduler.repository.custom.TaskTypeRepositoryCustom;

@Repository
public interface TaskTypeRepository extends JpaRepository<TaskType, Long>, TaskTypeRepositoryCustom {

}
