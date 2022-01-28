package webapp.scheduler.model.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TaskDTO {
	
	private Long id;
	
	private String title;
	
	private Date deadline;
	
	private String description;
	
	private Long typeId;
	
	private String typeName;
	
	private Integer priorityLevel;
	
	private String course;
	
	private String people;
	
	private List<String> relatedLinks;
	
}
