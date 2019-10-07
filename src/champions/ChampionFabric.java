package champions;

import java.util.*;
import java.util.stream.Collectors;

public class ChampionFabric {
    private ArrayList<Champion> champions;
    private Set<Classes> classes;
    private Set<Origin> origins;


    public ChampionFabric() {
        champions = initChampionList();
        classes = initClasses();
        origins = initOrigins();
    }

    public ArrayList<Champion> getChampionList() {
        return champions;
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
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER, Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Garen", 1, new ArrayList<Origin>(Arrays.asList(Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Gnar", 4, new ArrayList<Origin>(Arrays.asList(Origin.WILD, Origin.YORDLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Graves", 1, new ArrayList<Origin>(Arrays.asList(Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        championsDummy.add(new Champion("Jayce", 2, new ArrayList<Origin>(Arrays.asList(Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.SHAPESHIFTER))));
        championsDummy.add(new Champion("Jinx", 4, new ArrayList<Origin>(Arrays.asList(Origin.HEXTECH)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
        // championsDummy.add(new Champion("Kaisa", 5, new ArrayList<Origin>(Arrays.asList(Origin.VOID)),
        //       new ArrayList<Classes>(Arrays.asList(Classes.RANGER, Classes.ASSASIN))));
        championsDummy.add(new Champion("Karthus", 5, new ArrayList<Origin>(Arrays.asList(Origin.PHANTOM)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Kassadin", 1, new ArrayList<Origin>(Arrays.asList(Origin.VOID)),
                new ArrayList<Classes>(Arrays.asList(Classes.SORCERER))));
        championsDummy.add(new Champion("Katarina", 3, new ArrayList<Origin>(Arrays.asList(Origin.IMPERIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));
        championsDummy.add(new Champion("Kayle", 5, new ArrayList<Origin>(Arrays.asList(Origin.NOBLE)),
                new ArrayList<Classes>(Arrays.asList(Classes.KNIGHT))));
        championsDummy.add(new Champion("Kennen", 3, new ArrayList<Origin>(Arrays.asList(Origin.NINJA, Origin.YORDLE)),
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
        championsDummy.add(new Champion("Miss Fortune", 5, new ArrayList<Origin>(Arrays.asList(Origin.PIRATE)),
                new ArrayList<Classes>(Arrays.asList(Classes.GUNSLINGER))));
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
        championsDummy.add(new Champion("Swain", 5, new ArrayList<Origin>(Arrays.asList(Origin.IMPERIAL, Origin.DEMON)),
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
        championsDummy.add(new Champion("Volibear", 3, new ArrayList<Origin>(Arrays.asList(Origin.GLACIAL)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Warwick", 1, new ArrayList<Origin>(Arrays.asList(Origin.WILD)),
                new ArrayList<Classes>(Arrays.asList(Classes.BRAWLER))));
        championsDummy.add(new Champion("Yasou", 5, new ArrayList<Origin>(Arrays.asList(Origin.EXILE)),
                new ArrayList<Classes>(Arrays.asList(Classes.BLADEMASTER))));
        championsDummy.add(new Champion("Zed", 2, new ArrayList<Origin>(Arrays.asList(Origin.NINJA)),
                new ArrayList<Classes>(Arrays.asList(Classes.ASSASIN))));

        return championsDummy;
    }

    private Set<Classes> initClasses() {
        return champions.stream().flatMap(c -> c.getClas().stream()).collect(Collectors.toSet());
    }

    private Set<Origin> initOrigins() {
        return champions.stream().flatMap(c -> c.getOrigin().stream()).collect(Collectors.toSet());
    }

    public void printOrigins() {
        System.out.println("\n--ORIGINS--");
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

    public void printChampions() {
        for (Champion c : champions) {
            System.out.println(c.toString() + "\n");
        }
    }

    public int analyseChampionSet(Set<Champion> randomChampionSet,int NUMBER_OF_SYNERGIES) {
        //init synergies
        HashMap<Origin, Integer> originSynergies = synergizeOrigins(randomChampionSet);
        HashMap<Classes, Integer> classesSynergies = synergizeClasses(randomChampionSet);

        //remove all useless synergies (brawler(1))
        HashMap<Origin, Integer> filteredOriginCounter = filterOrigins(originSynergies);
        HashMap<Classes, Integer> filteredClassesCounter = filterClasses(classesSynergies);

        //count all synergies
        int matchCounter = countMatches(filteredOriginCounter,filteredClassesCounter);

        if (matchCounter >= NUMBER_OF_SYNERGIES) {
            printResult(randomChampionSet,filteredOriginCounter,originSynergies,filteredClassesCounter,classesSynergies,matchCounter);
        }

        return matchCounter;
    }

    private HashMap<Classes, Integer> synergizeClasses(Set<Champion> randomChampionSet) {
        HashMap<Classes, Integer> classesSynergies = new HashMap<>();
        for (Champion c : randomChampionSet) {
            for (Classes cl : c.getClas()) {
                if (classesSynergies.get(cl) != null) {
                    int counter = classesSynergies.get(cl);
                    classesSynergies.put(cl, counter + 1);
                } else {
                    classesSynergies.put(cl, 1);
                }
            }
        }
        return classesSynergies;
    }

    private HashMap<Origin, Integer> synergizeOrigins(Set<Champion> randomChampionSet) {
        HashMap<Origin, Integer> originSynergies = new HashMap<>();
        for (Champion c : randomChampionSet) {
            for (Origin o : c.getOrigin()) {
                if (originSynergies.get(o) != null) {
                    int counter = originSynergies.get(o);
                    originSynergies.put(o, counter + 1);
                } else {
                    originSynergies.put(o, 1);
                }
            }

        }
        return originSynergies;
    }

    private int countMatches(HashMap<Origin, Integer> filteredOriginCounter, HashMap<Classes, Integer> filteredClassesCounter) {

        int matchCounter = 0;
        for (Origin o : origins) {
            if (filteredOriginCounter.get(o) != null) {
                matchCounter += filteredOriginCounter.get(o);
            }
        }
        for (Classes c : classes) {
            if (filteredClassesCounter.get(c) != null) {
                matchCounter += filteredClassesCounter.get(c);
            }
        }
        return matchCounter;
    }

    private void printResult(Set<Champion> randomChampionSet, HashMap<Origin, Integer> filteredOriginCounter, HashMap<Origin, Integer> originCounter, HashMap<Classes, Integer> filteredClassesCounter, HashMap<Classes, Integer> classesCounter, int matchCounter) {
        for (Champion ch : randomChampionSet) {
            System.out.print(ch.getName() + "(" + ch.getCost() + ") - ");
        }
        System.out.println();

        for (Origin o : origins) {
            if (filteredOriginCounter.get(o) != null)
                System.out.println(o.toString() + ":" + originCounter.get(o));
        }

        for (Classes c : classes) {
            if (filteredClassesCounter.get(c) != null)
                System.out.println(c.toString() + ":" + classesCounter.get(c));
        }

        System.out.println(matchCounter);
    }

    private HashMap<Origin, Integer> filterOrigins(HashMap<Origin, Integer> originCounter) {

        HashMap<Origin, Integer> filteredOriginCounter = new HashMap<>();

        //test code
        if (originCounter.get(Origin.DEMON) != null) {
            if (originCounter.get(Origin.DEMON) == 2 || originCounter.get(Origin.DEMON) == 4 || originCounter.get(Origin.DEMON) == 6) {
                filteredOriginCounter.put(Origin.DEMON, originCounter.get(Origin.DEMON));
            }
        }

        if (originCounter.get(Origin.DRAGON) != null) {
            if (originCounter.get(Origin.DRAGON) >= 2) {
                filteredOriginCounter.put(Origin.DRAGON, originCounter.get(Origin.DRAGON));
            }
        }

        if (originCounter.get(Origin.EXILE) != null) {

            filteredOriginCounter.put(Origin.EXILE, 1);

        }

        if (originCounter.get(Origin.GLACIAL) != null) {
            if (originCounter.get(Origin.GLACIAL) == 2 || originCounter.get(Origin.GLACIAL) == 4 || originCounter.get(Origin.GLACIAL) == 6) {
                filteredOriginCounter.put(Origin.GLACIAL, originCounter.get(Origin.GLACIAL));
            }
        }

        if (originCounter.get(Origin.ROBOT) != null) {
            filteredOriginCounter.put(Origin.ROBOT, 1);
        }
        if (originCounter.get(Origin.HEXTECH) != null) {

            if (originCounter.get(Origin.HEXTECH) == 2 || originCounter.get(Origin.HEXTECH) == 4) {
                filteredOriginCounter.put(Origin.HEXTECH, originCounter.get(Origin.HEXTECH));
            }
        }
        if (originCounter.get(Origin.IMPERIAL) != null) {

            if (originCounter.get(Origin.IMPERIAL) == 2 || originCounter.get(Origin.IMPERIAL) == 4) {
                filteredOriginCounter.put(Origin.IMPERIAL, originCounter.get(Origin.IMPERIAL));
            }
        }
        if (originCounter.get(Origin.NOBLE) != null) {

            if (originCounter.get(Origin.NOBLE) == 3 || originCounter.get(Origin.NOBLE) == 6) {
                filteredOriginCounter.put(Origin.NOBLE, originCounter.get(Origin.NOBLE));
            }
        }

        if (originCounter.get(Origin.NINJA) != null) {

            if (originCounter.get(Origin.NINJA) == 1 || originCounter.get(Origin.NINJA) == 4) {
                filteredOriginCounter.put(Origin.NINJA, originCounter.get(Origin.NINJA));
            }
        }
        if (originCounter.get(Origin.PIRATE) != null) {

            if (originCounter.get(Origin.PIRATE) == 3) {
                filteredOriginCounter.put(Origin.PIRATE, originCounter.get(Origin.PIRATE));
            }
        }
        if (originCounter.get(Origin.PHANTOM) != null) {

            if (originCounter.get(Origin.PHANTOM) >= 2) {
                filteredOriginCounter.put(Origin.PHANTOM, originCounter.get(Origin.PHANTOM));
            }
        }
        if (originCounter.get(Origin.WILD) != null) {
            if (originCounter.get(Origin.WILD) == 2||originCounter.get(Origin.WILD) == 4) {
                filteredOriginCounter.put(Origin.WILD, originCounter.get(Origin.WILD));
            }
        }

        if (originCounter.get(Origin.VOID) != null) {
            if (originCounter.get(Origin.VOID) == 2||originCounter.get(Origin.VOID) == 4) {
                filteredOriginCounter.put(Origin.VOID, originCounter.get(Origin.VOID));
            }
        }
        if (originCounter.get(Origin.YORDLE) != null) {

            if (originCounter.get(Origin.YORDLE) == 3 || originCounter.get(Origin.YORDLE) == 6) {
                filteredOriginCounter.put(Origin.YORDLE, originCounter.get(Origin.YORDLE));
            }
        }

        return filteredOriginCounter;
    }

    private HashMap<Classes, Integer> filterClasses(HashMap<Classes, Integer> classesCounter) {

        HashMap<Classes, Integer> filteredClassesCounter = new HashMap<>();

        if (classesCounter.get(Classes.ASSASIN) != null) {
            if (classesCounter.get(Classes.ASSASIN) == 3 || classesCounter.get(Classes.ASSASIN) == 6) {
                filteredClassesCounter.put(Classes.ASSASIN, classesCounter.get(Classes.ASSASIN));
            }
        }

        if (classesCounter.get(Classes.BLADEMASTER) != null) {
            if (classesCounter.get(Classes.BLADEMASTER) == 3 || classesCounter.get(Classes.BLADEMASTER) >= 6) {
                filteredClassesCounter.put(Classes.BLADEMASTER, classesCounter.get(Classes.BLADEMASTER));
            }
        }

        if (classesCounter.get(Classes.BRAWLER) != null) {
            if (classesCounter.get(Classes.BRAWLER) == 2 || classesCounter.get(Classes.BRAWLER) == 4 || classesCounter.get(Classes.BRAWLER) == 6) {
                filteredClassesCounter.put(Classes.BRAWLER, classesCounter.get(Classes.BRAWLER));
            }
        }

        if (classesCounter.get(Classes.ELEMENTALIST) != null) {
            if (classesCounter.get(Classes.ELEMENTALIST) == 3) {
                filteredClassesCounter.put(Classes.ELEMENTALIST, classesCounter.get(Classes.ELEMENTALIST));
            }
        }


        if (classesCounter.get(Classes.GUARDIAN) != null) {
            if (classesCounter.get(Classes.GUARDIAN) >= 2) {
                filteredClassesCounter.put(Classes.GUARDIAN, classesCounter.get(Classes.GUARDIAN));
            }
        }
        if (classesCounter.get(Classes.GUNSLINGER) != null) {
            if (classesCounter.get(Classes.GUNSLINGER) == 2 || classesCounter.get(Classes.GUNSLINGER) == 4 || classesCounter.get(Classes.GUNSLINGER) == 6) {
                filteredClassesCounter.put(Classes.GUNSLINGER, classesCounter.get(Classes.GUNSLINGER));
            }
        }
        if (classesCounter.get(Classes.KNIGHT) != null) {

            if (classesCounter.get(Classes.KNIGHT) == 2 || classesCounter.get(Classes.KNIGHT) == 4 || classesCounter.get(Classes.KNIGHT) == 6) {
                filteredClassesCounter.put(Classes.KNIGHT, classesCounter.get(Classes.KNIGHT));
            }
        }

        if (classesCounter.get(Classes.RANGER) != null) {

            if (classesCounter.get(Classes.RANGER) == 2 || classesCounter.get(Classes.RANGER) == 4) {
                filteredClassesCounter.put(Classes.RANGER, classesCounter.get(Classes.RANGER));
            }
        }
        if (classesCounter.get(Classes.SHAPESHIFTER) != null) {
            if (classesCounter.get(Classes.SHAPESHIFTER) == 3 || classesCounter.get(Classes.SHAPESHIFTER) == 6) {
                filteredClassesCounter.put(Classes.SHAPESHIFTER, classesCounter.get(Classes.SHAPESHIFTER));
            }
        }
        if (classesCounter.get(Classes.SORCERER) != null) {
            if (classesCounter.get(Classes.SORCERER) == 3 || classesCounter.get(Classes.SORCERER) == 6) {
                filteredClassesCounter.put(Classes.SORCERER, classesCounter.get(Classes.SORCERER));
            }
        }

        return filteredClassesCounter;
    }
}
