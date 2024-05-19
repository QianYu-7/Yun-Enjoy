<template>
  <div class="login-logo imageSrc">
    <img :src="imageSrc" alt="Login Image">
  </div>
</template>

<script lang="ts">
import { defineComponent } from "vue";

export default defineComponent({
  data() {
    return {
      // 使用 require 确保图片路径正确处理
      imageSrc: require('@/assets/images/img.jpg'),
    };
  },
});
</script>

<style lang="scss" scoped>
@import "@/assets/css/var.scss";
@import "@/assets/css/global.scss";

.imageSrc {
  background-color: $color-blue-light;
  height: calc(100vh - $header-height - $footer-height);
  min-width: 50vw;
  overflow: hidden;
  @include layout(center, center);
}
@media screen and (min-width: $sm) {
  .imageSrc {
    width:99vw;
  }
}

@media screen and (max-width: $sm) {
  .imageSrc {
    width: 110vw;
  }
}
</style>