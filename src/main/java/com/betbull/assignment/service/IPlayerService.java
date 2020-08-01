package com.betbull.assignment.service;

import com.betbull.assignment.model.dto.PlayerDTO;
import com.betbull.assignment.model.entity.Player;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;

@ComponentScan("playerService")
public interface IPlayerService {
    void savePlayer(PlayerDTO playerDTO);

    void updatePlayer(PlayerDTO playerDTO);

    Optional<Player> findById(String playerId);

    List<Player> getAll();

    void delete(String id);

    List<Player> getAllByTeamIdAndEndYear(String teamId, String endYear);
}
