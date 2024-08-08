package de.minedesso.mlgrushapi.controller;

import de.minedesso.mlgrushapi.model.PlayerStats;
import de.minedesso.mlgrushapi.service.APIService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/mlgrush/api")
@AllArgsConstructor
public class APIController {

    private final APIService apiService;

    @GetMapping("/get/playerstats")
    public ResponseEntity<PlayerStats> getPlayerStats(@RequestParam("uuid") String uuid) {
        PlayerStats playerStats = apiService.getPlayerStats(uuid);
        if (playerStats == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(playerStats, HttpStatus.OK);
    }

    @PostMapping(value = "/save/playerstats", consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> savePlayerStats(@RequestBody PlayerStats playerStats) {
        apiService.savePlayerStats(playerStats);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
