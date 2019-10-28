package champions;

import java.util.*;

public class Team {
    Set<Champion> randomChampionSet = new HashSet<>();


    public Team(Set<Champion> randomChampionSet){
        this.randomChampionSet = randomChampionSet;
    }
    public int analyseChampionSet(Set<Champion> randomChampionSet, int NUMBER_OF_SYNERGIES) {
        //init synergies
        HashMap<Origin, Integer> originSynergies = synergizeOrigins(randomChampionSet);
        HashMap<Classes, Integer> classesSynergies = synergizeClasses(randomChampionSet);

        //remove all useless synergies (brawler(1))
        HashMap<Origin, Integer> filteredOriginCounter = filterOrigins(originSynergies);
        HashMap<Classes, Integer> filteredClassesCounter = filterClasses(classesSynergies);

        //count all synergies
        int matchCounter = countMatches(filteredOriginCounter, filteredClassesCounter);

        if (matchCounter >= NUMBER_OF_SYNERGIES) {
            saveResult(randomChampionSet, filteredOriginCounter, originSynergies, filteredClassesCounter, classesSynergies, matchCounter);
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

    private void saveResult(Set<Champion> randomChampionSet, HashMap<Origin, Integer> filteredOriginCounter, HashMap<Origin, Integer> originCounter, HashMap<Classes, Integer> filteredClassesCounter, HashMap<Classes, Integer> classesCounter, int matchCounter) {

        List<Champion> championsSorted = getSortedChampionList(randomChampionSet);


        for (Champion ch : championsSorted) {
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


    private HashMap<Origin, Integer> filterOrigins(HashMap<Origin, Integer> originCounter) {

        HashMap<Origin, Integer> filteredOriginCounter = new HashMap<>();

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
            if (originCounter.get(Origin.WILD) == 2 || originCounter.get(Origin.WILD) == 4) {
                filteredOriginCounter.put(Origin.WILD, originCounter.get(Origin.WILD));
            }
        }

        if (originCounter.get(Origin.VOID) != null) {
            if (originCounter.get(Origin.VOID) == 2 || originCounter.get(Origin.VOID) == 4) {
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
