<template>
  <el-card shadow="false" style="margin-top: 50px">
    <el-descriptions
      :column="3"
      border>
      <el-descriptions-item span="3">
        <template slot="label">
          <i class="el-icon-user"></i>
          글 제목
        </template>
        <el-input v-model="form.title"></el-input>
      </el-descriptions-item>
      <el-descriptions-item>
        <template slot="label">
          <i class="el-icon-user"></i>
          글쓴이
        </template>
        {{ form.author }}
      </el-descriptions-item>
      <el-descriptions-item>
        <template slot="label">
          <i class="el-icon-date"></i>
          최초 작성 시간
        </template>
        {{ form.createDate }}
      </el-descriptions-item>
      <el-descriptions-item>
        <template slot="label">
          <i class="el-icon-date"></i>
          최종 수정 시간
        </template>
        {{ form.modifiedDate }}
      </el-descriptions-item>
      <el-descriptions-item span="3" content-style="text-align: left">
        <template slot="label">
          <i class="el-icon-document"></i>
          글 내용
        </template>
        <el-input
          type="textarea"
          rows="18"
          v-model="form.content"
          style="height: 400px"
          :autosize="false"
        resize="none">
        </el-input>
      </el-descriptions-item>
    </el-descriptions>
    <el-button type="default" style="float: right; margin: 30px">작성하기</el-button>
  </el-card>

</template>

<script>
export default {
  name: "articleForm",
  data() {
    return {
      form: {
        title: "",
        author: "테스트 유저",
        createDate: new Date().toLocaleString(),
        modifiedDate: new Date().toLocaleString(),
        content: ""
      }
    }
  }
}
</script>

<style scoped>

</style>
