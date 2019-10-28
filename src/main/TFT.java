package main;

import champions.Champion;
import champions.ChampionFabric;


import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
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
        final int NUMBER_OF_SYNERGIES = 15;


        /*
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        try {
            fos = new FileOutputStream("hello.txt");
            osw = new OutputStreamWriter(fos);
            osw.write("Hello World!.");
            osw.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        */


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

            matches = championFabric.analyseChampionSet(randomChampionSet,NUMBER_OF_SYNERGIES);

        } while (matches <NUMBER_OF_SYNERGIES);

        System.out.println(counter);


    }
}

