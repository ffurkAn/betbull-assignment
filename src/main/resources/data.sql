
INSERT INTO team(id, name) values ('1', 'team1');
INSERT INTO team(id, name) VALUES ('2', 'team2');

INSERT INTO player (id, name) values ('3', 'player1');
INSERT INTO player (id, name) values ('4', 'player2');
INSERT INTO player (id, name) values ('5', 'player3');
INSERT INTO player (id, name) values ('6', 'player4');
INSERT INTO player (id, name) values ('7', 'player5');

INSERT INTO team_player (id, team_id, player_id, contract_end_year) VALUES ('99', '1', '3', 2020);
INSERT INTO team_player (id, team_id, player_id, contract_end_year) VALUES ('98', '1', '5', 2023);
INSERT INTO team_player (id, team_id, player_id, contract_end_year) VALUES ('97', '2', '3', 2011);
INSERT INTO team_player (id, team_id, player_id, contract_end_year) VALUES ('96', '1', '4', 2030);
INSERT INTO team_player (id, team_id, player_id, contract_end_year) VALUES ('95', '2', '6', 2022);
INSERT INTO team_player (id, team_id, player_id, contract_end_year) VALUES ('94', '1', '6', 2022);
INSERT INTO team_player (id, team_id, player_id, contract_end_year) VALUES ('93', '1', '7', 2022);


