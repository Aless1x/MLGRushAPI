package de.minedesso.mlgrushapi.repo;

import de.minedesso.mlgrushapi.model.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Integer> {
}
