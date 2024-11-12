package de.minedesso.mlgrushapi.repo;

import de.minedesso.mlgrushapi.objects.model.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Integer> {
    Optional<PlayerStats> findByPlayerId(UUID playerId);
}
