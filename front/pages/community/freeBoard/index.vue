<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board v-bind:path="path"/>
  </div>
</template>

<script>
export default {
  name: "freeboard",
  data () {
    return {
      title: "자유 게시판",
      path: "/community/freeboard/"
    }
  }
}
</script>

<style scoped>

</style>
