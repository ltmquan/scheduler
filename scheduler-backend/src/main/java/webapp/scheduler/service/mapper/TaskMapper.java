package webapp.scheduler.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import webapp.scheduler.model.Task;
import webapp.scheduler.model.dto.TaskDTO;

@Mapper(componentModel="spring")
public interface TaskMapper {

	Task toEntity(TaskDTO taskDTO);
	
	@Mappings({
		@Mapping(source="type.id", target="typeId"),
		@Mapping(source="type.name", target="typeName")
	})
	TaskDTO toDTO(Task task);
	
	List<Task> toEntity(List<TaskDTO> taskDTOList);
	
	List<TaskDTO> toDTO(List<Task> taskList);
	
	default Task fromId(Long id) {
		if (id == null) {
			return null;
		}
		
		Task task = new Task();
		task.setId(id);
		
		return task;
	}
	
}
