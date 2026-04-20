<template>
  <div class="grid grid-cols-2">
    <div class="flex flex-col text-center text-xl gap-4">
      <h2 class="text-pink-400 text-3xl mb-4">Stats</h2>
      <p>Amount of words: {{ amountOfWords }}</p>
      <p>Words to Play: {{ wordsToPlay?.length }}</p>
      <p>In Phase 0: {{ p?.new }}</p>
      <p>In Phase 1: {{ p?.p1 }}</p>
      <p>In Phase 2: {{ p?.p2 }}</p>
      <p>In Phase 3: {{ p?.p3 }}</p>
      <p>In Phase 4: {{ p?.p4 }}</p>
      <p>In Phase 5: {{ p?.p5 }}</p>
      <p>In Phase 6: {{ p?.p6 }}</p>
      <p>Completed: {{ p?.finished }}</p>
    </div>
    <div class="flex flex-col text-center text-xl gap-4">
      <h2 class="text-pink-400 text-3xl mb-4">Other Stats</h2>
      <p>Session Stats Correct:{{ sessionWins }} Wrong:{{ sessionLooses }}</p>
      <p>Dailys completed - ToDo</p>
      <p>all time words trained with correct/false - ToDo</p>
      <p>Daily streak daily/one word - ToDo</p>
    </div>
  </div>
</template>

<script lang="ts" setup>
import {Phases, Word} from '../utility/interfaces';

defineProps<{
  amountOfWords?: number;
  wordsToPlay?: Word[];
  p?: Phases;
  sessionWins: number;
  sessionLooses: number;
}>();
</script>
