<template>
  <div class="task-page-class">
    <div class="page-title-class display-6">Task List</div>
    <task-list :task-list="taskList" />
  </div>
</template>

<script>
import TaskList from "../task-list/task-list.vue";

const TaskPagePres = {
  components: {
    TaskList
  },
  props: {
    taskList: Array
  }
}

export default TaskPagePres;
</script>

<style scoped>
.task-page-class {
  width: 100%;
  height: 100%;
  padding: 5% 0;
}

.task-page-class
  > .page-title-class {
  margin: 0.2rem;
}
</style>