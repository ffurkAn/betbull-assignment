package com.betbull.assignment.service.impl;

import com.betbull.assignment.model.dto.TeamPlayerDTO;
import com.betbull.assignment.model.entity.TeamPlayer;
import com.betbull.assignment.repository.TeamPlayerRepository;
import com.betbull.assignment.service.ITeamPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamPlayerService implements ITeamPlayerService {

    @Autowired
    TeamPlayerRepository teamPlayerRepository;

    @Override
    public void save(TeamPlayerDTO teamPlayerDTO) {

        TeamPlayer teamPlayer = new TeamPlayer();
        teamPlayer.setTeamId(teamPlayerDTO.getTeamId());
        teamPlayer.setPlayerId(teamPlayerDTO.getPlayerId());

        teamPlayerRepository.save(teamPlayer);
    }
}
