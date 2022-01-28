<template>
  <main-page />
</template>

<script>
import MainPage from "./components/main-page/main-page.vue"

const App = {
  components: {
    MainPage
  }
}

export default App;
</script>

<style>
* {
  margin: 0;
  padding: 0;
}

html,
body {
  width: 100%;
  height: 100%;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: var(--bs-primary-font-color);
  width: 100%;
  height: 100%;
}
</style>
