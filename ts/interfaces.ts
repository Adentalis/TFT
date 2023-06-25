interface Team {
  champions: Champion[];
}

interface Champion {
  name: ChampionName | string;
  cost: 1 | 2 | 3 | 4 | 5;
  range: 1 | 2 | 3 | 4 | 5;
  origin: Origin[];
  class: Class[];
}

type Class =
  | 'Bastion'
  | 'Bruiser'
  | 'Challenger'
  | 'Deadeye'
  | 'Empress'
  | 'Gunner'
  | 'Invoker'
  | 'Juggernaut'
  | 'Multicaster'
  | 'Redeemer'
  | 'Rogue'
  | 'Slayer'
  | 'Sorcerer'
  | 'Strategist'
  | 'Technogenius';

type Origin =
  | 'Darkin'
  | 'Demacia'
  | 'Freljord'
  | 'Ionia'
  | 'Invoker,'
  | 'Noxus'
  | 'Piltover'
  | 'Shadow Isles'
  | 'Shurima'
  | 'Targon'
  | 'Void'
  | 'Wanderer'
  | 'Yordle'
  | 'Zaun';

type ChampionName = 'Tristana' | 'Heimerdinger' | 'Jhin';
