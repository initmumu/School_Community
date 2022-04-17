<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board/>
  </div>
</template>

<script>
export default {
  name: "freeboard",
  data () {
    return {
      title: "자유 게시판"
    }
  }
}
</script>

<style scoped>

</style>
