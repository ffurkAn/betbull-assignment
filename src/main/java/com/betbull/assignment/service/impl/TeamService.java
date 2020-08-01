package com.betbull.assignment.service.impl;

import com.betbull.assignment.model.entity.Player;
import com.betbull.assignment.model.entity.Team;
import com.betbull.assignment.repository.TeamRepository;
import com.betbull.assignment.service.ITeamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService implements ITeamService {

    @Autowired
    TeamRepository teamRepository;

    @Override
    public Optional<Team> findById(String id) {
        return teamRepository.findById(id);
    }

    private List<Team> getAll() {
        return teamRepository.findAll();
    }

    @Override
    public List<Team> getAllByPlayerId(String playerId) {
        if(StringUtils.isEmpty(playerId)){
            return getAll();
        }else{
            return getAll(); //teamRepository.findByPlayerId(playerId);
        }
    }
}
