<template>
  <task-page-pres v-if="taskList" :task-list="taskList" @create-task="createTask()" />
</template>

<script>
import taskService from "../../services/task-service";
import apiHelper from "../../utils/api-helper";

import TaskPagePres from "./task-page-pres.vue";

const TaskPage = {
  components: {
    TaskPagePres
  },
  data() {
    return {
      taskList: null,
    };
  },
  methods: {
    loadTaskList() {
      taskService.findAll().then(
        response => {
          apiHelper.handleResponse(response, (res) => {
            this.taskList = res.body;
          });
        }
      );
    },
    createTask() {
      this.$router.push(`/task/create`);
    }
  },
  created() {
    this.loadTaskList();
  }
}

export default TaskPage;
</script>
