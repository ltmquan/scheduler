package webapp.scheduler.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="task")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Temporal(TemporalType.DATE)
	@Column(name="deadline")
	private Date deadline;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="type_id", referencedColumnName="id")
	private TaskType type;
	
	@Column(name="priority_level")
	private Integer priorityLevel;
	
	@Column(name="course")
	private String course;
	
	@Column(name="people")
	private String people;
	
	@Column(name="related_links")
	private String relatedLinks;
	
}
