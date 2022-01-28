package webapp.scheduler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import webapp.scheduler.model.Task;
import webapp.scheduler.repository.custom.TaskRepositoryCustom;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>, TaskRepositoryCustom {

	List<Task> findByTypeId(Long id);
	
}
