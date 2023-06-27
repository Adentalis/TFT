package champions.Set2;


import java.io.Serializable;
import java.util.List;

/*
    This class is all about A CHAMPION ITSELF

 */

public class Champion implements Serializable {

    private String name;
    private List<Synergies_SET2> synergies;
    private int cost;


    public Champion(String name, int cost, List<Synergies_SET2> synergies) {
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
        String string ="";
        for (Synergies_SET2 s :synergies){
            string+= s+"\t";
        }

        return "name:\t"+ name+
                "\nsynergies:" +string+
                "\ncost:\t" +cost+"\n"
                ;
    }


}
