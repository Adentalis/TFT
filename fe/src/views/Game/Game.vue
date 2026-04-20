<template>
  <div class="text-center">
    <h2 v-if="!playableWords" class="text-center">Loading...</h2>
    <div v-else class="text-center">
      <GameSettings
          v-if="!gameStarted"
          @start-game="
          (gameWords, gameLanguage) => startGame(gameWords, gameLanguage)
        "
      />
      <GamePlay v-else :selectedWord="selectedWords[4]" :words="selectedWords"/>
    </div>
  </div>
</template>

<script lang="ts" setup>
import {ref} from 'vue';
import {GameLanguage, Word} from '../../utility/interfaces';
import GameSettings from './GameSettings.vue';
import GamePlay from './GamePlay.vue';

const props = defineProps<{
  playableWords?: Word[];
}>();

const gameStarted = ref(false);
const selectedWords = ref();

const startGame = (gameWords: number, gameLanguage: GameLanguage) => {
  if (!props.playableWords) {
    return;
  }
  let words: Word[] = [...props.playableWords];
  words.sort(() => Math.random() - 0.5);

  if (gameLanguage === GameLanguage.EN) {
    words = words.filter((word) => word.solution === 'en');
  }
  if (gameLanguage === GameLanguage.DE) {
    words = words.filter((word) => word.solution === 'de');
  }
  if (gameWords !== 9999) {
    words = words.slice(0, gameWords);
  }
  selectedWords.value = words;
  gameStarted.value = true;
};
</script>
