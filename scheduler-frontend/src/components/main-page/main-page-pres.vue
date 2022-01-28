<template>
  <div class="main-page-class">

    <!-- NAVBAR AREA -->
    <div class="row navbar-area m-0">
      <div class="col-12 p-0">
        <navbar />
      </div>
    </div>
    <!-- END OF NAVBAR AREA -->

    <!-- CONTENT AREA -->
    <div class="row justify-content-center content-area m-0">
      <div class="col-9 my-3 p-0">
        <router-view></router-view>
      </div>
    </div>
    <!-- END OF CONTENT AREA -->

  </div>
</template>

<script>
import Navbar from '../navbar/navbar.vue';

const MainPagePres = {
  components: {
    Navbar
  }
};

export default MainPagePres;
</script>

<style scoped>
.main-page-class {
  width: 100%;
  height: 100%;
}

.navbar-area {
  height: 15%;
}

.content-area {
  height: 85%;
}
</style>