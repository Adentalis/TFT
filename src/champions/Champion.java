package champions;

import java.util.List;

public class Champion {

    private String name;
    private List<Classes> classes;
    private List<Origin> origin;
    private int cost;


    public Champion(String name,int cost,List<Origin> origin, List<Classes> classes) {
        this.name = name;
        this.classes = classes;
        this.origin = origin;
        this.cost = cost;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Origin> getOrigin() {
        return origin;
    }

    public void setOrigin(List<Origin> origin) {
        this.origin = origin;
    }

    public List<Classes> getClas() {
        return classes;
    }

    public void setClas(List<Classes> classes) {
        this.classes = classes;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isOrigin(Origin o){
        //TODO
        return true;
    }

    public boolean isClas(Classes c){
        //TODO
        return true;
    }

    public String toString(){
        return "name:\t"+ name+
                "\norigin:\t" +getStringOrigins()+
                "\nclasses:" +getStringClasses()+
                "\ncost:\t" +cost+"\n"
                ;
    }

    private String getStringClasses() {
        String string ="";
        for (Classes c :classes){
            string+= c+"\t";
        }
        return string;
    }

    private String getStringOrigins() {
        String string ="";
        for (Origin o :origin){
            string+= o+"\t";
        }
        return string;
    }


}
