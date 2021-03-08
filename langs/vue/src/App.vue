<template>
  <div id="app">
    <div id="logo">
      <img alt="Vue logo" src="./assets/loading.svg">
    </div>
    <div>{{ message }}</div>
    <!--    <HelloWorld msg="Welcome to Your Vue.js App"/>-->
  </div>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  data() {
    return {
      "message": "message"
    }
  },
  // components: {
  //   HelloWorld
  // }
}
</script>

<style>
html,
body {
  background-color: #0f0f1e;
  text-align: center;
  color: #bdc5cd;
}

#logo {
  width: 108px;
  height: 108px;
  margin-left: 45%;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  margin-top: 60px;
}
</style>
