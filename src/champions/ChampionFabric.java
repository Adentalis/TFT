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

        championsDummy.add(new Champion("Aatrox", 3, new ArrayList<Origin>(Arrays.asList(Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Ahri", 2, new ArrayList<Origin>(Arrays.asList(Origin.WILD)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Akali", 4, new ArrayList<Origin>(Arrays.asList(Origin.NINJA)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Anivia", 5, new ArrayList<Origin>(Arrays.asList(Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.ELEMENTALIST))));
        championsDummy.add(new Champion("Ashe", 3, new ArrayList<Origin>(Arrays.asList(Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER))));
        championsDummy.add(new Champion("Aurelion Sol", 4, new ArrayList<Origin>(Arrays.asList(Origin.DRAGON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Blitzcrank", 2, new ArrayList<Origin>(Arrays.asList(Origin.ROBOT)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Brand", 4, new ArrayList<Origin>(Arrays.asList(Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.ELEMENTALIST))));
        championsDummy.add(new Champion("Braum", 2, new ArrayList<Origin>(Arrays.asList(Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUARDIAN))));
        championsDummy.add(new Champion("Camile", 1, new ArrayList<Origin>(Arrays.asList(Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Chogath", 4, new ArrayList<Origin>(Arrays.asList(Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Darius", 1, new ArrayList<Origin>(Arrays.asList(Origin.IMPERIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Draven", 4, new ArrayList<Origin>(Arrays.asList(Origin.IMPERIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Elise", 1, new ArrayList<Origin>(Arrays.asList(Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Evellyn", 3, new ArrayList<Origin>(Arrays.asList(Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Fiora", 1, new ArrayList<Origin>(Arrays.asList(Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Gangplank", 3, new ArrayList<Origin>(Arrays.asList(Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER,Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Garen", 1, new ArrayList<Origin>(Arrays.asList(Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Gnar", 4, new ArrayList<Origin>(Arrays.asList(Origin.WILD,Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Graves", 1,new ArrayList<Origin>(Arrays.asList(Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Jayce", 2, new ArrayList<Origin>(Arrays.asList(Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Jinx", 4, new ArrayList<Origin>(Arrays.asList(Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Kaisa", 5, new ArrayList<Origin>(Arrays.asList(Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER,Classes.ASSASIN))));
        championsDummy.add(new Champion("Karthus", 5, new ArrayList<Origin>(Arrays.asList(Origin.PHANTOM)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Kassadin", 1, new ArrayList<Origin>(Arrays.asList(Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Katarina", 3, new ArrayList<Origin>(Arrays.asList(Origin.IMPERIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Kayle", 5, new ArrayList<Origin>(Arrays.asList(Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Kennen", 3, new ArrayList<Origin>(Arrays.asList(Origin.NINJA,Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.ELEMENTALIST))));
        championsDummy.add(new Champion("Khazix", 1, new ArrayList<Origin>(Arrays.asList(Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Kindred", 4, new ArrayList<Origin>(Arrays.asList(Origin.PHANTOM)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER))));
        championsDummy.add(new Champion("Leona", 4, new ArrayList<Origin>(Arrays.asList(Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUARDIAN))));
        championsDummy.add(new Champion("Lissandra", 2, new ArrayList<Origin>(Arrays.asList(Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.ELEMENTALIST))));
        championsDummy.add(new Champion("Lucian", 2, new ArrayList<Origin>(Arrays.asList(Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Lulu", 2, new ArrayList<Origin>(Arrays.asList(Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Mordekaiser", 1, new ArrayList<Origin>(Arrays.asList(Origin.PHANTOM)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Morgana", 3, new ArrayList<Origin>(Arrays.asList(Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Nidalee", 1, new ArrayList<Origin>(Arrays.asList(Origin.WILD)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Pantheon", 5, new ArrayList<Origin>(Arrays.asList(Origin.DRAGON)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUARDIAN))));
        championsDummy.add(new Champion("Poppy", 3, new ArrayList<Origin>(Arrays.asList(Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Pyke", 2, new ArrayList<Origin>(Arrays.asList(Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("RekSai", 2, new ArrayList<Origin>(Arrays.asList(Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Rengar", 3, new ArrayList<Origin>(Arrays.asList(Origin.WILD)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Sejuani", 4, new ArrayList<Origin>(Arrays.asList(Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Shen", 2, new ArrayList<Origin>(Arrays.asList(Origin.NINJA)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Shyvana", 3, new ArrayList<Origin>(Arrays.asList(Origin.DRAGON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Swain", 5, new ArrayList<Origin>(Arrays.asList(Origin.IMPERIAL,Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Tristana", 1, new ArrayList<Origin>(Arrays.asList(Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Twisted Fate", 2, new ArrayList<Origin>(Arrays.asList(Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Varus", 2, new ArrayList<Origin>(Arrays.asList(Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER))));
        championsDummy.add(new Champion("Vayne", 1, new ArrayList<Origin>(Arrays.asList(Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER))));
        championsDummy.add(new Champion("Veigar", 3, new ArrayList<Origin>(Arrays.asList(Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("VI", 3, new ArrayList<Origin>(Arrays.asList(Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Volibear", 3,new ArrayList<Origin>(Arrays.asList(Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Warwick", 1, new ArrayList<Origin>(Arrays.asList(Origin.WILD)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
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
