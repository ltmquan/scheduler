package webapp.scheduler.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import webapp.scheduler.api.response.APIResponse;
import webapp.scheduler.constants.API;
import webapp.scheduler.model.dto.TaskTypeDTO;
import webapp.scheduler.service.TaskTypeService;

@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/api/task/type")
public class TaskTypeController {
	
	@Autowired
	TaskTypeService taskTypeService;
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public APIResponse<?> findAll() {
		
		List<TaskTypeDTO> taskTypeDTOList = taskTypeService.findAll();
		
		APIResponse<List<TaskTypeDTO>> response = new APIResponse<>(taskTypeDTOList, API.STATUS_OK);
		
		return response;
		
	}
}
