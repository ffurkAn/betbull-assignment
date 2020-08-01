create table team
(
  id VARCHAR (36) not null,
  name varchar(50) not null,
  primary key(id)
);


create table player
(
  id VARCHAR (36) not null,
  name varchar(50) not null,
  primary key(id)
);

CREATE table team_player
(
  id VARCHAR (36) NOT NULL,
  team_id VARCHAR (36) NOT NULL ,
  player_id VARCHAR (36) NOT NULL ,
  contract_end_year INT NOT NULL ,
  PRIMARY KEY (team_id, player_id)
)
