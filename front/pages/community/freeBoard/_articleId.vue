<template>
  <div>
    <article-component/>
  </div>
</template>

<script>
export default {
  name: "_articleId",
  async asyncData({ params }) {
    const articleId = params.articleId // When calling /abc the slug will be "abc"
    return { articleId }
  },
  data() {
    return {
      title: "testArticle"
    }
  }
}
</script>

<style scoped>

</style>
