<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board/>
  </div>
</template>

<script>
export default {
  name: "shareInformationBoard",
  data () {
    return {
      title: "정보 공유 게시판"
    }
  }
}
</script>

<style scoped>

</style>
