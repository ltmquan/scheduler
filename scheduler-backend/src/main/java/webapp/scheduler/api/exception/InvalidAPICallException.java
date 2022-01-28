package webapp.scheduler.api.exception;

import lombok.Getter;

@Getter
public class InvalidAPICallException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7331897551145015147L;
	
	private String label;
	
	private String action;
	
	private String entityName;

	public InvalidAPICallException(String label, String action, String entityName) {
		super();
		this.label = label;
		this.action = action;
		this.entityName = entityName;
	}
	
}
