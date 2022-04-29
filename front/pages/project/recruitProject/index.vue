<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board/>
  </div>
</template>

<script>
export default {
  name: "recruitProject",
  data () {
    return {
      title: "프로젝트 팀원 모집"
    }
  }
}
</script>

<style scoped>

</style>
