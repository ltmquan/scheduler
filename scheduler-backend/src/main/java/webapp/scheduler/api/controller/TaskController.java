package webapp.scheduler.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import webapp.scheduler.api.response.APIResponse;
import webapp.scheduler.constants.API;
import webapp.scheduler.constants.Database;
import webapp.scheduler.constants.Messages;
import webapp.scheduler.model.dto.TaskDTO;
import webapp.scheduler.service.TaskService;

@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/api/task")
public class TaskController {
	
	@Autowired
	TaskService taskService;

	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public APIResponse<?> findAll() {
		
		List<TaskDTO> taskDTOList = taskService.findAll();
		
		APIResponse<List<TaskDTO>> response = new APIResponse<>(taskDTOList, API.STATUS_OK);
		
		return response;
		
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public APIResponse<?> findById(@RequestParam(name="id") Long id) {
		
		TaskDTO taskDTO = taskService.findById(id);
		
		APIResponse<TaskDTO> response = new APIResponse<>(taskDTO, API.STATUS_OK);
		
		return response;
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public APIResponse<?> create(@RequestBody TaskDTO taskDTO) {
		
		TaskDTO createdTaskDTO = taskService.create(taskDTO);
		
		APIResponse<TaskDTO> response = new APIResponse<>(createdTaskDTO, API.STATUS_OK);
		response.genMessage(Messages.SUCCESS, API.POST_REQUEST, Database.ENTITY_TASK);
		
		return response;
		
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public APIResponse<?> update(@RequestBody TaskDTO taskDTO) {

		TaskDTO updatedTaskDTO = taskService.update(taskDTO);
		
		APIResponse<TaskDTO> response = new APIResponse<>(updatedTaskDTO, API.STATUS_OK);
		response.genMessage(Messages.SUCCESS, API.PUT_REQUEST, Database.ENTITY_TASK);
		
		return response;
		
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public APIResponse<?> deleteById(@RequestParam(name="id") Long id) {
		
		TaskDTO deletedTaskDTO = taskService.deleteById(id);
		
		APIResponse<TaskDTO> response = new APIResponse<>(deletedTaskDTO, API.STATUS_OK);
		response.genMessage(Messages.SUCCESS, API.DELETE_REQUEST, Database.ENTITY_TASK);
		
		return response;
		
	}
}
