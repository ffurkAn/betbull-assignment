package com.betbull.assignment.repository;

import com.betbull.assignment.model.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, String> {

}
