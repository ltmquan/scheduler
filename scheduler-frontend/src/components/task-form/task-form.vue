<template>
  <task-form-pres v-if="task && typeList" 
    :task="task" 
    :type-list="typeList"
    @submit-task="submitTask" 
  />
</template>

<script>
import taskService from "../../services/task-service";
import taskTypeService from "../../services/task-type-service";
import apiHelper from "../../utils/api-helper";
import commonHelper from "../../utils/common-helper";

import TaskFormPres from "./task-form-pres.vue";

const TaskForm = {
  components: {
    TaskFormPres,
  },
  data() {
    return {
      task: null,
      typeList: null
    };
  },
  methods: {
    submitTask(task) {
      if (!Array.isArray(task.relatedLinks)) {
        task.relatedLinks = commonHelper.extractLinks(task.relatedLinks);
      }
      if (task.id) {
        taskService.update(task).then(
          response => {
            apiHelper.handleResponse(response, (res) => {
              console.log(res);
              this.$router.push('/');
            });
          }
        );
      } else {
        taskService.create(task).then(
          response => {
            apiHelper.handleResponse(response, (res) => {
              console.log(res);
              this.$router.push('/');
            });
          }
        );
      }
    },
    loadTask() {
      let taskId = this.$route.params.id;
      if (taskId) {
        taskService.findById(taskId).then(
          response => {
            apiHelper.handleResponse(response, (res) => {
              this.task = res.body;
            });
          }
        );
      } else {
        this.task = {
          id: null
        }
      }
    },
    loadTypeList() {
      taskTypeService.findAll().then(
        response => {
          apiHelper.handleResponse(response, (res) => {
            this.typeList = res.body;
          });
        }
      );
    },
  },
  created() {
    this.loadTask();
    this.loadTypeList();
  },
};

export default TaskForm;
</script>
