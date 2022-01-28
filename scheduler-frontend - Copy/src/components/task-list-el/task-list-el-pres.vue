<template>
  <div class="task-list-el-class btn btn-outline-secondary">
    <div class="title-class">
      <div class="text-class">{{ task.title }}</div>
    </div>
    <div class="priority-level-class">
      <div class="text-class">{{ task.urgency }}</div>
    </div>
    <div class="deadline-class">
      <div class="text-class">{{ task.deadline }}</div>
    </div>
  </div>
</template>

<script>
const TaskListElPres = {
  props: {
    task: Object
  }  
}

export default TaskListElPres;
</script>

<style scoped>
.task-list-el-class {
  width: 100%;
  height: 5rem;
  padding: 2% 5%;
  display: flex;
  text-align: unset;
}

.task-list-el-class 
  > .title-class {
  width: 50%;
  display: flex;
  align-content: center;
  justify-content: center;
  flex-direction: column;
}

.task-list-el-class 
  > .priority-level-class {
  width: 25%;
  display: flex;
  align-content: center;
  justify-content: center;
  flex-direction: column;
}

.task-list-el-class 
  > .deadline-class {
  width: 25%;
  display: flex;
  align-content: center;
  justify-content: center;
  flex-direction: column;
}

.task-list-el-class 
  > .priority-level-class
  > .text-class {
  display: flex;
  align-content: center;
  justify-content: center;
  flex-direction: row;
}

.task-list-el-class 
  > .deadline-class
  > .text-class {
  display: flex;
  align-content: center;
  justify-content: flex-end;
  flex-direction: row;
}
</style>