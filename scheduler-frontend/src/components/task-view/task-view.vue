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
      // taskService.findById(this.$route.params.id).then(
      //   response => {
      //     apiHelper.handleResponse(response, 
      //     (res) => {
      //       this.task = res.body;
      //     });
      //   }
      // );
      this.task = {
        id: 1,
        title: "Task title",
        deadline: "01/30/2022 - 2 day(s) left",
        priorityLevel: "Mildly important",
        description: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Illum magnam nam quas odit alias assumenda amet sint in esse perspiciatis quo ut, dolorum autem quos id animi incidunt quisquam impedit doloremque. Ex, dolorem libero consectetur quis voluptate sint perspiciatis inventore incidunt mollitia aperiam quidem aliquam dolore, voluptas dolor iure cupiditate.",
        typeName: "Coursework",
        course: "CSC 280",
        people: "Duong xinh",
        relatedLinks: [
          "something.com",
          "somethingelse.com"
        ]
      }
    }
  },
  created() {
    this.loadTask();
  }
}

export default TaskView;
</script>
