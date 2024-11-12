package de.minedesso.mlgrushapi.controller;

import de.minedesso.mlgrushapi.objects.model.PlayerStats;
import de.minedesso.mlgrushapi.service.PlayerStatsService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/mlgrush/api")
@AllArgsConstructor
public class PlayerStatsController {

    private final PlayerStatsService playerStatsService;

    @GetMapping("/get/playerstats")
    public ResponseEntity<PlayerStats> getPlayerStats(@RequestParam("uuid") String uuid) {
        return playerStatsService.getPlayerStats(uuid);
    }

    @PostMapping(value = "/save/playerstats", consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PlayerStats> savePlayerStats(@RequestBody PlayerStats playerStats) {
        return playerStatsService.savePlayerStats(playerStats);
    }

}
