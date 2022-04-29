<template>
  <el-card shadow="false" style="margin-top: 50px">
    <el-descriptions
      title="글 제목"
      :column="3"
      border>
      <template slot="extra">
        <el-button type="primary" size="medium">글 삭제</el-button>
        <el-button type="warning" size="medium">글 수정</el-button>
      </template>
      <el-descriptions-item
        label-style="width: 10%; text-align: center"
        content-style="text-align: center">
        <template slot="label">
          <i class="el-icon-user"></i>
          글쓴이
        </template>
        테스트 글쓴이
      </el-descriptions-item>
      <el-descriptions-item
        label-style="text-align: center"
        content-style="text-align: center">
        <template slot="label">
          <i class="el-icon-date"></i>
          최초 작성 시간
        </template>
        테스트용 최초 작성 시간
      </el-descriptions-item>
      <el-descriptions-item
        label-style="text-align: center"
        content-style="text-align: center">
        <template slot="label">
          <i class="el-icon-date"></i>
          최종 수정 시간
        </template>
        테스트용 최종 수정 시간
      </el-descriptions-item>
      <el-descriptions-item
        span="3"
        label-style="text-align: center"
        content-style="text-align: left">
        <template slot="label">
          <i class="el-icon-document"></i>
          글 내용
        </template>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sagittis vitae et leo duis ut diam quam nulla porttitor. Sit amet dictum sit amet justo donec. Turpis nunc eget lorem dolor sed viverra ipsum. Mauris rhoncus aenean vel elit scelerisque. Vivamus arcu felis bibendum ut tristique et egestas. Nisl tincidunt eget nullam non nisi. Vitae semper quis lectus nulla. Velit ut tortor pretium viverra suspendisse potenti nullam. Phasellus vestibulum lorem sed risus ultricies tristique nulla. Enim nunc faucibus a pellentesque sit amet. Mattis aliquam faucibus purus in massa tempor nec feugiat nisl. Purus in mollis nunc sed id semper risus in. Condimentum id venenatis a condimentum vitae sapien pellentesque. In eu mi bibendum neque egestas congue quisque. Congue mauris rhoncus aenean vel elit scelerisque mauris pellentesque. Nisl purus in mollis nunc sed id semper risus in. Felis donec et odio pellentesque diam volutpat. Ipsum dolor sit amet consectetur adipiscing elit. Phasellus egestas tellus rutrum tellus.

        Interdum posuere lorem ipsum dolor sit amet consectetur adipiscing elit. Commodo ullamcorper a lacus vestibulum sed arcu. Nascetur ridiculus mus mauris vitae ultricies leo. Neque laoreet suspendisse interdum consectetur libero. In nisl nisi scelerisque eu ultrices vitae auctor eu augue. Nisl pretium fusce id velit ut tortor pretium viverra. Orci sagittis eu volutpat odio facilisis mauris sit. Viverra tellus in hac habitasse platea dictumst vestibulum. Pellentesque pulvinar pellentesque habitant morbi. Bibendum at varius vel pharetra vel turpis nunc eget. Tellus integer feugiat scelerisque varius morbi enim. Eget arcu dictum varius duis. Potenti nullam ac tortor vitae purus faucibus ornare suspendisse. Consequat semper viverra nam libero justo laoreet sit amet cursus. Dignissim convallis aenean et tortor at risus viverra. Diam volutpat commodo sed egestas. Neque laoreet suspendisse interdum consectetur libero id.

        Sapien faucibus et molestie ac feugiat sed lectus vestibulum mattis. Eget nulla facilisi etiam dignissim diam quis enim. Est ullamcorper eget nulla facilisi etiam dignissim diam quis. Vitae auctor eu augue ut. Mus mauris vitae ultricies leo integer malesuada nunc vel. Sit amet aliquam id diam maecenas ultricies mi eget. Tellus elementum sagittis vitae et leo. Ipsum suspendisse ultrices gravida dictum fusce ut. Volutpat odio facilisis mauris sit amet massa vitae tortor condimentum. Lorem sed risus ultricies tristique nulla aliquet. Id cursus metus aliquam eleifend mi in. Laoreet suspendisse interdum consectetur libero id faucibus. Donec enim diam vulputate ut pharetra sit.

        Eu scelerisque felis imperdiet proin fermentum leo vel orci. A diam sollicitudin tempor id eu nisl nunc. Et malesuada fames ac turpis egestas. Leo a diam sollicitudin tempor id eu. Aliquet risus feugiat in ante metus. Tristique et egestas quis ipsum suspendisse ultrices gravida. Malesuada fames ac turpis egestas integer eget aliquet nibh praesent. Leo urna molestie at elementum eu facilisis. Lacus sed turpis tincidunt id aliquet risus feugiat in. Mattis ullamcorper velit sed ullamcorper morbi tincidunt. Risus ultricies tristique nulla aliquet enim tortor at auctor urna. Dui ut ornare lectus sit amet est placerat in egestas.

        Vitae et leo duis ut diam quam nulla porttitor massa. Dignissim enim sit amet venenatis urna cursus eget. Nunc vel risus commodo viverra maecenas accumsan lacus. Vitae proin sagittis nisl rhoncus mattis rhoncus. Congue eu consequat ac felis donec et. Risus ultricies tristique nulla aliquet enim tortor at auctor. Amet dictum sit amet justo donec enim diam vulputate ut. Tristique nulla aliquet enim tortor at auctor urna nunc id. Pellentesque massa placerat duis ultricies lacus sed turpis tincidunt. Sed risus ultricies tristique nulla aliquet.
      </el-descriptions-item>
    </el-descriptions>
  </el-card>
</template>

<script>
export default {
  name: "articleComponent"
}
</script>

<style scoped>
.custom-label-style {
  width: 10%;
}
</style>
