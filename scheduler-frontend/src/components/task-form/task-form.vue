<template>
  <task-form-pres v-if="task && typeList" 
    :task="task" 
    :type-list="typeList"
    @create-task="createTask" 
  />
</template>

<script>
import taskService from "../../services/task-service";
import taskTypeService from "../../services/task-type-service";
import apiHelper from "../../utils/api-helper";

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
    createTask(task) {
      // taskService.create(task).then(
      //   response => {
      //     apiHelper.handleResponse(response, (res) => {
      //       console.log(res);
      //     });
      //   }
      // );
      console.log(task);
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
      // taskTypeService.findAll().then(
      //   response => {
      //     apiHelper.handleResponse(response, (res) => {
      //       this.typeList = res.body;
      //     });
      //   }
      // );
      this.typeList = [
        {
          id: 1,
          name: "Coursework"
        },
        {
          id: 2,
          name: "PhD Work"
        }
      ]
    }
  },
  created() {
    this.loadTask();
    this.loadTypeList();
  },
};

export default TaskForm;
</script>
