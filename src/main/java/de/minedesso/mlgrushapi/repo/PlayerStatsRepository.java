package de.minedesso.mlgrushapi.repo;

import de.minedesso.mlgrushapi.model.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Integer> {
    PlayerStats findByPlayerId(UUID playerId);
}
