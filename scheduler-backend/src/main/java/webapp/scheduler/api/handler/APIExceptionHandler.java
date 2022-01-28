package webapp.scheduler.api.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import webapp.scheduler.api.exception.InvalidAPICallException;
import webapp.scheduler.api.response.APIResponse;
import webapp.scheduler.constants.API;

@RestControllerAdvice
public class APIExceptionHandler {

	@ExceptionHandler(InvalidAPICallException.class)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public APIResponse<Void> handleBadRequestException(InvalidAPICallException exception) {
		APIResponse<Void> response = new APIResponse<>(null, API.STATUS_ERROR);
		response.genMessage(exception.getLabel(), exception.getAction(), exception.getEntityName());
		
		return response;
	}
	
}
