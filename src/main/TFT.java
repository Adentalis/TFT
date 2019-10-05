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
        final int NUMBER_OF_CHAMPIONS = 8;
        Set<Champion> randomChampionSet = new HashSet<>();

        do{
            int randomIndex = rnd.nextInt(champions.size());
            randomChampionSet.add(champions.get(randomIndex));
        }while(randomChampionSet.size() < NUMBER_OF_CHAMPIONS);

        championFabric.analyseChampionSet(randomChampionSet);








    }



}
