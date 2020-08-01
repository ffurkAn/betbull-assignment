package com.betbull.assignment.controller;

import com.betbull.assignment.model.entity.Team;
import com.betbull.assignment.service.ITeamService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TeamControllerTest {

    @Mock
    ITeamService iTeamService;

    @InjectMocks
    TeamController teamController;

    @BeforeEach
    void setUp(){
        assertNotNull(iTeamService);
    }

    @Test
    void getAll() {

        Team t = new Team();
        t.setName("test");

        when(iTeamService.getAllByPlayerId("playerId")).thenReturn(Arrays.asList(t));

        ResponseEntity<List<Team>> responseEntity = teamController.getAll("playerId");

        assertEquals(1, responseEntity.getBody().size());
    }
}