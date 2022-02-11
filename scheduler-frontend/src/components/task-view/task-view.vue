<template>
  <task-view-pres v-if="task" :task="task" />
</template>

<script>
import taskService from "../../services/task-service";
import apiHelper from "../../utils/api-helper";

import TaskViewPres from "./task-view-pres.vue";

const TaskView = {
  components: {
    TaskViewPres
  },
  data() {
    return {
      task: null
    }
  },
  methods: {
    loadTask() {
      taskService.findById(this.$route.params.id).then(
        response => {
          apiHelper.handleResponse(response, 
          (res) => {
            this.task = res.body;
          });
        }
      );
    }
  },
  created() {
    this.loadTask();
  }
}

export default TaskView;
</script>
