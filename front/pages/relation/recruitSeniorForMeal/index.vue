<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board/>
  </div>
</template>

<script>
export default {
  name: "recruitSeniorForMeal",
  data () {
    return {
      title: "밥 사줄 선배 구함"
    }
  }
}
</script>

<style scoped>

</style>
