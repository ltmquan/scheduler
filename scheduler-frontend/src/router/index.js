import { createWebHistory, createRouter } from "vue-router";

/* LAZY-LOAD */
const TASK_PAGE = () => import("../components/task-page/task-page.vue");
const TASK_VIEW_PAGE = () => import("../components/task-view/task-view.vue");
const TASK_CREATE_PAGE = () => import("../components/task-form/task-form.vue");
/* END OF LAZY-LOAD */

const routes = [
  {
    path: "/task",
    alias: ["/"],
    name: "TASK",
    component: TASK_PAGE
  },
  {
    path: "/task/view/:id",
    name: "TASK_VIEW",
    component: TASK_VIEW_PAGE
  },
  {
    path: "/task/create",
    name: "TASK_CREATE",
    component: TASK_CREATE_PAGE
  }
];

const router = createRouter(
  {
    history: createWebHistory(),
    routes
  }
);

export default router;