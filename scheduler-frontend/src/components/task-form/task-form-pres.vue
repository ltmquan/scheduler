<template>
  <div class="task-form-class">
    <div class="title-class display-6">
      Task form
    </div>
    <div class="mb-3">
      <label class="form-label">Title</label>
      <input type="text" class="form-control" v-model="task.title" autofocus />
    </div>
    <div class="mb-3">
      <label class="form-label">Deadline</label>
      <input type="date" class="form-control" v-model="task.deadline" />
    </div>
    <div class="mb-3">
      <label class="form-label">Description</label>
      <textarea rows="5" class="form-control" v-model="task.description" />
    </div>
    <div class="mb-3">
      <label class="form-label">Task Type</label>
      <select class="form-select" v-model="task.typeId">
        <option disabled>---- Choose Type ----</option>
        <option
          v-for="type in typeList"
          :key="type.id"
          :value="type.id"
        >
          {{ type.name }}
        </option>
      </select>
    </div>
    <div class="mb-3">
      <label class="form-label">Priority level</label>
      <input type="text" class="form-control" v-model="task.priorityLevel" />
    </div>
    <div class="mb-3">
      <label class="form-label">Course</label>
      <input type="text" class="form-control" v-model="task.course" />
    </div>
    <div class="mb-3">
      <label class="form-label">People</label>
      <input type="text" class="form-control" v-model="task.people" />
    </div>
    <div class="mb-3">
      <label class="form-label">Related links</label>
      <input type="text" class="form-control" v-model="task.relatedLinks" />
    </div>
    <button class="btn btn-primary" @click="$emit('submitTask', task)">Submit</button>
  </div>
</template>

<script>
const TaskFormPres = {
  emits: ['submitTask'],
  props: {
    task: Object,
    typeList: Array
  },
};

export default TaskFormPres;
</script>

<style scoped>
.task-form-class {
  width: 100%;
  height: 100%;
  padding: 5% 0;
}

.task-form-class
  > .title-class {
  margin: 1rem 0.2rem;
}
</style>