package webapp.scheduler.service;

import java.util.List;

import webapp.scheduler.model.dto.TaskDTO;

public interface TaskService {

	List<TaskDTO> findAll();
	
	TaskDTO findById(Long id);
	
	List<TaskDTO> findByTypeId(Long id);
	
	TaskDTO create(TaskDTO taskDTO);
	
	TaskDTO update(TaskDTO taskDTO);
	
	TaskDTO deleteById(Long id);
	
}
