package com.betbull.assignment.controller;


import com.betbull.assignment.constant.Globals;
import com.betbull.assignment.model.MyResponse;
import com.betbull.assignment.model.dto.PlayerDTO;
import com.betbull.assignment.model.dto.TeamDTO;
import com.betbull.assignment.model.entity.Player;
import com.betbull.assignment.model.entity.Team;
import com.betbull.assignment.service.IPlayerService;
import com.betbull.assignment.service.ITeamService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/team")
@Tag(name = "teamController")
public class TeamController {

    @Autowired
    ITeamService teamService;


    /**
     * @return
     */
    @Operation(summary = "Proje Tanımlama Servisi",
            description = "Proje ve girişimci/girişim şirketi bilgilerinin tanımlandığı servistir.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = Globals.SUCCESS,
                    content = @Content(schema = @Schema(implementation = MyResponse.class)))
    })
    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Team>> getAll(@RequestParam(value = "playerId", required = false) String playerId) {
        return ResponseEntity.status(HttpStatus.OK).body(teamService.getAllByPlayerId(playerId));
    }
}
