package champions;

import java.util.*;

public class ChampionFabric {
    private ArrayList<Champion> champions;
    private Set<Classes> classes;
    private Set<Origin> origins;


    public ChampionFabric() {
        champions = initChampionList();
        classes = initClasses();
        origins= initOrigins();
    }

    public ArrayList<Champion> getChampionList() {
        return champions;
    }


    public void printOrigins() {
        System.out.println("--ORIGINS--");
        for (Origin o : this.origins) {
            System.out.println("\n-- " + o + "--");
            for (Champion c : champions) {
                if (c.isOrigin(o)) {
                    System.out.print(c.getName() + " | ");

                }
            }
        }
    }


    public void printClasses() {
        System.out.println("--ORIGINS--");
        for (Classes cl : this.classes) {
            System.out.println("\n-- " + cl + "--");
            for (Champion c : champions) {
                if (c.isClas(cl)) {
                    System.out.print(c.getName() + " | ");
                }
            }
        }
    }


    private Set<Classes> initClasses() {
        Set<Classes> classesDummy = new HashSet<>();
        for (Champion c : champions) {
       //     classesDummy.add(c.getClas());
        }
        return classesDummy;
    }

    private Set<Origin> initOrigins() {
        Set<Origin> originsDummy = new HashSet<>();
        for (Champion c : champions) {
     //       originsDummy.add(c.getOrigin());
        }
        return originsDummy;
    }

    private ArrayList<Champion> initChampionList() {
        ArrayList<Champion> championsDummy = new ArrayList<>();
        /*
        championsDummy.add(new Champion("Aatrox", 3, Origin.DEMON, Classes.BLADEMASTER));
        championsDummy.add(new Champion("Ahri", 2, Origin.WILD, Classes.SORCERER));
        championsDummy.add(new Champion("Akali", 4, Origin.NINJA, Classes.ASSASIN));
        championsDummy.add(new Champion("Anivia", 5, Origin.GLACIAL, Classes.ELEMENTALIST));
        championsDummy.add(new Champion("Ashe", 3, Origin.GLACIAL, Classes.RANGER));
        championsDummy.add(new Champion("Aurelion Sol", 4, Origin.DRAGON, Classes.SORCERER));
        championsDummy.add(new Champion("Blitzcrank", 3, Origin.ROBOT, Classes.BRAWLER));
        championsDummy.add(new Champion("Brand", 3, Origin.DEMON, Classes.ELEMENTALIST));
        championsDummy.add(new Champion("Braum", 3, Origin.GLACIAL, Classes.GUARDIAN));
        championsDummy.add(new Champion("Camile", 3, Origin.HEXTECH, Classes.BLADEMASTER));
        championsDummy.add(new Champion("Chogath", 3, Origin.VOID, Classes.BRAWLER));
        championsDummy.add(new Champion("Darius", 3, Origin.IMPERIAL, Classes.KNIGHT));
        championsDummy.add(new Champion("Draven", 3, Origin.IMPERIAL, Classes.BLADEMASTER));
        championsDummy.add(new Champion("Elise", 3, Origin.DEMON, Classes.SHAPESHIFTER));
        championsDummy.add(new Champion("Evellyn", 3, Origin.DEMON, Classes.ASSASIN));
        championsDummy.add(new Champion("Fiora", 3, Origin.NOBLE, Classes.BLADEMASTER));
        championsDummy.add(new Champion("Gangplank", 3, Origin.PIRATE, Classes.BLADEMASTER)); //ADD
        championsDummy.add(new Champion("Garen", 3, Origin.NOBLE, Classes.KNIGHT));
        championsDummy.add(new Champion("Gnar", 3, Origin.WILD, Classes.SHAPESHIFTER));//ADD
        championsDummy.add(new Champion("Graves", 3, Origin.PIRATE, Classes.GUNSLINGER));
        championsDummy.add(new Champion("Jayce", 3, Origin.HEXTECH, Classes.SHAPESHIFTER));
        championsDummy.add(new Champion("Jinx", 3, Origin.HEXTECH, Classes.GUNSLINGER));
        championsDummy.add(new Champion("Kaisa", 3, Origin.VOID, Classes.RANGER)); //add
        championsDummy.add(new Champion("Karthus", 3, Origin.PHANTOM, Classes.SORCERER));
        championsDummy.add(new Champion("Kassadin", 3, Origin.VOID, Classes.SORCERER));
        championsDummy.add(new Champion("Katarina", 3, Origin.IMPERIAL, Classes.ASSASIN));
        championsDummy.add(new Champion("Kayle", 3, Origin.NOBLE, Classes.KNIGHT));
        championsDummy.add(new Champion("Kennen", 3, Origin.NINJA, Classes.ELEMENTALIST));
        championsDummy.add(new Champion("Khazix", 3, Origin.VOID, Classes.ASSASIN));
        championsDummy.add(new Champion("Kindred", 3, Origin.PHANTOM, Classes.RANGER));
        championsDummy.add(new Champion("Leona", 3, Origin.NOBLE, Classes.GUARDIAN));
        championsDummy.add(new Champion("Lissandra", 3, Origin.GLACIAL, Classes.ELEMENTALIST));
        championsDummy.add(new Champion("Lucian", 3, Origin.NOBLE, Classes.GUNSLINGER));
        championsDummy.add(new Champion("Lulu", 3, Origin.YORDLE, Classes.SORCERER));
        championsDummy.add(new Champion("Mordekaiser", 3, Origin.PHANTOM, Classes.KNIGHT));
        championsDummy.add(new Champion("Morgana", 3, Origin.DEMON, Classes.SORCERER));
        championsDummy.add(new Champion("Nidalee", 3, Origin.WILD, Classes.SHAPESHIFTER));
        championsDummy.add(new Champion("Pantheon", 3, Origin.DRAGON, Classes.GUARDIAN));
        championsDummy.add(new Champion("Poppy", 3, Origin.YORDLE, Classes.KNIGHT));
        championsDummy.add(new Champion("Pyke", 3, Origin.PIRATE, Classes.ASSASIN));
        championsDummy.add(new Champion("RekSai", 3, Origin.VOID, Classes.BRAWLER));
        championsDummy.add(new Champion("Rengar", 3, Origin.WILD, Classes.ASSASIN));
        championsDummy.add(new Champion("Sejuani", 3, Origin.GLACIAL, Classes.KNIGHT));
        championsDummy.add(new Champion("Shen", 3, Origin.NINJA, Classes.BLADEMASTER));
        championsDummy.add(new Champion("Shyvana", 3, Origin.DRAGON, Classes.SHAPESHIFTER));
        championsDummy.add(new Champion("Swain", 3, Origin.IMPERIAL, Classes.SHAPESHIFTER));//ADD
        championsDummy.add(new Champion("Tristana", 3, Origin.YORDLE, Classes.GUNSLINGER));
        championsDummy.add(new Champion("Twisted Fate", 3, Origin.PIRATE, Classes.SORCERER));
        championsDummy.add(new Champion("Varus", 3, Origin.DEMON, Classes.RANGER));
        championsDummy.add(new Champion("Vayne", 3, Origin.NOBLE, Classes.RANGER));
        championsDummy.add(new Champion("Veigar", 3, Origin.YORDLE, Classes.SORCERER));
        championsDummy.add(new Champion("VI", 3, Origin.HEXTECH, Classes.BRAWLER));
        championsDummy.add(new Champion("Volibear", 3, Origin.GLACIAL, Classes.BRAWLER));
        championsDummy.add(new Champion("Warwick", 3, Origin.WILD, Classes.BRAWLER));
        championsDummy.add(new Champion("Yasou", 3, Origin.EXILE, Classes.BLADEMASTER));
*/
        championsDummy.add(new Champion("Yasou", 5, new ArrayList<Origin>(Arrays.asList(Origin.EXILE)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));


   //     championsDummy.add(x);
        return championsDummy;
    }

    public void printChampions() {
        for(Champion c : champions){
            System.out.println(c.toString()+"\n");
        }
    }
}
