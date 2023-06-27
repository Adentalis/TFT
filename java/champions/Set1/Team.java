package champions.Set1;


import java.util.*;

public class Team {
    Set<Champion> randomChampionSet = new HashSet<>();


    public Team(Set<Champion> randomChampionSet){
        this.randomChampionSet = randomChampionSet;
    }
    /*
    public int analyseChampionSet(Set<Champion> randomChampionSet, int NUMBER_OF_SYNERGIES) {
        //init synergies
        HashMap<Champion.Origin, Integer> originSynergies = synergizeOrigins(randomChampionSet);
        HashMap<Classes, Integer> classesSynergies = synergizeClasses(randomChampionSet);

        //remove all useless synergies (brawler(1))
        HashMap<Champion.Origin, Integer> filteredOriginCounter = filterOrigins(originSynergies);
        HashMap<Classes, Integer> filteredClassesCounter = filterClasses(classesSynergies);

        //count all synergies
        int matchCounter = countMatches(filteredOriginCounter, filteredClassesCounter);

        if (matchCounter >= NUMBER_OF_SYNERGIES) {
            saveResult(randomChampionSet, filteredOriginCounter, originSynergies, filteredClassesCounter, classesSynergies, matchCounter);
        }

        return matchCounter;
    }
*/
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

    private HashMap<Champion.Origin, Integer> synergizeOrigins(Set<Champion> randomChampionSet) {
        HashMap<Champion.Origin, Integer> originSynergies = new HashMap<>();
        for (Champion c : randomChampionSet) {
            for (Champion.Origin o : c.getOrigin()) {
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
/*
    private int countMatches(HashMap<Champion.Origin, Integer> filteredOriginCounter, HashMap<Classes, Integer> filteredClassesCounter) {

        int matchCounter = 0;
        for (Champion.Origin o : origins) {
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

    private void saveResult(Set<Champion> randomChampionSet, HashMap<Champion.Origin, Integer> filteredOriginCounter, HashMap<Champion.Origin, Integer> originCounter, HashMap<Classes, Integer> filteredClassesCounter, HashMap<Classes, Integer> classesCounter, int matchCounter) {

        List<Champion> championsSorted = getSortedChampionList(randomChampionSet);


        for (Champion ch : championsSorted) {
            System.out.print(ch.getName() + "(" + ch.getCost() + ") - ");
        }
        System.out.println();
        for (Champion.Origin o : origins) {
            if (filteredOriginCounter.get(o) != null)
                System.out.println(o.toString() + ":" + originCounter.get(o));
        }
        for (Classes c : classes) {
            if (filteredClassesCounter.get(c) != null)
                System.out.println(c.toString() + ":" + classesCounter.get(c));
        }
        System.out.println(matchCounter);
    }
*/
    private List<Champion> getSortedChampionList(Set<Champion> randomChampionSet) {
        List<Champion> championsSortedDummy = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            List<Champion> dummy = new ArrayList<>();
            for (Champion ch : randomChampionSet) {

                if (ch.getCost() == i)
                    dummy.add(ch);
            }

            Collections.sort(dummy, new Comparator<Champion>() {
                @Override
                public int compare(Champion o1, Champion o2) {
                    return o1.getName().compareTo(o2.getName()) ;
                }
            });

            championsSortedDummy.addAll(dummy);
        }
        return championsSortedDummy;

    }


    private HashMap<Champion.Origin, Integer> filterOrigins(HashMap<Champion.Origin, Integer> originCounter) {

        HashMap<Champion.Origin, Integer> filteredOriginCounter = new HashMap<>();

        if (originCounter.get(Champion.Origin.DEMON) != null) {
            if (originCounter.get(Champion.Origin.DEMON) == 2 || originCounter.get(Champion.Origin.DEMON) == 4 || originCounter.get(Champion.Origin.DEMON) == 6) {
                filteredOriginCounter.put(Champion.Origin.DEMON, originCounter.get(Champion.Origin.DEMON));
            }
        }

        if (originCounter.get(Champion.Origin.DRAGON) != null) {
            if (originCounter.get(Champion.Origin.DRAGON) >= 2) {
                filteredOriginCounter.put(Champion.Origin.DRAGON, originCounter.get(Champion.Origin.DRAGON));
            }
        }

        if (originCounter.get(Champion.Origin.EXILE) != null) {

            filteredOriginCounter.put(Champion.Origin.EXILE, 1);

        }

        if (originCounter.get(Champion.Origin.GLACIAL) != null) {
            if (originCounter.get(Champion.Origin.GLACIAL) == 2 || originCounter.get(Champion.Origin.GLACIAL) == 4 || originCounter.get(Champion.Origin.GLACIAL) == 6) {
                filteredOriginCounter.put(Champion.Origin.GLACIAL, originCounter.get(Champion.Origin.GLACIAL));
            }
        }

        if (originCounter.get(Champion.Origin.ROBOT) != null) {
            filteredOriginCounter.put(Champion.Origin.ROBOT, 1);
        }
        if (originCounter.get(Champion.Origin.HEXTECH) != null) {

            if (originCounter.get(Champion.Origin.HEXTECH) == 2 || originCounter.get(Champion.Origin.HEXTECH) == 4) {
                filteredOriginCounter.put(Champion.Origin.HEXTECH, originCounter.get(Champion.Origin.HEXTECH));
            }
        }
        if (originCounter.get(Champion.Origin.IMPERIAL) != null) {

            if (originCounter.get(Champion.Origin.IMPERIAL) == 2 || originCounter.get(Champion.Origin.IMPERIAL) == 4) {
                filteredOriginCounter.put(Champion.Origin.IMPERIAL, originCounter.get(Champion.Origin.IMPERIAL));
            }
        }
        if (originCounter.get(Champion.Origin.NOBLE) != null) {

            if (originCounter.get(Champion.Origin.NOBLE) == 3 || originCounter.get(Champion.Origin.NOBLE) == 6) {
                filteredOriginCounter.put(Champion.Origin.NOBLE, originCounter.get(Champion.Origin.NOBLE));
            }
        }

        if (originCounter.get(Champion.Origin.NINJA) != null) {

            if (originCounter.get(Champion.Origin.NINJA) == 1 || originCounter.get(Champion.Origin.NINJA) == 4) {
                filteredOriginCounter.put(Champion.Origin.NINJA, originCounter.get(Champion.Origin.NINJA));
            }
        }
        if (originCounter.get(Champion.Origin.PIRATE) != null) {

            if (originCounter.get(Champion.Origin.PIRATE) == 3) {
                filteredOriginCounter.put(Champion.Origin.PIRATE, originCounter.get(Champion.Origin.PIRATE));
            }
        }
        if (originCounter.get(Champion.Origin.PHANTOM) != null) {

            if (originCounter.get(Champion.Origin.PHANTOM) >= 2) {
                filteredOriginCounter.put(Champion.Origin.PHANTOM, originCounter.get(Champion.Origin.PHANTOM));
            }
        }
        if (originCounter.get(Champion.Origin.WILD) != null) {
            if (originCounter.get(Champion.Origin.WILD) == 2 || originCounter.get(Champion.Origin.WILD) == 4) {
                filteredOriginCounter.put(Champion.Origin.WILD, originCounter.get(Champion.Origin.WILD));
            }
        }

        if (originCounter.get(Champion.Origin.VOID) != null) {
            if (originCounter.get(Champion.Origin.VOID) == 2 || originCounter.get(Champion.Origin.VOID) == 4) {
                filteredOriginCounter.put(Champion.Origin.VOID, originCounter.get(Champion.Origin.VOID));
            }
        }
        if (originCounter.get(Champion.Origin.YORDLE) != null) {

            if (originCounter.get(Champion.Origin.YORDLE) == 3 || originCounter.get(Champion.Origin.YORDLE) == 6) {
                filteredOriginCounter.put(Champion.Origin.YORDLE, originCounter.get(Champion.Origin.YORDLE));
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
