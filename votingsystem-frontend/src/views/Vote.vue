<template>
  <div>
    <h1>投票項目</h1>
    <ul>
      <li v-for="item in voteItems" :key="item.itemNo">
        {{ item.itemName }} <button @click="castVote(item.itemNo)">投票</button>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      voteItems: []
    };
  },
  created() {
    this.fetchVoteItems();
  },
  methods: {
    async fetchVoteItems() {
      try {
        const response = await this.$http.get('http://localhost:8080/api/vote/items');
        this.voteItems = response.data;
      } catch (error) {
        console.error("Error fetching vote items:", error);
      }
    },
    async castVote(itemNo) {
       try {
            const response = await this.$http.post(`http://localhost:8080/api/vote/${itemNo}`);
            if (response.data.success) {
            alert("投票成功！");
            this.fetchVoteItems(); // Refresh the vote items to show updated vote counts
            } else {
            alert("投票失敗：" + response.data.message);
            }
        } catch (error) {
            console.error("Error casting vote:", error);
        }
    }
  }
}
</script>
