package de.minedesso.mlgrushapi.service;

import de.minedesso.mlgrushapi.model.PlayerStats;
import de.minedesso.mlgrushapi.repo.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class APIService {

    private final ArenaRepository arenaRepository;
    private final PlayerStatsRepository playerStatsRepository;
    private final BedLocationRepository bedLocationRepository;
    private final GameRepository gameRepository;
    private final MapRepository mapRepository;
    private final SpectatorLocationRepository spectatorLocationRepository;
    private final TeamLocationRepository teamLocationRepository;

    public PlayerStats getPlayerStats(String uuid) {
        return playerStatsRepository.findByPlayerId(UUID.fromString(uuid));
    }

    public void savePlayerStats(PlayerStats playerStats) {
        playerStatsRepository.save(playerStats);
    }
}
