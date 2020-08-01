package com.betbull.assignment.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeamPlayerDTO {

    private String teamId;
    private String playerId;
    private Integer contractEndYear;
}
