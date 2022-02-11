import axios from "axios";
import { STATUS_ERROR, STATUS_OK } from "../constants/API-constants";

class APIHelper {
  sendGetRequest(url) {
    return axios
      .get(url)
      .then(
        response => {
          return response.data;
        }
      );
  }

  sendPostRequest(url, body) {
    return axios
      .post(url, body)
      .then(
        response => {
          return response.data;
        }
      );
  }

  sendPutRequest(url, body) {
    return axios
      .put(url, body)
      .then(
        response => {
          return response.data;
        }
      );
  }

  sendDeleteRequest(url) {
    return axios
      .delete(url)
      .then(
        response => {
          return response.data;
        }
      );
  }

  handleResponse(response, successCallback = (param) => {}, errorCallback = (param) => {}) {
    if (response.status && response.status == STATUS_OK) {
      successCallback(response);
    } else if (response.status && response.status == STATUS_ERROR) {
      errorCallback(response);
    }
  }
}

export default new APIHelper();