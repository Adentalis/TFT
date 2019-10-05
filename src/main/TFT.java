package main;

import champions.Champion;
import champions.ChampionFabric;
import champions.Classes;
import champions.Origin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TFT {
    public static void main(String[] args) {

        ChampionFabric championFabric = new ChampionFabric();


        ArrayList<Champion> champions = championFabric.getChampionList();
        System.out.println(champions.size());
        championFabric.printOrigins();
        championFabric.printClasses();
        //championFabric.printChampions();







    }



}
