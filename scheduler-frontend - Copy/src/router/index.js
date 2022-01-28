import { createWebHistory, createRouter } from "vue-router";

/* LAZY-LOAD */
const TASK_PAGE = () => import("../components/task-page/task-page.vue");
/* END OF LAZY-LOAD */

const routes = [
  {
    path: "/task",
    alias: ["/"],
    name: "TASK",
    component: TASK_PAGE
  }
];

const router = createRouter(
  {
    history: createWebHistory(),
    routes
  }
);

export default router;