
INSERT INTO team(name) values ('team1');
INSERT INTO team(name) VALUES ('team2');

INSERT INTO player (name, team_id) values ('player1', select id from team where name = 'team1');
INSERT INTO player (name, team_id) values ('player2', select id from team where name = 'team1');
INSERT INTO player (name, team_id) values ('player3', select id from team where name = 'team1');
INSERT INTO player (name, team_id) values ('player4', select id from team where name = 'team1');
INSERT INTO player (name, team_id) values ('player5', select id from team where name = 'team1');
INSERT INTO player (name, team_id) values ('player6', select id from team where name = 'team1');
INSERT INTO player (name, team_id) values ('player7', select id from team where name = 'team1');
INSERT INTO player (name, team_id) values ('player8', select id from team where name = 'team1');
INSERT INTO player (name, team_id) values ('player9', select id from team where name = 'team2');
INSERT INTO player (name, team_id) values ('player10', select id from team where name = 'team2');
INSERT INTO player (name, team_id) values ('player11', select id from team where name = 'team2');
INSERT INTO player (name, team_id) values ('player12', select id from team where name = 'team2');
INSERT INTO player (name, team_id) values ('player13', select id from team where name = 'team2');
INSERT INTO player (name, team_id) values ('player14', select id from team where name = 'team2');
INSERT INTO player (name, team_id) values ('player15', select id from team where name = 'team2');
INSERT INTO player (name, team_id) values ('player16', select id from team where name = 'team2');
INSERT INTO player (name, team_id) values ('player17', select id from team where name = 'team2');
INSERT INTO player (name, team_id) values ('player18', select id from team where name = 'team2');
