package com.betbull.assignment.model.dto;


import com.betbull.assignment.model.entity.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

    private Long id;
    private String playerName;
    private Long teamId;


    static PlayerDTO map(Player player) {
        return new PlayerDTO(
                player.getId(),
                player.getName(),
                player.getTeamId()
        );
    }
}
