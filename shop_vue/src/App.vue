<template>
  <div id="app">
<!--    <div style="height: 10px;background: red"></div>-->
      <hint_popup/>
      <router-view/>
  </div>
</template>

<script>

import Hint_popup from "@/components/hint_popup";
export default {
  name: 'App',
  components: {Hint_popup},
}
</script>
  
<style>
#app{
  margin: 0px;
  padding:0px;

}

</style>
