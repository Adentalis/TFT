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
        System.out.println(allTeam.size()+ " Teams to filter");
        filteredTeam = new ArrayList<>();

        //helper
        this.cf = new ChampionFabric_SET2();
        this.allChampions = this.cf.getChampionList();
        this.allSynergies = this.cf.getSynergyList();
    }

    public ArrayList<Team> getTeamWithSpecificChampion_String(String s){
        filteredTeam.clear();
        Champion championtoFilter = getChampionOutOfString(s);

        return getTeamWithSpecificChampion(championtoFilter);
    }
    public ArrayList<Team> getTeamWithSpecificChampion(Champion c){
        filteredTeam.clear();
        for(Team team : allTeam){
            if(team.hasChampion(c)){
                filteredTeam.add(team);
            }
        }
        return filteredTeam;
    }

    public ArrayList<Team> getTeamWithSpecificChampions_String(ArrayList<String> champs){
        ArrayList<Champion> champions = new ArrayList<>();
        for(String s : champs){
            champions.add(getChampionOutOfString(s));

        }
        return getTeamWithSpecificChampions(champions);
    }

    public ArrayList<Team> getTeamWithSpecificChampions(ArrayList<Champion> champs){

        ArrayList<Team> teamToManipulate = (ArrayList<Team>) allTeam.clone();

        for(Champion ch : champs){
            teamToManipulate.removeIf(team-> !team.hasChampion(ch));

        }
        System.out.println();


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

    public ArrayList<Team> getTeamWithSpecificSynergy(Synergies_SET2 s, int counter){
        filteredTeam.clear();
        for(Team team : allTeam){
            if(team.hasSynergy(s,counter)){
                filteredTeam.add(team);
            }
        }
        return filteredTeam;
    }


    //METHODS FOR STATISTICS
    public void printHowOftenEachChamp(){
        filteredTeam.clear();
        for(Champion ch : allChampions){

            filteredTeam = getTeamWithSpecificChampion_String(ch.getName());
            System.out.println(ch.getName() +" - "+filteredTeam.size()+ " = "+(double)filteredTeam.size()/(double)allTeam.size()*100+"%");
        }

    }
}
