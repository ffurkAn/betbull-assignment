package com.betbull.assignment.service;

import com.betbull.assignment.model.dto.TeamPlayerDTO;
import com.betbull.assignment.model.entity.TeamPlayer;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan("teamPlayerService")
public interface ITeamPlayerService {
    void save(TeamPlayerDTO teamPlayerDTO);

    void deleteByPlayerId(String id);

    List<TeamPlayer> findByEndYear(int endYear);
}
