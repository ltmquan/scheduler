<template>
  <div class="task-view-class">
    <div class="task-title-class display-4">{{ task.title }}</div>
    <div class="deadline-class fw-bold">
      <span class="title-class">Deadline: </span>
      <span class="text-class text-danger">{{ task.deadline }}</span>
    </div>
    <div class="priority-level-class fw-bold">
      <span class="title-class">Priority level: </span>
      <span class="text-class text-success">{{ task.priorityLevel }}</span>
    </div>
    <div class="description-class">
      {{ task.description }}
    </div>
    <div class="type-class">
      <span class="title-class">Type: </span>
      <span class="text-class">{{ task.typeName }}</span>
    </div>
    <div class="course-class">
      <span class="title-class">Course: </span>
      <span class="text-class">{{ task.course }}</span>
    </div>
    <div class="people-class">
      <span class="title-class">People: </span>
      <span class="text-class">{{ task.people }}</span>
    </div>
    <div class="related-links-class">
      <span class="title-class">Related links: </span>
      <div
        v-for="link in task.relatedLinks"
        :key="link"
        class="link-class"
      >
        &nbsp;&nbsp;-&nbsp;&nbsp;
        <a :href="link">{{ link }}</a>
      </div>
    </div>
  </div>
</template>

<script>
const TaskViewPres = {
  props: {
    task: Object
  }
};

export default TaskViewPres;
</script>

<style scoped>
.task-view-class {
  width: 100%;
  height: 100%;
  padding: 5% 0;
}

.task-view-class > * {
  padding: 0.5rem 0;
}

.task-view-class 
  > *
  > .title-class {
  font-weight: bold;
}
</style>
