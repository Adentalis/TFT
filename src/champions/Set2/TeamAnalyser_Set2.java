package champions.Set2;

import champions.Set2.Synergies_SET2;
import champions.Set2.Champion;

import java.util.*;

public class TeamAnalyser_Set2 {

    public TeamAnalyser_Set2() {
    }

    public int analyseChampionSet(Set<Champion> randomChampionSet, int NUMBER_OF_SYNERGIES) {
        //init synergies
        HashMap<Synergies_SET2, Integer> synergiesAll = synergizeOrigins(randomChampionSet);

        //remove all useless synergies - mages(1)
        HashMap<Synergies_SET2, Integer> synergiesFiltered = filterSynergies(synergiesAll);

        //count all viable synergies
        int matchCounter = countMatches(synergiesFiltered);

        if (matchCounter >= NUMBER_OF_SYNERGIES) {
            saveResult(randomChampionSet, synergiesFiltered, matchCounter);
        }

        return matchCounter;
    }

    private void saveResult(Set<Champion> randomChampionSet, HashMap<Synergies_SET2, Integer> synergiesFiltered, int matchCounter) {
        List<Champion> championsSorted = getSortedChampionList(randomChampionSet);

        for (Champion c : championsSorted) {
            System.out.print(c.getName() + "(" + c.getCost() + ") - ");
        }
        System.out.println();

        for (Synergies_SET2 s : synergiesFiltered.keySet()) {
            System.out.println(s+"("+synergiesFiltered.get(s)+")");
        }
        System.out.println(matchCounter);

    }

    private int countMatches(HashMap<Synergies_SET2, Integer> synergiesFiltered) {
        int counter = 0;
        for (Synergies_SET2 s : synergiesFiltered.keySet()) {
            counter += synergiesFiltered.get(s);
        }
        return counter;
    }

    private HashMap<Synergies_SET2, Integer> synergizeOrigins(Set<Champion> randomChampionSet) {
        //create a new Hashmap and count all synergies of the Team
        HashMap<Synergies_SET2, Integer> classesSynergies = new HashMap<>();

        for (Champion c : randomChampionSet) {
            for (Synergies_SET2 s : c.getSynergies()) {
                if (classesSynergies.get(s) != null) {
                    int counter = classesSynergies.get(s);
                    classesSynergies.put(s, counter + 1);
                } else {
                    classesSynergies.put(s, 1);
                }
            }
        }
        return classesSynergies;
    }

    private HashMap<Synergies_SET2, Integer> filterSynergies(HashMap<Synergies_SET2, Integer> synergiesAll) {
        HashMap<Synergies_SET2, Integer> res = new HashMap<>();

        if (synergiesAll.get(Synergies_SET2.ALCHEMIST) != null) {
            res.put(Synergies_SET2.ALCHEMIST, 1);
        }

        if (synergiesAll.get(Synergies_SET2.ASSASSIN) != null) {
            if (synergiesAll.get(Synergies_SET2.ASSASSIN) == 3 || synergiesAll.get(Synergies_SET2.ASSASSIN) == 6)
                res.put(Synergies_SET2.ASSASSIN, synergiesAll.get(Synergies_SET2.ASSASSIN));
        }

        if (synergiesAll.get(Synergies_SET2.AVATAR) != null) {
            res.put(Synergies_SET2.AVATAR, 1);
        }

        if (synergiesAll.get(Synergies_SET2.BERSERKER) != null) {
            if (synergiesAll.get(Synergies_SET2.BERSERKER) == 3 || synergiesAll.get(Synergies_SET2.BERSERKER) == 6)
                res.put(Synergies_SET2.BERSERKER, synergiesAll.get(Synergies_SET2.BERSERKER));
        }

        if (synergiesAll.get(Synergies_SET2.BLADEMASTER) != null) {
            if (synergiesAll.get(Synergies_SET2.BLADEMASTER) == 2 || synergiesAll.get(Synergies_SET2.BLADEMASTER) == 4 || synergiesAll.get(Synergies_SET2.BLADEMASTER) == 6)
                res.put(Synergies_SET2.BLADEMASTER, synergiesAll.get(Synergies_SET2.BLADEMASTER));
        }

        if (synergiesAll.get(Synergies_SET2.CLOUD) != null) {
            if (synergiesAll.get(Synergies_SET2.CLOUD) == 2 || synergiesAll.get(Synergies_SET2.CLOUD) == 3 || synergiesAll.get(Synergies_SET2.CLOUD) == 4)
                res.put(Synergies_SET2.CLOUD, synergiesAll.get(Synergies_SET2.CLOUD));
        }

        if (synergiesAll.get(Synergies_SET2.CRYSTAL) != null) {
            if (synergiesAll.get(Synergies_SET2.CRYSTAL) == 2 || synergiesAll.get(Synergies_SET2.CRYSTAL) == 4)
                res.put(Synergies_SET2.CRYSTAL, synergiesAll.get(Synergies_SET2.CRYSTAL));
        }

        if (synergiesAll.get(Synergies_SET2.DESERT) != null) {
            if (synergiesAll.get(Synergies_SET2.DESERT) == 2 || synergiesAll.get(Synergies_SET2.DESERT) == 4)
                res.put(Synergies_SET2.DESERT, synergiesAll.get(Synergies_SET2.DESERT));
        }

        if (synergiesAll.get(Synergies_SET2.DRUID) != null) {
            if (synergiesAll.get(Synergies_SET2.DRUID) == 2)
                res.put(Synergies_SET2.DRUID, synergiesAll.get(Synergies_SET2.DRUID));
        }

        if (synergiesAll.get(Synergies_SET2.ELECTRIC) != null) {
            if (synergiesAll.get(Synergies_SET2.ELECTRIC) == 2 || synergiesAll.get(Synergies_SET2.ELECTRIC) == 3 || synergiesAll.get(Synergies_SET2.ELECTRIC) == 4)
                res.put(Synergies_SET2.ELECTRIC, synergiesAll.get(Synergies_SET2.ELECTRIC));
        }

        if (synergiesAll.get(Synergies_SET2.GLACIAL) != null) {
            if (synergiesAll.get(Synergies_SET2.GLACIAL) == 2 || synergiesAll.get(Synergies_SET2.GLACIAL) == 4 || synergiesAll.get(Synergies_SET2.GLACIAL) == 6)
                res.put(Synergies_SET2.GLACIAL, synergiesAll.get(Synergies_SET2.GLACIAL));
        }

        if (synergiesAll.get(Synergies_SET2.INFERNO) != null) {
            if (synergiesAll.get(Synergies_SET2.INFERNO) == 3 || synergiesAll.get(Synergies_SET2.INFERNO) == 6 || synergiesAll.get(Synergies_SET2.INFERNO) == 9)
                res.put(Synergies_SET2.INFERNO, synergiesAll.get(Synergies_SET2.INFERNO));
        }

        if (synergiesAll.get(Synergies_SET2.LIGHT) != null) {
            if (synergiesAll.get(Synergies_SET2.LIGHT) == 3 || synergiesAll.get(Synergies_SET2.LIGHT) == 6 || synergiesAll.get(Synergies_SET2.LIGHT) == 9)
                res.put(Synergies_SET2.LIGHT, synergiesAll.get(Synergies_SET2.LIGHT));
        }

        if (synergiesAll.get(Synergies_SET2.MAGE) != null) {
            if (synergiesAll.get(Synergies_SET2.MAGE) == 3 || synergiesAll.get(Synergies_SET2.MAGE) == 6)
                res.put(Synergies_SET2.MAGE, synergiesAll.get(Synergies_SET2.MAGE));
        }

        if (synergiesAll.get(Synergies_SET2.MOUNTAIN) != null) {
            if (synergiesAll.get(Synergies_SET2.MOUNTAIN) == 2)
                res.put(Synergies_SET2.MOUNTAIN, synergiesAll.get(Synergies_SET2.MOUNTAIN));
        }

        if (synergiesAll.get(Synergies_SET2.MYSTIC) != null) {
            if (synergiesAll.get(Synergies_SET2.MYSTIC) == 2 || synergiesAll.get(Synergies_SET2.MYSTIC) == 4)
                res.put(Synergies_SET2.MYSTIC, synergiesAll.get(Synergies_SET2.MYSTIC));
        }

        if (synergiesAll.get(Synergies_SET2.OCEAN) != null) {
            if (synergiesAll.get(Synergies_SET2.OCEAN) == 2 || synergiesAll.get(Synergies_SET2.OCEAN) == 4 || synergiesAll.get(Synergies_SET2.OCEAN) == 6)
                res.put(Synergies_SET2.OCEAN, synergiesAll.get(Synergies_SET2.OCEAN));
        }

        if (synergiesAll.get(Synergies_SET2.POISON) != null) {
            if (synergiesAll.get(Synergies_SET2.POISON) == 3)
                res.put(Synergies_SET2.POISON, synergiesAll.get(Synergies_SET2.POISON));
        }

        if (synergiesAll.get(Synergies_SET2.PREDATOR) != null) {
            if (synergiesAll.get(Synergies_SET2.PREDATOR) == 3)
                res.put(Synergies_SET2.PREDATOR, synergiesAll.get(Synergies_SET2.PREDATOR));
        }
        if (synergiesAll.get(Synergies_SET2.RANGER) != null) {
            if (synergiesAll.get(Synergies_SET2.RANGER) == 2 || synergiesAll.get(Synergies_SET2.RANGER) == 4 || synergiesAll.get(Synergies_SET2.RANGER) == 6)
                res.put(Synergies_SET2.RANGER, synergiesAll.get(Synergies_SET2.RANGER));
        }
        if (synergiesAll.get(Synergies_SET2.SHADOW) != null) {
            if (synergiesAll.get(Synergies_SET2.SHADOW) == 2 || synergiesAll.get(Synergies_SET2.SHADOW) == 4)
                res.put(Synergies_SET2.SHADOW, synergiesAll.get(Synergies_SET2.SHADOW));
        }
        if (synergiesAll.get(Synergies_SET2.STEEL) != null) {
            if (synergiesAll.get(Synergies_SET2.STEEL) == 2 || synergiesAll.get(Synergies_SET2.STEEL) == 3 || synergiesAll.get(Synergies_SET2.STEEL) == 4)
                res.put(Synergies_SET2.STEEL, synergiesAll.get(Synergies_SET2.STEEL));
        }
        if (synergiesAll.get(Synergies_SET2.SUMMONER) != null) {
            if (synergiesAll.get(Synergies_SET2.SUMMONER) == 3 || synergiesAll.get(Synergies_SET2.SUMMONER) == 6)
                res.put(Synergies_SET2.SUMMONER, synergiesAll.get(Synergies_SET2.SUMMONER));
        }
        if (synergiesAll.get(Synergies_SET2.WARDEN) != null) {
            if (synergiesAll.get(Synergies_SET2.WARDEN) == 2 || synergiesAll.get(Synergies_SET2.WARDEN) == 4 || synergiesAll.get(Synergies_SET2.WARDEN) == 6)
                res.put(Synergies_SET2.WARDEN, synergiesAll.get(Synergies_SET2.WARDEN));
        }
        if (synergiesAll.get(Synergies_SET2.WOODLAND) != null) {
            if (synergiesAll.get(Synergies_SET2.WOODLAND) == 3)
                res.put(Synergies_SET2.WOODLAND, synergiesAll.get(Synergies_SET2.WOODLAND));
        }

        return res;
    }

    private List<Champion> getSortedChampionList(Set<Champion> randomChampionSet) {
        List<Champion> championsSorted = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            List<Champion> dummy = new ArrayList<>();
            for (Champion ch : randomChampionSet) {
                if (ch.getCost() == i)
                    dummy.add(ch);
            }

            Collections.sort(dummy, new Comparator<Champion>() {
                @Override
                public int compare(Champion o1, Champion o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });

            championsSorted.addAll(dummy);
        }
        return championsSorted;

    }


}
