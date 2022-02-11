<template>
  <task-list-el-pres 
    :task="taskInfo" 
    @click="viewTask()"
    @delete-task="deleteTaskById"
    @update-task="updateTaskById"
  />
</template>

<script>
import taskService from "../../services/task-service";
import apiHelper from "../../utils/api-helper";
import commonHelper from "../../utils/common-helper";
import { PRIORITY_LEVEL_STRING } from "../../constants/task-constants";

import TaskListElPres from "./task-list-el-pres.vue";

const TaskListEl = {
  components: {
    TaskListElPres
  },
  props: {
    task: Object
  },
  data() {
    return {
      taskInfo: this.toTaskInfo(this.task)
    };
  },
  methods: {
    viewTask() {
      this.$router.push(`/task/view/${this.task.id}`);
    },
    toTaskInfo(task) {
      return {
        id: task.id,
        title: task.title,
        deadline: commonHelper.getTimeRemainingString(task.deadline),
        urgency: PRIORITY_LEVEL_STRING[task.priorityLevel]
      }
    },
    deleteTaskById(id) {
      // taskService.deleteById(id).then(
      //   response => {
      //     apiHelper.handleResponse(response, (res) => {
      //       console.log("deleted");
      //     });
      //   }
      // );
      console.log("deleted " + id);
    },
    updateTaskById(id) {
      this.$router.push(`/task/update/${this.task.id}`);
    }
  },
}

export default TaskListEl;
</script>
