package com.betbull.assignment.service;

import com.betbull.assignment.model.entity.Team;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;

@ComponentScan("teamService")
public interface ITeamService {
    Optional<Team> findById(String id);

    List<Team> getAllByPlayerId(String playerId);
}
