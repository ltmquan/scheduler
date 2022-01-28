import axios from "axios";

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
}

export default new APIHelper();