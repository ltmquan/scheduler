package webapp.scheduler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="task_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskType {

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
}
