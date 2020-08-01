package com.betbull.assignment.controller;


import com.betbull.assignment.constant.Globals;
import com.betbull.assignment.model.MyResponse;
import com.betbull.assignment.model.dto.ContractPriceDTO;
import com.betbull.assignment.model.dto.PlayerDTO;
import com.betbull.assignment.model.dto.SavePlayerDTO;
import com.betbull.assignment.model.entity.Player;
import com.betbull.assignment.service.IPlayerService;
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
@RequestMapping("/player")
@Tag(name = "playerController")
public class PlayerController {

    public static final String TEAM_ID = "teamId";
    public static final String END_YEAR = "endYear";

    @Autowired
    IPlayerService playerService;


    /**
     * @param savePlayerDTO
     * @return
     */
    @Operation(summary = "Proje Tanımlama Servisi",
            description = "Proje ve girişimci/girişim şirketi bilgilerinin tanımlandığı servistir.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = Globals.SUCCESS,
                    content = @Content(schema = @Schema(implementation = MyResponse.class)))
    })
    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MyResponse> save(@RequestBody SavePlayerDTO savePlayerDTO) {
        playerService.savePlayer(savePlayerDTO);
        return ResponseEntity.status(HttpStatus.OK).body(new MyResponse(Globals.SUCCESS_CODE, Globals.SUCCESS));
    }


    /**
     * @param savePlayerDTO
     * @return
     */
    @Operation(summary = "Proje Tanımlama Servisi",
            description = "Proje ve girişimci/girişim şirketi bilgilerinin tanımlandığı servistir.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = Globals.SUCCESS,
                    content = @Content(schema = @Schema(implementation = MyResponse.class)))
    })
    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MyResponse> update(@RequestBody SavePlayerDTO savePlayerDTO) {
        playerService.updatePlayer(savePlayerDTO);
        return ResponseEntity.status(HttpStatus.OK).body(new MyResponse(Globals.SUCCESS_CODE, Globals.SUCCESS));
    }


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
    public ResponseEntity<List<PlayerDTO>> getAll(@RequestParam(value = TEAM_ID, required = false) String teamId,
                                               @RequestParam(value = END_YEAR, required = false) String endYear) {
        return ResponseEntity.status(HttpStatus.OK).body(PlayerDTO.mapAll(playerService.getAllByTeamIdAndEndYear(teamId, endYear)));
    }

    /**
     * @return
     */
    @Operation(summary = "Proje Tanımlama Servisi",
            description = "Proje ve girişimci/girişim şirketi bilgilerinin tanımlandığı servistir.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = Globals.SUCCESS,
                    content = @Content(schema = @Schema(implementation = MyResponse.class)))
    })
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MyResponse> delete(@RequestBody PlayerDTO playerDTO) {
        playerService.delete(playerDTO.getId());
        return ResponseEntity.status(HttpStatus.OK).body(new MyResponse(Globals.SUCCESS_CODE, Globals.SUCCESS));
    }


    @Operation(summary = "Proje Tanımlama Servisi",
            description = "Proje ve girişimci/girişim şirketi bilgilerinin tanımlandığı servistir.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = Globals.SUCCESS,
                    content = @Content(schema = @Schema(implementation = String.class)))
    })
    @RequestMapping(value = "/getContractPrice", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getContractPriceForPlayer(@RequestBody ContractPriceDTO contractPriceDTO){
        return ResponseEntity.status(HttpStatus.OK).body(playerService.getContractPriceForPlayer(contractPriceDTO));
    }

}
