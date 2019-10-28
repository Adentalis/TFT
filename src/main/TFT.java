package main;

import champions.Champion;
import champions.ChampionFabric_SET1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TFT {
    public static void main(String[] args) {

        ChampionFabric_SET1 championFabricSET1 = new ChampionFabric_SET1();

        ArrayList<Champion> champions = championFabricSET1.getChampionList();

        Random rnd = new Random();
        final int NUMBER_OF_CHAMPIONS = 8;
        final int NUMBER_OF_SYNERGIES = 15;



        Set<Champion> randomChampionSet = new HashSet<>();
        int matches = 0;
        int counter =0;

        do {
            counter++;

            if(counter%1000000==0){
                System.out.println(counter);
            }
            randomChampionSet.clear();
            do {
                int randomIndex = rnd.nextInt(champions.size());
                randomChampionSet.add(champions.get(randomIndex));
            } while (randomChampionSet.size() < NUMBER_OF_CHAMPIONS);

            matches = championFabricSET1.analyseChampionSet(randomChampionSet,NUMBER_OF_SYNERGIES);

        } while (matches <NUMBER_OF_SYNERGIES);

        System.out.println(counter);


    }
}

