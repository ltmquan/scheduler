<template>
  <task-page-pres :task-list="taskList" />
</template>

<script>
import TaskPagePres from "./task-page-pres.vue";

const TaskPage = {
  components: {
    TaskPagePres
  },
  data() {
    return {
      taskList: [
        {
          id: 1,
          title: "Task 1",
          deadline: new Date("01/28/2022"),
          priorityLevel: 5,
        },
        {
          id: 2,
          title: "Task 2",
          deadline: new Date("01/30/2022"),
          priorityLevel: 4,
        },
        {
          id: 3,
          title: "Task 3",
          deadline: new Date("02/01/2022"),
          priorityLevel: 3,
        },
        {
          id: 4,
          title: "Task 4",
          deadline: new Date("02/04/2022"),
          priorityLevel: 2,
        },
        {
          id: 5,
          title: "Task 5",
          deadline: new Date("02/20/2022"),
          priorityLevel: 1,
        },
      ],
    };
  },
}

export default TaskPage;
</script>
