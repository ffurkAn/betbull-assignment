package com.betbull.assignment.model.dto;


import com.betbull.assignment.model.entity.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

    private String id;
    private String playerName;
    private String teamId;


    static PlayerDTO map(Player player) {
        return new PlayerDTO(
                player.getId(),
                player.getName(),
                player.getTeamId()
        );
    }
}
