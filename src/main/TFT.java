package main;

import champions.Set2.Champion;
import champions.Set2.Synergies_SET2;
import champions.Set2.Team;
import champions.Set2.TeamAnalyser_Set2;
import combinations.filter.FileToTeamConverter;
import combinations.filter.SynergieFilter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TFT {
    public static void main(String[] args) {
        /*
        TeamAnalyser_Set2 team = new TeamAnalyser_Set2();
        team.analyseChampionSet(9,18,10000000);
        */

        SynergieFilter filterer = new SynergieFilter();
        ArrayList<Team> f = filterer.getTeamWithSpecificChampion_String("Nautilus");
        System.out.println("f");



    }
}

