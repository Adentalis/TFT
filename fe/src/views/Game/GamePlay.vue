<template>
  <div v-if="!gameOver" class="mt-36">
    <h3 class="text-4xl">

      {{ question }}
    </h3>
    <div v-if="selectedWord.example">
      <button class="text-2xl m-4 p-4 rounded-2xl border border-black bg-white text-black cursor-pointer"
              @click="showExample = !showExample">Show example sentence
      </button>
      <p v-if="showExample" class="text-2xl">{{ selectedWord.example }}</p>
    </div>
    <div>
      <input class="text-[2rem] border-2" type="text"/>
    </div>
    <div>
      <button class="text-2xl m-4 p-4 rounded-2xl border border-black bg-white text-black cursor-pointer"
              @click="showSolution = !showSolution">
        Show solution
      </button>
      <div v-if="showSolution">
        <p v-if="selectedWord.solution === 'de'">{{ selectedWord.german }}</p>
        <p v-else>{{ selectedWord.english }}</p>
        <button class="text-[2rem] p-4 rounded-2xl border border-black bg-lime-500 text-black cursor-pointer"
                @click="correctAnswer(true)">True
        </button>
        <button class="text-[2rem] p-4 rounded-2xl border ml-8 border-black bg-red-500 text-black cursor-pointer"
                @click="correctAnswer(false)">False
        </button>
      </div>
    </div>
    <p></p>
    <a :href="`${ponsLink}`" class="text-gold" rel="noreferrer" target="_blank"> Link To Pons </a>
    <div id="remaining" class="text-xl mt-10">
      <span> Words to play: {{ words.length }}</span>
    </div>
  </div>
  <div v-else>
    <h1>Game Over</h1>
    <h1>Well Done :)</h1>
  </div>
</template>

<script lang="ts" setup>
import {computed, ref} from 'vue';
import {Word} from '../../utility/interfaces';
import {useDB} from '../../utility/firebase';
import {createTimeForNextPhase} from '../../utility/helper';

const props = defineProps<{
  words: Word[];
}>();

const {updateWord} = useDB();

const showSolution = ref(false);
const showExample = ref(false);
const gameOver = ref(false);

const words = ref([...props.words]);
const selectedWordIndex = ref(Math.floor(Math.random() * words.value.length));
const selectedWord = computed(() => words.value[selectedWordIndex.value]);

const question = computed(() => {
  return (
      (selectedWord.value.solution === 'de'
          ? selectedWord.value.english
          : selectedWord.value.german) + `(${selectedWord.value.phase})`
  );
});

const ponsLink = computed(() => {
  const splittedWord = selectedWord.value.english.split(' ');
  const word = splittedWord.length === 1 ? splittedWord[0] : splittedWord[1];
  return `https://de.pons.com/%C3%BCbersetzung/englisch-deutsch/${word}`;
});

const correctAnswer = async (answer: boolean) => {
  showSolution.value = false;
  showExample.value = false;

  const newPhase = answer ? selectedWord.value.phase + 1 : 0;
  updateWord(selectedWord.value.id, {
    phase: newPhase,
    nextGame: createTimeForNextPhase(newPhase),
  });

  if (answer) {
    words.value = words.value.filter(
        (word) => word.id !== selectedWord.value.id
    );
  } else {
    // updates the phase in fe only
    words.value[selectedWordIndex.value].phase = 0;
  }

  if (words.value.length > 0) {
    selectedWordIndex.value = Math.floor(Math.random() * words.value.length);
  } else {
    gameOver.value = true;
  }
};
</script>
