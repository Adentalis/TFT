# TeamFightTactics

## Introduction

Let's try to implement an "bot" that chooses the right champions to get a perfect synergie at the end of the game

## Functionality
- Set 2 championlist (no Qiyana /Lux so far)
- class TeamAnalyser creates teams with "perfect" synergies and save them

## ToDo
- Filter for specific type of synergy or champion(s) f.ex 6 Berserker/Light ...
- implement Spartula --> create team comps where you get perfect synergy if you have a specific Spardula item
- make more realistic teams --> a team of 5 champions won't have Master Yi (5 gold unit) in it in real
- simulate a game where you can pick out of 5 champions
- read the ingame data (is this legal?) --> make a screenshot or so and "understand" the 5 champions you got ingame
- a viable Gui
- win every game :P

## Questions/Problems - feel free to help me here :D
- How to read the files and reparse them to a valid Team obj? 
    - save the team directly as objects 
    - read out String file line by line and make an ugly converter by hand
- How do I work with all the different team size comps?
    - save all in one Arraylist?
    - make different Arraylists for each teamsize/synergy??
- There are 4 Predators/Poison champs..
    - is a team with 4 of them also a perfect synergy team? you just need (3) to get the synergy so the 4th. is unnecessary