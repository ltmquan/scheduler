package webapp.scheduler.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class APIResponse<T> {
	
	private T body;
	
	private String status;
	
	private String message;
	
	public APIResponse(T body, String status) {
		this.body = body;
		this.status = status;
		this.message = "";
	}
	
	public void genMessage(String label, String action, String entityName) {
		switch (this.status) {
		case "success":
			this.genSuccessMessage(action, entityName);
			break;
			
		case "error":
			this.genErrorMessage(label, action, entityName);
			break;
		
		}
	}
	
	private void genSuccessMessage(String action, String entityName) {
		StringBuilder message = new StringBuilder();
		message.append("Successfully ");
		message.append(action);
		message.append("d ");
		message.append(entityName);
		
		this.message = message.toString();
	}
	
	private void genErrorMessage(String label, String action, String entityName) {
		StringBuilder message = new StringBuilder();
		message.append("Failed to ");
		message.append(action);
		message.append(" ");
		message.append(entityName);
		message.append(": ");
		message.append(label);
		
		this.message = message.toString();
	}
	
}
