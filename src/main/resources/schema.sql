create table team
(
  id bigint auto_increment not null,
  name varchar(50) not null,
  primary key(id)
);


create table player
(
  id bigint auto_increment not null,
  name varchar(50) not null,
  team_id bigint not null,
  primary key(id)
);
