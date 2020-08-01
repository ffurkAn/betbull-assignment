package com.betbull.assignment.repository;

import com.betbull.assignment.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, String> {

//    List<Player> findByTeamId(String teamId);

}
