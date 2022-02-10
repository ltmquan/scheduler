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
        deadline: this.calcTimeUntilDeadline(task.deadline),
        urgency: this.calcPriority(task.priorityLevel)
      }
    },
    calcTimeUntilDeadline(deadline) {
      let today = new Date();

      let diff = Math.abs(deadline.getTime() - today.getTime());

      let daysLeft = parseInt(diff/(1000 * 3600 * 24));

      return `${daysLeft} day(s) left`;
    },
    calcPriority(priorityLevel) {
      let priority = "";

      switch (priorityLevel) {
      case 1:
        priority = "Pretty frickin' important";
        break;

      case 2:
        priority = "Somewhat important";
        break;

      case 3:
        priority = "Mildly important";
        break;

      case 4:
        priority = "On the chill side";
        break;

      case 5:
        priority = "Writings' level of importance";
        break;
      }

      return priority;
    },
    calcUrgency(priorityLevel, deadline) {
      let today = new Date();
      let diff = Math.abs(deadline.getTime() - today.getTime());
      let daysLeft = parseInt(diff/(1000 * 3600 * 24));

      let urgency = priorityLevel * daysLeft;

      return urgency;
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
