<template>
  <el-card
    style="height: 700px"
    shadow="false">
    <el-table
      :data="tableData"
      style="width: 100%">
      <el-table-column
        header-align="center"
        align="center"
        prop="title"
        label="글 제목">
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
  </el-card>

</template>

<script>
export default {
  name: 'nomalBoard',
  data() {
    return {
      tableData: [
        {
          title: '테스트 글 제목',
          author: '테스트 작성자',
          createDate: '테스트 작성일',
          modifiedDate: '최종 수정일',
          numberOfReply: '99+'
        }
      ]
    }
  }
}
</script>

<style scoped>

</style>
