<template>
  <div>
    <title-component v-bind:title="title"></title-component>
    <nomal-board />
  </div>

</template>

<script>
export default {
  name: 'IndexPage',
  layout: 'defaultLayout',
  data() {
    return {
      title: "INDEX"
    }
  }
}
</script>
