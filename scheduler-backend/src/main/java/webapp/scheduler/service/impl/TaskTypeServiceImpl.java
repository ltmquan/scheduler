package webapp.scheduler.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.scheduler.model.TaskType;
import webapp.scheduler.model.dto.TaskTypeDTO;
import webapp.scheduler.repository.TaskTypeRepository;
import webapp.scheduler.service.TaskTypeService;
import webapp.scheduler.service.mapper.TaskTypeMapper;

@Service
public class TaskTypeServiceImpl implements TaskTypeService {

	@Autowired
	TaskTypeRepository taskTypeRepository;
	
	@Autowired
	TaskTypeMapper taskTypeMapper;

	@Override
	public List<TaskTypeDTO> findAll() {

		List<TaskType> taskTypeList = taskTypeRepository.findAll();
		
		List<TaskTypeDTO> taskTypeDTOList = taskTypeMapper.toDTO(taskTypeList); 
		
		return taskTypeDTOList;
		
	}
}
