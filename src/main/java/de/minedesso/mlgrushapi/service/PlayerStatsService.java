package de.minedesso.mlgrushapi.service;

import de.minedesso.mlgrushapi.model.PlayerStats;
import de.minedesso.mlgrushapi.repo.PlayerStatsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class PlayerStatsService {

    private final PlayerStatsRepository playerStatsRepository;

    public PlayerStats getPlayerStats(String uuid) {
        return playerStatsRepository.findByPlayerId(UUID.fromString(uuid));
    }

    public void savePlayerStats(PlayerStats playerStats) {
        playerStatsRepository.save(playerStats);
    }
}
