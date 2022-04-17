<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board/>
  </div>
</template>

<script>
export default {
  name: "studyResultReport",
  data () {
    return {
      title: "스터디 결과 보고"
    }
  }
}
</script>

<style scoped>

</style>
