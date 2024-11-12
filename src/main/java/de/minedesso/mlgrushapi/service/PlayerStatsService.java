package de.minedesso.mlgrushapi.service;

import de.minedesso.mlgrushapi.objects.dto.PlayerStatsDTO;
import de.minedesso.mlgrushapi.objects.mapper.PlayerStatsMapper;
import de.minedesso.mlgrushapi.objects.model.PlayerStats;
import de.minedesso.mlgrushapi.repo.PlayerStatsRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PlayerStatsService {

    private final PlayerStatsRepository playerStatsRepository;

    /**
     * Gibt die Stats eines Spielers zurück
     * @param uuid UUID des Spielers
     * @return 200 OK mit den Stats des Spielers als DTO, wenn der Spieler existiert,
     *         404 Not Found, wenn der Spieler nicht existiert
     */
    public ResponseEntity<PlayerStatsDTO> getPlayerStats(String uuid) {
        Optional<PlayerStats> playerStats = playerStatsRepository.findByPlayerId(UUID.fromString(uuid));
        if (playerStats.isPresent()) {

            PlayerStatsDTO playerStatsDTO = PlayerStatsMapper.toPlayerStatsDTO(playerStats.get());
            return ResponseEntity.ok(playerStatsDTO); // Gibt HTTP 200 OK zurück

        }
        return ResponseEntity.notFound().build(); // Gibt HTTP 404 Not Found zurück
    }

    /**
     * Speichert die Stats eines Spielers in der Datenbank
     * @param playerStats Stats des Spielers, die gespeichert werden sollen
     * @return 201 Created mit den gespeicherten Stats als DTO, wenn die Stats erfolgreich gespeichert wurden,
     *         500 Internal Server Error, wenn ein Fehler aufgetreten ist
     */
    public ResponseEntity<PlayerStatsDTO> savePlayerStats(PlayerStats playerStats) {
        try {
            PlayerStats newPlayerStats = playerStatsRepository.save(playerStats);
            PlayerStatsDTO playerStatsDTO = PlayerStatsMapper.toPlayerStatsDTO(newPlayerStats);

            return ResponseEntity.status(HttpStatus.CREATED).body(playerStatsDTO); // Status 201
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Fehlerhandling, Status 500
        }
    }
}
