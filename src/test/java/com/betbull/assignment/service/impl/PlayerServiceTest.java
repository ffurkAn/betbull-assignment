package com.betbull.assignment.service.impl;

import com.betbull.assignment.model.BetException;
import com.betbull.assignment.model.dto.SavePlayerDTO;
import com.betbull.assignment.model.entity.Player;
import com.betbull.assignment.model.entity.Team;
import com.betbull.assignment.model.entity.TeamPlayer;
import com.betbull.assignment.repository.PlayerRepository;
import com.betbull.assignment.service.IPlayerService;
import com.betbull.assignment.service.ITeamPlayerService;
import com.betbull.assignment.service.ITeamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PlayerServiceTest {

    public static final String PLAYER_ID = "playerId";
    public static final String TEAM_ID = "teamId";
    public static final String P_1 = "p1";
    public static final String PLAYER_NAME = P_1;
    public static final String TEAM_NAME = "t1";
    @Mock
    ITeamService iTeamService;

    @Mock
    PlayerRepository playerRepository;

    @Mock
    ITeamPlayerService iTeamPlayerService;

    @InjectMocks
    IPlayerService iPlayerService = new PlayerService();


    @BeforeEach
    void setUp(){
        assertNotNull(iTeamService);
        assertNotNull(playerRepository);
        assertNotNull(iPlayerService);
    }

    @Test
    void savePlayerER1() {

        when(iTeamService.findById(any())).thenReturn(Optional.empty());

        Assertions.assertThrows(BetException.class, () -> {
            iPlayerService.savePlayer(new SavePlayerDTO());
        });
    }

    @Test
    void savePlayerSuccess() {

        SavePlayerDTO dto = new SavePlayerDTO();
        dto.setTeamId("teamId");

        Team t = new Team();
        t.setId("id");
        t.setName("team1");

        when(iTeamService.findById(any())).thenReturn(Optional.of(t));

        iPlayerService.savePlayer(dto);

        verify(playerRepository, times(1)).save(any());
        verify(iTeamPlayerService, times(1)).save(any());

    }

    @Test
    void getAllByTeamIdAndEndYear1() {

        Player p = new Player();
        p.setId(PLAYER_ID);
        p.setName(PLAYER_NAME);

        Set<Player> playerSet = new HashSet<>();
        playerSet.add(p);

        Team t = new Team();
        t.setId(TEAM_ID);
        t.setName(TEAM_NAME);

        Set<Team> teamSet = new HashSet<>();
        teamSet.add(t);

        p.setTeamSet(teamSet);
        t.setPlayerSet(playerSet);

        TeamPlayer tp = new TeamPlayer();
        tp.setPlayerId(PLAYER_ID);
        tp.setTeamId(TEAM_ID);
        tp.setContractEndYear(2021);


        when(playerRepository.findAll()).thenReturn(Arrays.asList(p));

        Assertions.assertEquals(1, iPlayerService.getAllByTeamIdAndEndYear("", "").size());


    }
}