package webapp.scheduler.model.dto;

import java.util.Date;

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
	
	private Integer workLength;
	
}
