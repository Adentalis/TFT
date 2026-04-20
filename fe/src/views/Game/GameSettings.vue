<template>
  <div class="grid grid-cols-1">
    <div>
      <span>Worte zu spielen: </span>
      <input v-model.number="gameWords" class="border-2" type="number"></input>
      <button
          :class="[gameWords === 9999 ? 'bg-[rgb(150,243,10)] text-[rgb(2,38,38)]' : 'bg-[rgb(93,63,9)] text-aqua']"
          class="w-16 h-12 m-5 text-xl italic rounded-[20px]"
          @click="gameWords = 9999"
      >
        All
      </button>
    </div>
    <div>
      <button
          :class="[gameLanguage === GameLanguage.BOTH ? 'bg-[rgb(150,243,10)] text-[rgb(2,38,38)]' : 'bg-[rgb(93,63,9)] text-aqua']"
          class="w-20 h-16 m-4 text-xl italic rounded-xl"
          @click="gameLanguage = GameLanguage.BOTH"
      >
        Both
      </button>
      <button
          :class="[gameLanguage === GameLanguage.EN ? 'bg-[rgb(150,243,10)] text-[rgb(2,38,38)]' : 'bg-[rgb(93,63,9)] text-aqua']"
          class="w-20 h-16 m-4 text-xl italic rounded-xl"
          @click="gameLanguage = GameLanguage.EN"
      >
        EN
      </button>
      <button
          :class="[gameLanguage === GameLanguage.DE ? 'bg-[rgb(150,243,10)] text-[rgb(2,38,38)]' : 'bg-[rgb(93,63,9)] text-aqua']"
          class="w-20 h-16 m-4 text-xl italic rounded-xl"
          @click="gameLanguage = GameLanguage.DE"
      >
        DE
      </button>
    </div>
    <div class="flex justify-center">

      <button class="w-32 h-16 m-4 text-xl italic rounded-xl bg-blue-500"
              @click="$emit('startGame', gameWords, gameLanguage)">
        Start Game
      </button>
    </div>
  </div>
</template>

<script lang="ts" setup>
import {ref} from 'vue';
import {GameLanguage} from '../../utility/interfaces';

const gameWords = ref<number>(20);
const gameLanguage = ref<GameLanguage>(GameLanguage.BOTH);

const emit = defineEmits(['startGame']);
</script>
