<template>
  <div class="task-list-class">
    <div
      v-for="task in taskList"
      :key="task.id"
      class="list-el-class"
    >
      <task-list-el :task="task" />
    </div>
  </div>
</template>

<script>
import TaskListEl from "../task-list-el/task-list-el.vue";

const TaskListPres = {
  components: {
    TaskListEl
  },
  props: {
    taskList: Array
  }
};

export default TaskListPres;
</script>

<style scoped>
.task-list-class {
  width: 100%;
  height: 100%;
}

.task-list-class
  > .list-el-class {
  padding: 0.2rem;
}
</style>