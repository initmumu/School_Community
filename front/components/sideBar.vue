<template>
  <div style="background-color: #0d326f; width: 100%; margin: 0; height: 100%">
    <el-menu
      style="width: 100%; margin: 0; padding: 0; border: 0"
      class="el-menu-vertical-demo"
      background-color="#0d326f"
      text-color="#ffffff"
      activate-text-color="#000000">
      <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-user"></i>
          <span>회원관리</span>
        </template>
        <el-menu-item index="1-3">동아리원 조회</el-menu-item>
      </el-submenu>
      <el-submenu index="2">
        <template slot="title">
          <i class="el-icon-tickets"></i>
          <span>커뮤니티</span>
        </template>
        <el-menu-item index="2-1">자유게시판</el-menu-item>
        <el-menu-item index="2-2">정보공유 게시판</el-menu-item>
        <el-menu-item index="2-3">취업정보 공유 게시판</el-menu-item>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title">
          <i class="el-icon-edit"></i>
          <span>스터디 관련</span>
        </template>
        <el-menu-item index="3-1">스터디 모집</el-menu-item>
        <el-menu-item index="3-2">스터디 결과 보고</el-menu-item>
      </el-submenu>
      <el-submenu index="4">
        <template slot="title">
          <i class="el-icon-school"></i>
          <span>프로젝트 관련</span>
        </template>
        <el-menu-item index="4-1">프로젝트 팀원 모집</el-menu-item>
        <el-menu-item index="4-2">프로젝트 결과 모집</el-menu-item>
      </el-submenu>
      <el-submenu index="5">
        <template slot="title">
          <i class="el-icon-food"></i>
          <span>선배 밥사주세요</span>
        </template>
        <el-menu-item index="5-1">밥 얻어먹을 후배 구합니다</el-menu-item>
        <el-menu-item index="5-2">밥 사줄 선배 구합니다</el-menu-item>
      </el-submenu>
    </el-menu>
    <img style="position: fixed; bottom: 0; width: 327px" src="~/static/kyungheeLogo.png"/>
  </div>

</template>

<script>
export default {
  name: 'sideBar'
}
</script>

<style scoped>

</style>
