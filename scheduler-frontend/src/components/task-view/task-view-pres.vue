<template>
  <div class="task-view-class">
    <div class="title-class display-4">Task title</div>
    <div class="deadline-class fw-bold">
      Deadline:
      <span class="text-class text-danger">01/30/2022 - 2 day(s) left</span>
    </div>
    <div class="priority-level-class fw-bold">
      Priority level:
      <span class="text-class text-success">Mildly important</span>
    </div>
    <div class="description-class">
      Lorem ipsum dolor sit amet consectetur adipisicing elit. Illum magnam nam
      quas odit alias assumenda amet sint in esse perspiciatis quo ut, dolorum
      autem quos id animi incidunt quisquam impedit doloremque. Ex, dolorem
      libero consectetur quis voluptate sint perspiciatis inventore incidunt
      mollitia aperiam quidem aliquam dolore, voluptas dolor iure cupiditate.
    </div>
    <div class="type-class">
      Type: Coursework
    </div>
    <div class="course-class">
      Course: CSC 280
    </div>
    <div class="people-class">
      People: Duong xinh
    </div>
    <div class="related-links-class">
      <div class="link-class">
        <a href="something">something.com</a>
      </div>
      <div class="link-class">
        <a href="somethingelse">somethingelse.com</a>
      </div>
    </div>
  </div>
</template>

<script>
const TaskViewPres = {
  data() {
    return {
      id: this.$route.params.id,
    };
  },
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
</style>
