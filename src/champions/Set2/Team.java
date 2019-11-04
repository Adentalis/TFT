package champions.Set2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Team implements Serializable {

    private ArrayList<Champion> champions;
    private HashMap<Synergies_SET2, Integer> synergies;
    private final int teamSize;
    private final int synergySize;



    public Team(ArrayList<Champion> champions, HashMap<Synergies_SET2, Integer> synergies,int synergySize) {
        this.champions = champions;
        this.synergies = synergies;
        this.teamSize =champions.size();
        this.synergySize = synergySize;
    }

    public boolean hasChampion(Champion c){
        for(Champion ch :champions){
            if(ch.getName().equals(c.getName()))
                return true;
        }
        return false;
    }

    public boolean hasSynergy(Synergies_SET2 s ,int v){
        if(synergies.get(s)!= null)
        return true;

        return false;
    }

    public boolean hasGoldUnit(int v){
        return true;
    }



    @Override
    public String toString() {
        String res = "";
        for (Champion c : champions) {
            res += c.getName() + "(" + c.getCost() + ")-";
        }
        for (Synergies_SET2 s : synergies.keySet()) {
            res += ("-" + s + "(" + synergies.get(s) + ")");
        }

        return  res;
    }


}
