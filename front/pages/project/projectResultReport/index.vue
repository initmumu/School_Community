<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board/>
  </div>
</template>

<script>
export default {
  name: "projectResultReport",
  data () {
    return {
      title: "프로젝트 결과 보고"
    }
  }
}
</script>

<style scoped>

</style>
