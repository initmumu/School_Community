<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board/>
  </div>
</template>

<script>
export default {
  name: "recruitStudy",
  data () {
    return {
      title: "스터디 팀원 구함"
    }
  }
}
</script>

<style scoped>

</style>

