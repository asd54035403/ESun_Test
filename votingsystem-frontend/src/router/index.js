import Vue from 'vue'
import VueRouter from 'vue-router'
import Vote from '@/views/Vote.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Vote',
    component: Vote
  },
  // ... other routes
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
