package com.betbull.assignment.service.impl;

import com.betbull.assignment.model.dto.TeamPlayerDTO;
import com.betbull.assignment.model.entity.Team;
import com.betbull.assignment.model.entity.TeamPlayer;
import com.betbull.assignment.repository.TeamPlayerRepository;
import com.betbull.assignment.service.ITeamPlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
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

    @Override
    public void deleteByPlayerId(String id) {

        List<TeamPlayer> teamPlayerList = teamPlayerRepository.findByPlayerId(id);

        if(teamPlayerList.size() > 0){
            for (TeamPlayer tp : teamPlayerList){
                teamPlayerRepository.delete(tp);
            }
        }else {
            log.warn(id + " id'li oyuncu için takım bilgisi bulunamadı.");
        }

    }

    public void delete(String teamId, String playerId){

        Optional<TeamPlayer> optionalTeamPlayer = teamPlayerRepository.findByTeamIdAndPlayerId(teamId, playerId);
        if(optionalTeamPlayer.isPresent()){
            teamPlayerRepository.delete(optionalTeamPlayer.get());
        }else {
            log.warn(teamId + " teamId'si ve " + playerId + " playerId'si için kayıt bulunamadı");
        }
    }
}
