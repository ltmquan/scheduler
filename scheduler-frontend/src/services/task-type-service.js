import { TASK_TYPE_API_URL } from "../constants/API";
import apiHelper from "../utils/api-helper";

const API_URL = TASK_TYPE_API_URL;

class TaskTypeService {

  findAll() {
    return apiHelper.sendGetRequest(`${API_URL}/all`);
  }

}

export default new TaskTypeService();
