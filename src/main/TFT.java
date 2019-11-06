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
        ArrayList<String>champs = new ArrayList<>();
        champs.add("Nasus");
        champs.add("Ashe");
      //  champs.add("Veigar");

        ArrayList<Team> f = filterer.getTeamWithSpecificChampions_String(champs);
       // ArrayList<Team> f = filterer.getTeamWithSpecificChampion_String("Nami");
       // ArrayList<Team> ss = filterer.getTeamWithSpecificSynergy(Synergies_SET2.CLOUD,2);
       // filterer.printHowOftenEachChamp();
        System.out.println("END");



        /*TEST CODE

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hallo");
        strings.add("Hello");
        strings.add("ola");

        ArrayList<String> toManipulate = (ArrayList<String>) strings.clone();

        System.out.println();
        toManipulate.removeIf(o -> o.charAt(0)== 'H');

        System.out.println();

         */

    }
}

