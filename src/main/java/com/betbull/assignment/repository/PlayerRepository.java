package com.betbull.assignment.repository;

import com.betbull.assignment.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, String> {

}
