package champions;

import java.util.List;

public class ChampionSyn {

    private String name;
    private List<Synergies_SET2> synergies;
    private int cost;


    public ChampionSyn(String name,int cost,List<Synergies_SET2> synergies) {
        this.name = name;
        this.synergies = synergies;
        this.cost = cost;

    }

    public String getName() {
        return name;
    }

    public List<Synergies_SET2> getSynergies() {
        return synergies;
    }

    public int getCost() {
        return cost;
    }


    public boolean isOrigin(Synergies_SET2 synergy){
        for(Synergies_SET2 s : this.synergies){
            if(s.equals(synergy))
                return true;
        }
        return false;
    }


    public String toString(){
        return "name:\t"+ name+
                "\nsynergies:" +getStringSynergies()+
                "\ncost:\t" +cost+"\n"
                ;
    }

    private String getStringSynergies() {
        String string ="";
        for (Synergies_SET2 s :synergies){
            string+= s+"\t";
        }
        return string;
    }

}
