package com.betbull.assignment.service;

import com.betbull.assignment.model.dto.PlayerDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@ComponentScan("playerService")
public interface IPlayerService {
    void saveProject(PlayerDTO playerDTO);
}
