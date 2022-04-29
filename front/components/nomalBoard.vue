<template>
  <el-card
    style="height: 700px"
    shadow="false">
    <el-table
      :data="tableData"
      style="width: 100%; height: 600px">
      <el-table-column
        header-align="center"
        align="center"
        prop="title"
        label="글 제목">
        <template v-slot:default="slot">
          <nuxt-link
            :to="path+slot.row.articleId"
            style="text-decoration: none; color: black">
            {{slot.row.title}}
          </nuxt-link>
        </template>
      </el-table-column>
      <el-table-column
        header-align="center"
        align="center"
        prop="author"
        label="작성자"
        width="180">
      </el-table-column>
      <el-table-column
        header-align="center"
        align="center"
        prop="createDate"
        label="작성일"
        width="180">
      </el-table-column>
      <el-table-column
        header-align="center"
        align="center"
        prop="modifiedDate"
        label="수정일"
        width="180">
      </el-table-column>
      <el-table-column
        header-align="center"
        align="center"
        prop="numberOfReply"
        label="댓글 수"
        width="180">
      </el-table-column>
    </el-table>
    <el-button
      type="default"
      style="margin-top: 20px; float: right">글쓰기</el-button>
  </el-card>

</template>

<script>
export default {
  name: 'nomalBoard',
  props: ['path'],
  data() {
    return {
      tableData: [
        {
          title: '테스트 글 제목',
          author: '테스트 작성자',
          createDate: '테스트 작성일',
          modifiedDate: '최종 수정일',
          numberOfReply: '99+',
          articleId: "articleId"
        }
      ]
    }
  }
}
</script>

<style scoped>
a:link {
  color: black;
  background-color: transparent;
  text-decoration: none;
}

a:visited {
  color: black;
  background-color: transparent;
  text-decoration: none;
}

a:hover {
  color: black;
  background-color: transparent;
  text-decoration: underline;
}

a:active {
  color: black;
  background-color: transparent;
  text-decoration: underline;
}
</style>
