package webapp.scheduler.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import webapp.scheduler.model.TaskType;
import webapp.scheduler.model.dto.TaskTypeDTO;

@Mapper(componentModel="spring")
public interface TaskTypeMapper {

	TaskType toEntity(TaskTypeDTO taskTypeDTO);
	
	TaskTypeDTO toDTO(TaskType taskType);
	
	List<TaskType> toEntity(List<TaskTypeDTO> taskTypeDTOList);
	
	List<TaskTypeDTO> toDTO(List<TaskType> taskTypeList);
	
	default TaskType fromId(Long id) {
		if (id == null) {
			return null;
		}
		
		TaskType taskType = new TaskType();
		taskType.setId(id);
		
		return taskType;
	}
	
}
