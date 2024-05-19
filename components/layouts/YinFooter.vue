<template>
  <div class="yin-footer">
    <p v-for="(item, index) in footerList" :key="index" @click="goToBaidu(item)">
      {{ item }}
    </p>
  </div>
</template>

<script>
import { defineComponent } from "vue";

export default defineComponent({
  setup() {
    const footerList = [
      "关于 | 帮助 | 条款 | 反馈 | 下载客户端 ",
      "Copyright ; 2024 YUN-Enjoying Music",
    ];

    const goToBaidu = (item) => {
      if (item.includes('下载客户端')) {
        window.location.href = 'https://music.163.com/#/download';
      }
    };

    return { footerList, goToBaidu };
  },
});
</script>

<style lang="scss" scoped>
@import "@/assets/css/var.scss";
@import "@/assets/css/global.scss";

.yin-footer {
  width: 100%;
  height: $footer-height;
  padding: 20px 0;
  box-sizing: border-box;
  font-size: 14px;
  @include layout(center, center, column);
}

p {
  height: 30px;
}
</style>
