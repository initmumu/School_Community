<template>
  <div class="title">
    <h1>{{title}}</h1>
    <el-divider/>
  </div>
</template>

<script>
export default {
  name: "titleComponent",
  props: ['title']
}
</script>

<style scoped>
.title {
  font-size: 20px;

  margin-bottom: 50px;
}
</style>
