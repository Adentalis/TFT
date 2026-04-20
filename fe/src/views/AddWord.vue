<template>
  <div class="grid grid-cols-1 text-center text-xl self-center gap-2">
    <span class="text-xl">Currently {{ wordCounter }} Words safed</span>
    <p class="text-xl">german</p>
    <input v-model="german" class="w-96 border-2 text-center text-xl" type="text"/>
    <p class="text-xl">english</p>
    <input v-model="english" class="w-96 border-2  text-center text-xl" type="text"/>
    <p class="text-xl">example</p>
    <input v-model="example" class="w-96 border-2  text-center text-xl" type="text"/>
    <p></p>
    <div>
      <button :disabled="english === '' && german === ''" class="text-xl bg-lime-500 p-4 rounded-xl" @click="safeWord">
        Safe
      </button>
      <button class="text-xl bg-orange-400 ml-8 p-4 rounded-xl" @click="resetForm">Abort</button>
    </div>
  </div>
</template>

<script lang="ts" setup>
import {ref} from 'vue';
import {Word} from '../utility/interfaces';
import {createTimeForNextPhase} from '../utility/helper';
import {useDB} from '../utility/firebase';

const {wordCounter, addWord} = useDB();

const english = ref('');
const german = ref('');
const example = ref('');

const safeWord = async () => {
  if (wordCounter) {
    const newEnId = wordCounter.value + 1;
    const newDeId = newEnId + 1;
    const solutionEn: Word = {
      id: newEnId,
      german: german.value,
      english: english.value,
      example: example.value,
      solution: 'en',
      phase: 0,
      nextGame: createTimeForNextPhase(0),
    };
    const solutionDe: Word = {
      id: newDeId,
      german: german.value,
      english: english.value,
      example: example.value,
      solution: 'de',
      phase: 0,
      nextGame: createTimeForNextPhase(0),
    };
    await addWord(newEnId, solutionEn);
    await addWord(newDeId, solutionDe);
    resetForm();
  }
};

const resetForm = () => {
  english.value = '';
  german.value = '';
  example.value = '';
};
</script>
