package main;


import champions.Set2.Synergies_SET2;
import champions.Set2.Team;
import combinations.filter.SynergieFilter;

import java.util.ArrayList;

public class TFT {
    public static void main(String[] args) {
        /*
        TeamAnalyser_Set2 team = new TeamAnalyser_Set2();
        team.analyseChampionSet(9,18,10000000);
        */

        SynergieFilter filterer = new SynergieFilter();
       // ArrayList<Team> f = filterer.getTeamWithSpecificChampion_String("Nami");
        ArrayList<Team> ss = filterer.getTeamWithSpecificSynergy(Synergies_SET2.CLOUD,2);
       // filterer.printHowOftenEachChamp();
        System.out.println("END");
    }
}

