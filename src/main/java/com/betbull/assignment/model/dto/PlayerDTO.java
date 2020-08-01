package com.betbull.assignment.model.dto;


import com.betbull.assignment.model.entity.Player;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

    private String id;
    private String name;


   public static PlayerDTO map(Player player) {
        return new PlayerDTO(
                player.getId(),
                player.getName()
        );
    }

    public static List<PlayerDTO> mapAll(List<Player> playerList){
        List<PlayerDTO> result = new ArrayList<>();
        for(Player p : playerList){
            result.add(map(p));
        }
        return result;
    }

}
