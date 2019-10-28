package main;

import champions.Set2.Champion;
import champions.Set2.ChampionFabric_SET2;
import champions.Set2.TeamAnalyser_Set2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TFT {
    public static void main(String[] args) {

        ChampionFabric_SET2 championFabricSET2 = new ChampionFabric_SET2();
        ArrayList<Champion> champions = championFabricSET2.getChampionList();

        Random rnd = new Random();
        final int NUMBER_OF_CHAMPIONS = 8;
        final int NUMBER_OF_SYNERGIES = 15;


        Set<Champion> randomChampionSet = new HashSet<>();
        int matches = 0;

        do {
            int randomIndex = rnd.nextInt(champions.size());
            randomChampionSet.add(champions.get(randomIndex));
        } while (randomChampionSet.size() < NUMBER_OF_CHAMPIONS);

        TeamAnalyser_Set2 team = new TeamAnalyser_Set2();
        team.analyseChampionSet(randomChampionSet,5);
          //  matches = championFabricSET1.analyseChampionSet(randomChampionSet,NUMBER_OF_SYNERGIES);




    }
}

