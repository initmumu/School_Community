<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board/>
  </div>
</template>

<script>
export default {
  name: "recruitJuniorForMeal",
  data () {
    return {
      title: "밥 얻어 먹을 후배 구함"
    }
  }
}
</script>

<style scoped>

</style>
