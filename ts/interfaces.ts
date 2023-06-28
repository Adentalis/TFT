export interface Team {
  champions: Champion[];
}

export interface Champion {
  name: ChampionName;
  cost: 1 | 2 | 3 | 4 | 5;
  range: 1 | 2 | 3 | 4 | 5;
  origin: Origin[];
  class: Class[];
}

export type Class =
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

export type Origin =
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

export type ChampionName =
  | 'Aatrox'
  | 'Ahri'
  | 'Akshan'
  | 'Aphelios'
  | 'Ashe'
  | 'Azir'
  | "Bel'Veth"
  | 'Cassiopeia'
  | "Cho'Gath"
  | 'Darius'
  | 'Ekko'
  | 'Galio'
  | 'Garen'
  | 'Gwen'
  | 'Heimerdinger'
  | 'Irelia'
  | 'Jarvan'
  | 'Jayce'
  | 'Jhin'
  | 'Jinx'
  | "K'Sante"
  | "Kai'Sa"
  | 'Kalista'
  | 'Karma'
  | 'Kassadin'
  | 'Katarina'
  | 'Kayle'
  | 'Kled'
  | 'Lissandra'
  | 'Lux'
  | 'Malzahar'
  | 'Maokai'
  | 'Nasus'
  | 'Orianna'
  | 'Poppy'
  | "Rek'Sai"
  | 'Renekton'
  | 'Ryze'
  | 'Samira'
  | 'Sejuani'
  | 'Senna'
  | 'Sett'
  | 'Shen'
  | 'Sion'
  | 'Sona'
  | 'Soraka'
  | 'Swain'
  | 'Taliyah'
  | 'Taric'
  | 'Teemo'
  | 'Tristana'
  | 'Urgot'
  | "Vel'Koz"
  | 'Vi'
  | 'Viego'
  | 'Warwick'
  | 'Yasuo'
  | 'Zed'
  | 'Zeri';
