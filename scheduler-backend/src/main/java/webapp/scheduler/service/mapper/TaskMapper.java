package webapp.scheduler.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import webapp.scheduler.model.Task;
import webapp.scheduler.model.dto.TaskDTO;

@Mapper(componentModel="spring")
public interface TaskMapper {

	@Mappings({
		@Mapping(source="relatedLinks", target="relatedLinks", qualifiedByName="mergeLinks")
	})
	Task toEntity(TaskDTO taskDTO);
	
	@Mappings({
		@Mapping(source="type.id", target="typeId"),
		@Mapping(source="type.name", target="typeName"),
		@Mapping(source="relatedLinks", target="relatedLinks", qualifiedByName="extractLinks")
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
	
	@Named("extractLinks")
	default List<String> extractLinks(String relatedLinks) {
		
		String[] links = relatedLinks.split(",");
		
		List<String> extractedLinks = new ArrayList<>();
		for (String link : links) {
			extractedLinks.add(link);
		}
		
		return relatedLinks.length() == 0 ? new ArrayList<>() : extractedLinks;
	}
	
	@Named("mergeLinks")
	default String mergeLinks(List<String> relatedLinks) {
		
		StringBuilder mergedLinks = new StringBuilder();
		
		for (String link : relatedLinks) {
			mergedLinks.append(link);
			mergedLinks.append(",");
		}
		
		return mergedLinks.length() == 0 ? "" : mergedLinks.substring(0, mergedLinks.length()-1);
	}
	
}
