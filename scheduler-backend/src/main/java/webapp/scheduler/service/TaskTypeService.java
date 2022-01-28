package webapp.scheduler.service;

import java.util.List;

import webapp.scheduler.model.dto.TaskTypeDTO;

public interface TaskTypeService {

	List<TaskTypeDTO> findAll();
	
}
