package com.betbull.assignment.service;

import com.betbull.assignment.model.dto.TeamPlayerDTO;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("teamPlayerService")
public interface ITeamPlayerService {
    void save(TeamPlayerDTO teamPlayerDTO);
}
