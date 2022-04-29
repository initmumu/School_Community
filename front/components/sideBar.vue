<template>
  <div style="background-color: #0d326f; width: 100%; margin: 0; height: 100%">
    <el-menu
      style="width: 100%; margin: 0; padding: 0; border: 0"
      class="el-menu-vertical-demo"
      background-color="#0d326f"
      text-color="#ffffff"
      activate-text-color="#000000">
      <el-submenu v-for="data in sideBarData" :index="data.index" :key="data.title">
        <template slot="title">
          <i :class="data.icon"></i>
          <span>{{ data.title }}</span>
        </template>
        <nuxt-link
          v-for="item in data.items"
          :key="item.title"
          :to="item.link"
          style="text-decoration: none;
          color: inherit;">
          <el-menu-item  :index="item.index" style="width: 325px">
            {{ item.title }}
          </el-menu-item>
        </nuxt-link>
      </el-submenu>
    </el-menu>
    <img style="position: fixed; bottom: 0; width: 327px" src="~/static/kyungheeLogo.png"/>
  </div>

</template>

<script>
export default {
  name: 'sideBar',
  data() {
    return {
      sideBarData: [
        {
          icon: "el-icon-user",
          title: "회원관리",
          index: "1",
          items: [
            {
              index: "1-1",
              title: "동아리원",
              link: ""
            }
          ]
        },
        {
          icon: "el-icon-tickets",
          title: "커뮤니티",
          index: "2",
          items: [
            {
              index: "2-1",
              title: "자유게시판",
              link: "/community/freeBoard"
            },
            {
              index: "2-2",
              title: "정보 공유 게시판",
              link: "/community/shareInformationBoard"
            },
            {
              index: "2-3",
              title: "취업 정보 공유 게시판",
              link: "/community/shareJobInformationBoard"
            }
          ]
        },
        {
          icon: "el-icon-edit",
          title: "스터디 관련",
          index: "3",
          items: [
            {
              index: "3-1",
              title: "스터디 팀원 모집",
              link: "/study/recruitStudy"
            },
            {
              index: "3-2",
              title: "스터디 결과 보고",
              link: "/study/studyResultReport"
            }
          ]
        },
        {
          icon: "el-icon-school",
          title: "프로젝트 관련",
          index: "4",
          items: [
            {
              index: "4-1",
              title: "프로젝트 팀원 모집",
              link: "/project/recruitProject"
            },
            {
              index: "4-2",
              title: "프로젝트 결과 보고",
              link: "/project/projectResultReport"
            }
          ]
        },
        {
          icon: "el-icon-school",
          title: "선배님 밥사주세요",
          index: "5",
          items: [
            {
              index: "5-1",
              title: "밥 얻어먹을 후배님 구함",
              link: "/relation/recruitJuniorForMeal"
            },
            {
              index: "5-2",
              title: "밥 사줄 선배님 구함",
              link: "/relation/recruitSeniorForMeal"
            }
          ]
        },
      ]
    }
  }
}
</script>

<style scoped>

</style>
