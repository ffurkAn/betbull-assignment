package com.betbull.assignment.repository;

import com.betbull.assignment.model.entity.TeamPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TeamPlayerRepository extends JpaRepository<TeamPlayer, String> {

    Optional<TeamPlayer> findByTeamIdAndPlayerId(String teamId, String playerId);

    List<TeamPlayer> findByPlayerId(String playerId);
}
