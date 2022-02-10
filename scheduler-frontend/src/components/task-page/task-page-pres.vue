<template>
  <div class="task-page-class">
    <div class="page-title-class display-6">
      Task List
      <span class="add-btn-class btn btn-outline-dark" @click="$emit('createTask')">
        <font-awesome-icon icon="plus" />
      </span>
    </div>
    <task-list v-if="taskList" :task-list="taskList" />
  </div>
</template>

<script>
import TaskList from "../task-list/task-list.vue";

const TaskPagePres = {
  components: {
    TaskList
  },
  emits: ['createTask'],
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
  margin: 0.5rem;
}

.add-btn-class {
  margin: 0 0.2rem;
  border-radius: 50%;
}
</style>