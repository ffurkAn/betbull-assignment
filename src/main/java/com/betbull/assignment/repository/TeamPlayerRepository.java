package com.betbull.assignment.repository;

import com.betbull.assignment.model.entity.TeamPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamPlayerRepository extends JpaRepository<TeamPlayer, String> {
}
