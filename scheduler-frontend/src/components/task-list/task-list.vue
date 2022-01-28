<template>
  <task-list-pres :task-list="taskList" />
</template>

<script>
import TaskListPres from "./task-list-pres.vue";

const TaskList = {
  components: {
    TaskListPres,
  },
  props: {
    taskList: Array
  },
  data() {
    return { };
  },
};

export default TaskList;
</script>
