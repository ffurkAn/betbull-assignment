
INSERT INTO team(id, name) values ('1', 'team1');
INSERT INTO team(id, name) VALUES ('2', 'team2');

INSERT INTO player (id, name) values ('3', 'player1');
INSERT INTO player (id, name) values ('4', 'player2');
INSERT INTO player (id, name) values ('5', 'player3');
INSERT INTO player (id, name) values ('6', 'player4');
INSERT INTO player (id, name) values ('7', 'player5');

INSERT INTO team_player (id, team_id, player_id) VALUES ('99', '1', '3');
INSERT INTO team_player (id, team_id, player_id) VALUES ('98', '1', '5');
INSERT INTO team_player (id, team_id, player_id) VALUES ('97', '2', '3');
INSERT INTO team_player (id, team_id, player_id) VALUES ('96', '1', '4');
INSERT INTO team_player (id, team_id, player_id) VALUES ('95', '2', '6');
INSERT INTO team_player (id, team_id, player_id) VALUES ('94', '1', '6');
INSERT INTO team_player (id, team_id, player_id) VALUES ('93', '1', '7');


