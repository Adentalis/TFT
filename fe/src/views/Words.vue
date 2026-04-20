<template>
  <h2>All Words ({{ props.allWords.length }})</h2>

  <div class="ml-[30px] text-xl">
    <div id="table-header" class="grid grid-cols-[70px_180px_180px_70px_100px_120px_1fr] h-[50px]">
      <div class="bg-[rgb(56,56,56)] text-aliceblue">id</div>
      <div class="bg-[rgb(56,56,56)] text-aliceblue">german</div>
      <div class="bg-[rgb(56,56,56)] text-aliceblue">english</div>
      <div class="bg-[rgb(56,56,56)] text-aliceblue">phase</div>
      <div class="bg-[rgb(56,56,56)] text-aliceblue">solution</div>
      <div class="bg-[rgb(56,56,56)] text-aliceblue">nextGame</div>
      <div class="bg-[rgb(56,56,56)] text-aliceblue">example</div>
    </div>
    <div
        v-for="word in props.allWords"
        class="grid grid-cols-[70px_180px_180px_70px_100px_120px_1fr] text-aliceblue mt-[15px] even:bg-[rgb(51,51,45)] hover:bg-[rgb(62,62,48)]">
      <div class="flex">{{ word.id }}</div>
      <div class="flex">{{ word.german }}</div>
      <div class="flex">{{ word.english }}</div>
      <div class="flex">{{ word.phase }}</div>
      <div class="flex">{{ word.solution }}</div>
      <div class="flex">{{ word.nextGame }}</div>
      <div class="flex">{{ word.example }}</div>
    </div>
  </div>
</template>

<script lang="ts" setup>
import {Word} from '../utility/interfaces';

const props = defineProps<{
  allWords: Word[];
}>();
</script>
