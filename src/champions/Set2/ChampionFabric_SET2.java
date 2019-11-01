package champions.Set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*
    In this class are the champions of the Set created
    Method getChampionList returns an ArrayList of all Champions
 */

public class ChampionFabric_SET2 {
    private ArrayList<Champion> champions;
    private Set<Synergies_SET2> synergies;

    public ChampionFabric_SET2() {
        this.champions = initChampionList();
        this.synergies = initSynergies();
    }

    public ArrayList<Champion> getChampionList() {
        return champions;
    }

    private ArrayList<Champion> initChampionList() {
        ArrayList<Champion> championsDummy = new ArrayList<>();

        championsDummy.add(new Champion("Diana", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.INFERNO,Synergies_SET2.ASSASSIN))));
        championsDummy.add(new Champion("Ivern", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.WOODLAND,Synergies_SET2.DRUID))));
        championsDummy.add(new Champion("Kog'Maw", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.POISON,Synergies_SET2.PREDATOR))));
        championsDummy.add(new Champion("Maokai", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.WOODLAND,Synergies_SET2.DRUID))));
        championsDummy.add(new Champion("Nasus", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.LIGHT,Synergies_SET2.WARDEN))));
        championsDummy.add(new Champion("Ornn", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.ELECTRIC,Synergies_SET2.WARDEN))));
        championsDummy.add(new Champion("Renekton", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.DESERT,Synergies_SET2.BERSERKER))));
        championsDummy.add(new Champion("Taliyah", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.MOUNTAIN,Synergies_SET2.MAGE))));
        championsDummy.add(new Champion("Vayne", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.LIGHT,Synergies_SET2.RANGER))));
        championsDummy.add(new Champion("Vladimir", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.OCEAN,Synergies_SET2.MAGE))));
        championsDummy.add(new Champion("Warwick", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.GLACIAL,Synergies_SET2.PREDATOR))));
        championsDummy.add(new Champion("Zyra", 1, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.INFERNO,Synergies_SET2.SUMMONER))));

        championsDummy.add(new Champion("Braum", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.GLACIAL,Synergies_SET2.WARDEN))));
        championsDummy.add(new Champion("Jax", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.LIGHT,Synergies_SET2.BERSERKER))));
        championsDummy.add(new Champion("LeBlanc", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.WOODLAND,Synergies_SET2.ASSASSIN,Synergies_SET2.MAGE))));
        championsDummy.add(new Champion("Malzahar", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.SHADOW,Synergies_SET2.SUMMONER))));
        championsDummy.add(new Champion("Neeko", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.WOODLAND,Synergies_SET2.DRUID))));
        championsDummy.add(new Champion("Rek'sai", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.STEEL,Synergies_SET2.PREDATOR))));
        championsDummy.add(new Champion("Skarner", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.CRYSTAL,Synergies_SET2.PREDATOR))));
        championsDummy.add(new Champion("Syndra", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.OCEAN,Synergies_SET2.MAGE))));
        championsDummy.add(new Champion("Thresh", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.OCEAN,Synergies_SET2.WARDEN))));
        championsDummy.add(new Champion("Varus", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.INFERNO,Synergies_SET2.RANGER))));
        championsDummy.add(new Champion("Volibear", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.GLACIAL,Synergies_SET2.ELECTRIC,Synergies_SET2.BERSERKER))));
        championsDummy.add(new Champion("Yasuo", 2, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.CLOUD,Synergies_SET2.BLADEMASTER))));

        championsDummy.add(new Champion("Aatrox", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.LIGHT,Synergies_SET2.BLADEMASTER))));
        championsDummy.add(new Champion("Azir", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.DESERT,Synergies_SET2.SUMMONER))));
        championsDummy.add(new Champion("Dr. Mundo", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.POISON,Synergies_SET2.BERSERKER))));
        championsDummy.add(new Champion("Ezreal", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.GLACIAL,Synergies_SET2.RANGER))));
        championsDummy.add(new Champion("Kindred", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.INFERNO,Synergies_SET2.SHADOW,Synergies_SET2.RANGER))));
        championsDummy.add(new Champion("Nautilus", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.OCEAN,Synergies_SET2.WARDEN))));
        championsDummy.add(new Champion("Nocturne", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.STEEL,Synergies_SET2.ASSASSIN))));
        //Qiyana is variable... Mountain, Ocean , Cloud, Inferno
        //championsDummy.add(new ChampionSyn("Qiyana", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.CLOUD,Synergies_SET2.BLADEMASTER))));
        championsDummy.add(new Champion("Sion", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.SHADOW,Synergies_SET2.BERSERKER))));
        championsDummy.add(new Champion("Sivir", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.DESERT,Synergies_SET2.BLADEMASTER))));
        championsDummy.add(new Champion("Soraka", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.LIGHT,Synergies_SET2.MYSTIC))));
        championsDummy.add(new Champion("Veigar", 3, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.SHADOW,Synergies_SET2.MAGE))));

        championsDummy.add(new Champion("Annie", 4, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.INFERNO,Synergies_SET2.SUMMONER))));
        championsDummy.add(new Champion("Ashe", 4, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.CRYSTAL,Synergies_SET2.RANGER))));
        championsDummy.add(new Champion("Brand", 4, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.INFERNO,Synergies_SET2.MAGE))));
        championsDummy.add(new Champion("Janna", 4, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.CLOUD,Synergies_SET2.MYSTIC))));
        championsDummy.add(new Champion("Kha'Zix", 4, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.DESERT,Synergies_SET2.ASSASSIN))));
        championsDummy.add(new Champion("Malphite", 4, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.MOUNTAIN,Synergies_SET2.WARDEN))));
        championsDummy.add(new Champion("Olaf", 4, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.GLACIAL,Synergies_SET2.BERSERKER))));
        championsDummy.add(new Champion("Twitch", 4, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.POISON,Synergies_SET2.RANGER))));
        championsDummy.add(new Champion("Yorick", 4, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.LIGHT,Synergies_SET2.SUMMONER))));

        championsDummy.add(new Champion("Master Yi", 5, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.SHADOW,Synergies_SET2.BLADEMASTER,Synergies_SET2.MYSTIC))));
        championsDummy.add(new Champion("Nami", 5, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.OCEAN,Synergies_SET2.MYSTIC))));
        championsDummy.add(new Champion("Singed", 5, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.POISON,Synergies_SET2.ALCHEMIST))));
        championsDummy.add(new Champion("Taric", 5, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.CRYSTAL,Synergies_SET2.WARDEN))));
        championsDummy.add(new Champion("Zed", 5, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.ELECTRIC,Synergies_SET2.ASSASSIN,Synergies_SET2.SUMMONER))));
        //Blitz ODER Inferno ODER Frost ODER Kristall ODER Wind ODER Wald ODER Stahl ODER Ozean ODER Schatten ODER Licht
        //championsDummy.add(new ChampionSyn("Lux", 7, new ArrayList<Synergies_SET2>(Arrays.asList(Synergies_SET2.CLOUD,Synergies_SET2.BLADEMASTER))));

        return championsDummy;
    }

    private Set<Synergies_SET2> initSynergies() {
        return champions.stream().flatMap(c -> c.getSynergies().stream()).collect(Collectors.toSet());
    }

    public void printAllSynergies() {
        System.out.println("\n--Synergies--");
        for (Synergies_SET2 s : this.synergies) {
            System.out.println("\n-- " + s + "--");
            for (Champion c : champions) {
                if (c.isOrigin(s)) {
                    System.out.print(c.getName() + " | ");
                }
            }
        }
    }

    public void printAllChampions() {
        for (Champion c : champions) {
            System.out.println(c.toString());
        }
    }
}
