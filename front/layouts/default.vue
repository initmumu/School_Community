<template>
  <div style="margin: 0">
    <el-container class="wrapper">
      <el-header height="100">
        <header-component />
      </el-header>
      <el-container class="wrapper">
        <el-aside width="325">
          <side-bar />
        </el-aside>
        <el-main>
          <Nuxt/>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>

export default {
  name: 'defaultLayout'
}
</script>

<style scoped>
.wrapper {
  position: relative;
}

.el-header {
  padding: 0;
  margin: 0;
  z-index: 10;
  position: fixed;
  height: 100px;
  top: 0;
  left: 0;
  width: 100%;
}

.el-aside {
  padding: 0;
  z-index: 10;
  position: fixed;
  top: 100px;
  width: 325px;
  height: 100%;
  left: 0;
  margin: 0;
}

.el-main {
  width: 70%;
  padding: 0;
  margin: 0;
  position: absolute;
  left: 400px;
  top: 100px;
  z-index: 0;
}
</style>
