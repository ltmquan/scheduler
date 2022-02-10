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
    <div class="action-class">
      <div class="text-class">
        <font-awesome-icon icon="trash" @click.stop="$emit('deleteTask', task.id)" />
        <font-awesome-icon icon="pencil-alt" @click.stop="$emit('updateTask', task.id)" />
      </div>
    </div>
  </div>
</template>

<script>
const TaskListElPres = {
  emits: ['deleteTask', 'updateTask'],
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
  width: 30%;
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
  > .action-class {
  width: 20%;
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
  justify-content: flex-start;
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

.task-list-el-class 
  > .action-class
  > .text-class {
  display: flex;
  align-content: center;
  justify-content: flex-end;
  flex-direction: row;
}

.task-list-el-class 
  > .action-class
  > .text-class
  > * {
  margin: 0 0.5rem;
  font-size: 1.5rem;
}
</style>