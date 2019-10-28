package champions.Set1;

import java.util.*;
import java.util.stream.Collectors;

public class ChampionFabric_SET1 {
    private ArrayList<Champion> champions;
    private Set<Classes> classes;
    private Set<Champion.Origin> origins;


    public ChampionFabric_SET1() {
        champions = initChampionList();
        classes = initClasses();
        origins = initOrigins();
    }

    public ArrayList<Champion> getChampionList() {
        return champions;
    }

    private ArrayList<Champion> initChampionList() {
        ArrayList<Champion> championsDummy = new ArrayList<>();

        championsDummy.add(new Champion("Aatrox", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Ahri", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.WILD)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Akali", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NINJA)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Anivia", 5, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.ELEMENTALIST))));
        championsDummy.add(new Champion("Ashe", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER))));
        championsDummy.add(new Champion("Aurelion Sol", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.DRAGON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Blitzcrank", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.ROBOT)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Brand", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.ELEMENTALIST))));
        championsDummy.add(new Champion("Braum", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUARDIAN))));
        championsDummy.add(new Champion("Camile", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Chogath", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Darius", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.IMPERIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Draven", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.IMPERIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Elise", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Evellyn", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Fiora", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Gangplank", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER, Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Garen", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Gnar", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.WILD, Champion.Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Graves", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Jayce", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Jinx", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Kaisa", 5, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER, Classes.ASSASIN))));
        championsDummy.add(new Champion("Karthus", 5, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.PHANTOM)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Kassadin", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Katarina", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.IMPERIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Kayle", 5, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Kennen", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NINJA, Champion.Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.ELEMENTALIST))));
        championsDummy.add(new Champion("Khazix", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Kindred", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.PHANTOM)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER))));
        championsDummy.add(new Champion("Leona", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUARDIAN))));
        championsDummy.add(new Champion("Lissandra", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.ELEMENTALIST))));
        championsDummy.add(new Champion("Lucian", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Lulu", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Miss Fortune", 5, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Mordekaiser", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.PHANTOM)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Morgana", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Nidalee", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.WILD)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Pantheon", 5, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.DRAGON)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUARDIAN))));
        championsDummy.add(new Champion("Poppy", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Pyke", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("RekSai", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Rengar", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.WILD)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Sejuani", 4, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Shen", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NINJA)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Shyvana", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.DRAGON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Swain", 5, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.IMPERIAL, Champion.Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Tristana", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Twisted Fate", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Varus", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.DEMON)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER))));
        championsDummy.add(new Champion("Vayne", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.RANGER))));
        championsDummy.add(new Champion("Veigar", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("VI", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Volibear", 3, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Warwick", 1, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.WILD)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Yasou", 5, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.EXILE)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Zed", 2, new ArrayList<Champion.Origin>(Arrays.asList(Champion.Origin.NINJA)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));

        return championsDummy;
    }

    private Set<Classes> initClasses() {
        return champions.stream().flatMap(c -> c.getClas().stream()).collect(Collectors.toSet());
    }

    private Set<Champion.Origin> initOrigins() {
        return champions.stream().flatMap(c -> c.getOrigin().stream()).collect(Collectors.toSet());
    }



    public void printAllOrigins() {
        System.out.println("\n--ORIGINS--");
        for (Champion.Origin o : this.origins) {
            System.out.println("\n-- " + o + "--");
            for (Champion c : champions) {
                if (c.isOrigin(o)) {
                    System.out.print(c.getName() + " | ");
                }
            }
        }
    }

    public void printAllClasses() {
        System.out.println("\n--CLASSES--");
        for (Classes cl : this.classes) {
            System.out.println("\n-- " + cl + "--");
            for (Champion c : champions) {
                if (c.isClasses(cl)) {
                    System.out.print(c.getName() + " | ");
                }
            }
        }
    }

    public void printAllChampions() {
        for (Champion c : champions) {
            System.out.println(c.toString() + "\n");
        }
    }
}
