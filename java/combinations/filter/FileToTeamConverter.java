package combinations.filter;

import champions.Set2.Champion;
import champions.Set2.ChampionFabric_SET2;
import champions.Set2.Synergies_SET2;
import champions.Set2.Team;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FileToTeamConverter {

    private ChampionFabric_SET2 cf;
    private ArrayList<Champion> allChampions;
    private ArrayList<Synergies_SET2> allSynergies;
    private ArrayList<Team> allTeams;

    public FileToTeamConverter(){
        this.allTeams = new ArrayList<>();
        this.cf = new ChampionFabric_SET2();
        this.allChampions = this.cf.getChampionList();
        this.allSynergies = this.cf.getSynergyList();
        initTeams();
    }

    private void initTeams() {
        BufferedReader reader;
        String filePath = "./src/combinations/Set2/";
        File[] files = new File(filePath).listFiles();
        for(int i = 0; i < files.length ; i++){
            try {
                reader = new BufferedReader(new FileReader(filePath+files[i].getName()));
                String line = reader.readLine();

                while (line != null) {
                    saveLineAsTeam(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    private void saveLineAsTeam(String line) {
        // Team(ArrayList<Champion> champions, HashMap<Synergies_SET2, Integer> synergies,int synergySize) {

        //split line -> champions -- Synergies -- hashValue
        String[] splitMinusMinus = line.split("--");
        String[] championNames = splitMinusMinus[0].split("-");
        String[] synergyNames = splitMinusMinus[1].split("-");

        //HANDLE CHAMPIONS
        //remove the gold at the end of the String -> (x)
        for(int i = 0 ; i <championNames.length;i++){
            championNames[i]= championNames[i].substring(0, championNames[i].length() - 3);
        }

        //create for every name a new Champion (just add it to team)
        ArrayList<Champion> team = new ArrayList<>();
        for(String s : championNames){
            for(Champion ch : allChampions){
                if(ch.getName().equals(s)){
                    team.add(ch);
                }
            }
        }

        //HANDLE SYNERGIES
        //create new HashMap for synergies + create synergyCounter
        int synergyCounter = 0;
        HashMap<Synergies_SET2, Integer> synergies = new HashMap<>();
        for(int i = 0 ; i <synergyNames.length;i++){
            String syn = synergyNames[i].substring(0,synergyNames[i].length()-3);
            // @todo @refactor this can cause error! but it shoulndt = unsave
            int value = Integer.parseInt(synergyNames[i].substring(synergyNames[i].length()-2,synergyNames[i].length()-1));
            synergyCounter+=value;
            for(Synergies_SET2 s : allSynergies){
                if(s.toString().equals(syn)){
                    synergies.put(s,value);
                    break;
                }
            }
        }

        allTeams.add(new Team(team,synergies,synergyCounter));
        }//end saveTeam

    public ArrayList<Team> getAllTeams() {
        return allTeams;
    }
}
