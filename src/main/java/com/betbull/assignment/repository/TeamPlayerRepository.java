package com.betbull.assignment.repository;

import com.betbull.assignment.model.entity.TeamPlayer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TeamPlayerRepository extends JpaRepository<TeamPlayer, String> {

    Optional<TeamPlayer> findByTeamIdAndPlayerId(String teamId, String playerId);

    List<TeamPlayer> findByPlayerId(String playerId);

    @Query("select tp from TeamPlayer tp where tp.contractEndYear <= :endYear")
    List<TeamPlayer> findAllByEndYear(
            @Param("endYear") int endYear);

}
