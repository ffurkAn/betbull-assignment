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
  team_id VARCHAR (26) not null,
  primary key(id)
);
