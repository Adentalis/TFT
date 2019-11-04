package combinations.filter;

import champions.Set2.Champion;
import champions.Set2.ChampionFabric_SET2;
import champions.Set2.Synergies_SET2;
import champions.Set2.Team;

import java.util.ArrayList;

public class SynergieFilter {

    FileToTeamConverter converter;
    ArrayList<Team> allTeam;
    ArrayList<Team> filteredTeam;

    private ChampionFabric_SET2 cf;
    private ArrayList<Champion> allChampions;
    private ArrayList<Synergies_SET2> allSynergies;

    public SynergieFilter(){
        converter = new FileToTeamConverter();
        allTeam = converter.getAllTeams();
        filteredTeam = new ArrayList<>();

        //helper
        this.cf = new ChampionFabric_SET2();
        this.allChampions = this.cf.getChampionList();
        this.allSynergies = this.cf.getSynergyList();
    }

    public ArrayList<Team> getTeamWithSpecificChampion_String(String s){
        System.out.println(allTeam.size()+ " Teams to filter");
        filteredTeam.clear();
        Champion championtoFilter = getChampionOutOfString(s);
        for(Team team : allTeam){
            if(team.hasChampion(championtoFilter)){

                filteredTeam.add(team);
            }

        }
        System.out.println("");

        return filteredTeam;

    }

    private Champion getChampionOutOfString(String s) {
        for(Champion ch : allChampions){
            if(ch.getName().equals(s)){
                return ch;
            }
        }
        System.out.println("KEINEN CHAMPION MIT DIESEM NAMEN GEFUNDEN!");
        //@TODO REFACTOR i guess
        return null;
    }
}
