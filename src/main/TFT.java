package main;

import champions.Champion;
import champions.ChampionFabric;
import champions.Classes;
import champions.Origin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TFT {
    public static void main(String[] args) {

        ChampionFabric championFabric = new ChampionFabric();

        ArrayList<Champion> champions = championFabric.getChampionList();


        Random rnd = new Random();
        final int NUMBER_OF_CHAMPIONS = 9;


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

            matches = championFabric.analyseChampionSet(randomChampionSet);

        } while (matches <20);

        System.out.println(counter);


    }
}
