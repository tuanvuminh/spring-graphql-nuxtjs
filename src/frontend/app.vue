<script setup>
const posts = await GqlFindAllPosts();

const page = ref(1)
const pageCount = 15
const rows = computed(() => {
  return posts.findAllPosts.slice((page.value - 1) * pageCount, (page.value) * pageCount)
})
</script>

<template>
  <main class="container mx-auto">
    <UTable :rows="rows" />

    <UPagination v-model="page" :page-count="pageCount" :total="posts.findAllPosts.length" />
  </main>
</template>
