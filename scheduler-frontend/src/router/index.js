import { createWebHistory, createRouter } from "vue-router";

/* LAZY-LOAD */
const TASK_PAGE = () => import("../components/task-page/task-page.vue");
const TASK_VIEW_PAGE = () => import("../components/task-view/task-view.vue");
/* END OF LAZY-LOAD */

const routes = [
  {
    path: "/task",
    alias: ["/"],
    name: "TASK",
    component: TASK_PAGE
  },
  {
    path: "/task/:id",
    name: "TASK_VIEW",
    component: TASK_VIEW_PAGE
  }
];

const router = createRouter(
  {
    history: createWebHistory(),
    routes
  }
);

export default router;