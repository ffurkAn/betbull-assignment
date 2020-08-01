package com.betbull.assignment.service.impl;

import com.betbull.assignment.model.BetException;
import com.betbull.assignment.model.dto.PlayerDTO;
import com.betbull.assignment.model.dto.TeamPlayerDTO;
import com.betbull.assignment.model.entity.Player;
import com.betbull.assignment.model.entity.Team;
import com.betbull.assignment.model.entity.TeamPlayer;
import com.betbull.assignment.repository.PlayerRepository;
import com.betbull.assignment.service.IPlayerService;
import com.betbull.assignment.service.ITeamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PlayerService implements IPlayerService {

    @Autowired
    ITeamService teamService;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    TeamPlayerService teamPlayerService;

    @Override
    public void savePlayer(PlayerDTO playerDTO) {

        Optional<Team> t = teamService.findById(playerDTO.getTeamId());

        if (!t.isPresent()) {
            throw new BetException("500", "Belirtilen id için takım bulunamadı. id:" + playerDTO.getTeamId());
        }

        Player player = new Player();
        player.setName(playerDTO.getName());

        Set<Team> teamSet = new HashSet<>();
        teamSet.add(t.get());
        player.setTeamSet(teamSet);

        playerRepository.save(player);

        TeamPlayerDTO teamPlayerDTO = new TeamPlayerDTO();
        teamPlayerDTO.setTeamId(t.get().getId());
        teamPlayerDTO.setPlayerId(player.getId());

        teamPlayerService.save(teamPlayerDTO);


    }

    @Override
    public void updatePlayer(PlayerDTO playerDTO) {

        Optional<Player> playerOptional = findById(playerDTO.getId());

        if (!playerOptional.isPresent()) {
            throw new BetException("500", "Güncellenmek istenen oyuncu bulunamadı. id:" + playerDTO.getId());
        }

        Optional<Team> t = teamService.findById(playerDTO.getTeamId());

        if (!t.isPresent()) {
            throw new BetException("500", "Belirtilen id için takım bulunamadı. id:" + playerDTO.getTeamId());
        }

        Player playerFound = playerOptional.get();
        playerFound.setName(playerDTO.getName());
        playerFound.getTeamSet().add(t.get());

        playerRepository.save(playerFound);

    }

    @Override
    public Optional<Player> findById(String playerId) {

        return playerRepository.findById(playerId);
    }

    @Override
    public List<Player> getAll() {
        return playerRepository.findAll();
    }

    private List<Player> getAllByTeamId(String teamId) {
        return getAll().stream().filter(p -> p.getTeamSet().stream().anyMatch(t -> t.getId().equals(teamId))).collect(Collectors.toList());

    }

    private List<Player> getAllByEndYear(int endYear) {

        List<TeamPlayer> teamPlayerList = teamPlayerService.findByEndYear(endYear);
        List<String> playerIdList = new ArrayList<>();
        teamPlayerList.forEach(teamPlayer -> playerIdList.add(teamPlayer.getPlayerId()));
        return getAll().stream().filter(p -> playerIdList.contains(p.getId())).collect(Collectors.toList());

    }

    @Override
    public void delete(String id) {
        Optional<Player> playerOptional = findById(id);

        if (!playerOptional.isPresent()) {
            throw new BetException("500", "Oyuncu bulunamadı. id: " + id);
        }

        teamPlayerService.deleteByPlayerId(id);
    }

    @Override
    public List<Player> getAllByTeamIdAndEndYear(String teamId, String endYear) {

        if (StringUtils.isEmpty(teamId) && StringUtils.isEmpty(endYear)) {
            return getAll();
        } else if (StringUtils.isEmpty(teamId)) {
            return getAllByEndYear(Integer.parseInt(endYear));
        } else if (StringUtils.isEmpty(endYear)) {
            return getAllByTeamId(teamId);
        } else {

            return getAllByEndYear(Integer.parseInt(endYear))
                    .stream()
                    .filter(p -> p.getTeamSet().stream().anyMatch(t -> t.getId().equals(teamId)))
                    .collect(Collectors.toList());
        }

    }

}
