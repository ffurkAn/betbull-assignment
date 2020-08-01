
INSERT INTO team(id, name) values ('1', 'team1');
INSERT INTO team(id, name) VALUES ('2', 'team2');

INSERT INTO player (id, name, team_id) values ('3', 'player1', select id from team where name = 'team1');
INSERT INTO player (id, name, team_id) values ('4', 'player2', select id from team where name = 'team1');
INSERT INTO player (id, name, team_id) values ('5', 'player3', select id from team where name = 'team1');
INSERT INTO player (id, name, team_id) values ('6', 'player4', select id from team where name = 'team1');
INSERT INTO player (id, name, team_id) values ('7', 'player5', select id from team where name = 'team1');

