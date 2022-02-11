package webapp.scheduler.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.scheduler.api.exception.InvalidAPICallException;
import webapp.scheduler.constants.API;
import webapp.scheduler.constants.Database;
import webapp.scheduler.constants.Messages;
import webapp.scheduler.model.Task;
import webapp.scheduler.model.TaskType;
import webapp.scheduler.model.dto.TaskDTO;
import webapp.scheduler.repository.TaskRepository;
import webapp.scheduler.repository.TaskTypeRepository;
import webapp.scheduler.service.TaskService;
import webapp.scheduler.service.mapper.TaskMapper;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskRepository taskRepository;
	
	@Autowired
	TaskTypeRepository taskTypeRepository;
	
	@Autowired
	TaskMapper taskMapper;

	@Override
	public List<TaskDTO> findAll() {
		
		List<Task> taskList = taskRepository.findAll();
		
		List<TaskDTO> taskDTOList = taskMapper.toDTO(taskList);
		
		return taskDTOList;
		
	}

	@Override
	public TaskDTO findById(Long id) {
		
		Optional<Task> taskOptional = taskRepository.findById(id);
		
		if (!taskOptional.isPresent()) {
			throw new InvalidAPICallException(
					Messages.ERROR_REQUESTED_DATA_DOES_NOT_EXIST, 
					API.GET_REQUEST, Database.ENTITY_TASK);
		}
		
		Task task = taskOptional.get();
		
		TaskDTO taskDTO = taskMapper.toDTO(task);
		
		return taskDTO;
		
	}

	@Override
	public List<TaskDTO> findByTypeId(Long id) {
		
		List<Task> taskList = taskRepository.findByTypeId(id);
		
		List<TaskDTO> taskDTOList = taskMapper.toDTO(taskList);
		
		return taskDTOList;
		
	}

	@Override
	public TaskDTO create(TaskDTO taskDTO) {
		
		if (taskDTO.getId() != null) {
			throw new InvalidAPICallException(
					Messages.ERROR_INVALID_DATA, 
					API.POST_REQUEST, Database.ENTITY_TASK);
		}
		
		Optional<TaskType> typeOptional = taskTypeRepository.findById(taskDTO.getTypeId());
		if (!typeOptional.isPresent()) {
			throw new InvalidAPICallException(
					Messages.ERROR_REQUESTED_DATA_DOES_NOT_EXIST, 
					API.GET_REQUEST, Database.ENTITY_TASK_TYPE);
		}
		TaskType type = typeOptional.get();
		
		Task task = taskMapper.toEntity(taskDTO);
		task.setType(type);
		
		Task createdTask = taskRepository.save(task);
		
		TaskDTO createdTaskDTO = taskMapper.toDTO(createdTask);
		
		return createdTaskDTO;
		
	}

	@Override
	public TaskDTO update(TaskDTO taskDTO) {
		
		Long id = taskDTO.getId();
		
		if (taskDTO.getId() == null || !taskRepository.existsById(id)) {
			throw new InvalidAPICallException(
					Messages.ERROR_INVALID_DATA, 
					API.PUT_REQUEST, Database.ENTITY_TASK);
		}
		
		Task task = taskMapper.toEntity(taskDTO);
		Task updatedTask = taskRepository.save(task);
		
		TaskDTO updatedTaskDTO = taskMapper.toDTO(updatedTask);
		
		return updatedTaskDTO;
		
	}

	@Override
	public TaskDTO deleteById(Long id) {
		
		TaskDTO taskDTO = this.findById(id);
		
		taskRepository.deleteById(id);
		
		return taskDTO;
		
	}
}
