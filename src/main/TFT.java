package main;

import champions.Set2.Champion;
import champions.Set2.ChampionFabric_SET2;
import champions.Set2.TeamAnalyser_Set2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TFT {
    public static void main(String[] args) {


        TeamAnalyser_Set2 team = new TeamAnalyser_Set2();
        ChampionFabric_SET2 championFabricSET2 = new ChampionFabric_SET2();
        ArrayList<Champion> champions = championFabricSET2.getChampionList();

        Random rnd = new Random();
        final int NUMBER_OF_CHAMPIONS = 7;
        final int NUMBER_OF_SYNERGIES = 13;
        final int NUMBER_OF_TRIES = 10000000;
        int counter = 0;

        Set<Champion> randomChampionSet = new HashSet<>();
        int matches = 0;

        do {
            randomChampionSet.clear();
            counter++;
            if(counter %100000 == 0){
                System.out.println(counter);
            }
            do {
                int randomIndex = rnd.nextInt(champions.size());
                randomChampionSet.add(champions.get(randomIndex));
            } while (randomChampionSet.size() < NUMBER_OF_CHAMPIONS);
            team.analyseChampionSet(randomChampionSet,NUMBER_OF_SYNERGIES);
        }while(counter < NUMBER_OF_TRIES);
        //}while(team.analyseChampionSet(randomChampionSet,NUMBER_OF_SYNERGIES) <NUMBER_OF_SYNERGIES);
          //  matches = championFabricSET1.analyseChampionSet(randomChampionSet,NUMBER_OF_SYNERGIES);


    }
}

