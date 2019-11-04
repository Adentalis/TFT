package main;


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
       // ArrayList<Team> f = filterer.getTeamWithSpecificChampion_String("Nautilus");
        filterer.printHowOftenEachChamp();

    }
}

