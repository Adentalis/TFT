package champions.Set2;

import champions.Set2.Synergies_SET2;
import champions.Set2.Champion;

import java.io.*;
import java.util.*;

public class TeamAnalyser_Set2 {

    public TeamAnalyser_Set2() {
    }

    public void analyseChampionSet(final int NUMBER_OF_CHAMPIONS, final int NUMBER_OF_SYNERGIES, final int NUMBER_OF_TRIES) {
        ChampionFabric_SET2 championFabricSET2 = new ChampionFabric_SET2();
        ArrayList<Champion> allChampions = championFabricSET2.getChampionList();

        Random rnd = new Random();
        int counter = 0;
        Set<Champion> randomChampionSet = new HashSet<>();
        do {
            randomChampionSet.clear();
            //create new randomChampionSet
            do {
                int randomIndex = rnd.nextInt(allChampions.size());
                randomChampionSet.add(allChampions.get(randomIndex));
            } while (randomChampionSet.size() < NUMBER_OF_CHAMPIONS);

            analyseRandomTeam(randomChampionSet, NUMBER_OF_CHAMPIONS, NUMBER_OF_SYNERGIES);

            counter++;
            if (counter % 1000000 == 0) {
                System.out.println(counter / 1000000 + " Million tries");
            }
        } while (counter < NUMBER_OF_TRIES);

    }

    private void analyseRandomTeam(Set<Champion> randomChampionSet, int NUMBER_OF_CHAMPIONS, int NUMBER_OF_SYNERGIES) {
        //init synergies
        HashMap<Synergies_SET2, Integer> synergiesAll = synergizeOrigins(randomChampionSet);

        //remove all useless synergies - mages(1) f.ex
        HashMap<Synergies_SET2, Integer> synergiesFiltered = filterSynergies(synergiesAll);

        //count all synergies left
        int matchCounter = countMatches(synergiesFiltered);

        if (matchCounter >= NUMBER_OF_SYNERGIES) {
            saveResult(randomChampionSet, synergiesFiltered, NUMBER_OF_CHAMPIONS, matchCounter);
        }

    }

    private void saveResult(Set<Champion> randomChampionSet, HashMap<Synergies_SET2, Integer> synergiesFiltered, int NUMBER_OF_CHAMPIONS, int matchCounter) {
        //Sort Champions
        List<Champion> championsSorted = getSortedChampionList(randomChampionSet);

        //get the String to write in file
        String teamToSave = teamToString(championsSorted, synergiesFiltered);

        //add the hash at the end of line
        int teamHash = teamToSave.hashCode();
        teamToSave += "--[" + teamHash + "]";

        //write team to file
        updateFile(teamToSave, teamHash, NUMBER_OF_CHAMPIONS, matchCounter);
    }

    private void updateFile(String teamToSave, int teamHash, int number_of_champions, int matchCounter) {
        String filePath = "./src/combinations/Set2/" + number_of_champions + "-" + matchCounter;

        String res = "";
        String hashRead = "";
        int hashReadInt = 0;
        boolean match = false;

        /*
        - go through every line in the file
        - save line in res
        - save the hash of the line in hashRead
        - compare if the hash of the team to analyse is equal to the hashread
        -   if yes -> break = dont save this team
        -   if no -> continue and add the team in the file
         */
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                res += line + "\n";
                hashRead = line.substring(line.lastIndexOf("[") + 1);
                hashRead = hashRead.substring(0, hashRead.length() - 1);
                hashReadInt = Integer.parseInt(hashRead);
                if (hashReadInt == teamHash) {
                    match = true;
                    break;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (match) {
            System.out.println("SAME TEAM HASH of "+matchCounter+"!!!!  -->" + teamHash);
            return;
        } else {
            System.out.println("NEW TEAM FOUND - " + matchCounter);
        }

        //rewrite whole file and add new team - maybe @refactor
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(res);
            writer.write(teamToSave);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String teamToString(List<Champion> championsSorted, HashMap<Synergies_SET2, Integer> synergiesFiltered) {
        String res = "";
        for (Champion c : championsSorted) {
            res += c.getName() + "(" + c.getCost() + ")-";
        }

        for (Synergies_SET2 s : synergiesFiltered.keySet()) {
            res += ("-" + s + "(" + synergiesFiltered.get(s) + ")");
        }
        return res;
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

