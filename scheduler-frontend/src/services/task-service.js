import { TASK_API_URL } from "../constants/API-constants";
import apiHelper from "../utils/api-helper";

const API_URL = TASK_API_URL;

class TaskService {

  findAll() {
    return apiHelper.sendGetRequest(`${API_URL}/all`);
  }

  findById(id) {
    return apiHelper.sendGetRequest(`${API_URL}?id=${id}`);
  }

  create(task) {
    return apiHelper.sendPostRequest(`${API_URL}`, task);
  }

  update(task) {
    return apiHelper.sendPutRequest(`${API_URL}`, task);
  }

  deleteById(id) {
    return apiHelper.sendDeleteRequest(`${API_URL}?id=${id}`);
  }
}

export default new TaskService();