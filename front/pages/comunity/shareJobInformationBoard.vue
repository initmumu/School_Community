<template>
  <div>
    <title-component v-bind:title="title"/>
    <nomal-board/>
  </div>
</template>

<script>
export default {
  name: "shareJobInformationBoard",
  data () {
    return {
      title: "취업 정보 공유 게시판"
    }
  }
}
</script>

<style scoped>

</style>
