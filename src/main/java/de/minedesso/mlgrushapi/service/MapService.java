package de.minedesso.mlgrushapi.service;

import de.minedesso.mlgrushapi.objects.model.Map;
import de.minedesso.mlgrushapi.repo.MapRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MapService {

    private final MapRepository mapRepository;

    /**
     * Gibt eine Liste aller Maps zurück
     * @return 200 OK mit der Liste aller Maps, wenn Maps existieren,
     *         204 No Content, wenn keine Maps existieren
     */
    public ResponseEntity<List<Map>> getMapList() {
        List<Map> maps = mapRepository.findAll();
        if (maps.isEmpty()) {
            return ResponseEntity.noContent().build(); // Gibt HTTP 204 No Content zurück
        }
        return ResponseEntity.ok(maps); // Gibt HTTP 200 OK zurück
    }

    /**
     * Speichert eine Map in der Datenbank
     * @param map Map, die gespeichert werden soll
     * @return 201 Created mit der gespeicherten Map, wenn die Map erfolgreich gespeichert wurde,
     *         500 Internal Server Error, wenn ein Fehler aufgetreten ist
     */
    public ResponseEntity<Void> saveMap(Map map) {
        try {
            mapRepository.save(map);
            return ResponseEntity.status(HttpStatus.CREATED).build(); // Status 201
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Fehlerhandling, Status 500
        }
    }

    /**
     * Löscht eine Map anhand des Namens
     * @param mapName Name der Map
     * @return 200 OK, wenn die Map erfolgreich gelöscht wurde,
     *         404 Not Found, wenn die Map nicht existiert
     */
    public ResponseEntity<Void> deleteMapByName(String mapName) {
        Optional<Map> map = mapRepository.findByMapName(mapName);
        if (map.isPresent()) {
            mapRepository.delete(map.get());
            return ResponseEntity.ok().build(); // Gibt HTTP 200 OK zurück
        }
        return ResponseEntity.notFound().build(); // Gibt HTTP 404 Not Found zurück
    }

    /**
     * Gibt eine Map anhand des Namens zurück
     * @param mapName Name der Map
     * @return 200 OK mit der Map, wenn die Map existiert,
     *         404 Not Found, wenn die Map nicht existiert
     */
    public ResponseEntity<Map> getMapByName(String mapName) {
        Optional<Map> map = mapRepository.findByMapName(mapName);
        if (map.isPresent()) {
            return ResponseEntity.ok(map.get());
        }
        return ResponseEntity.notFound().build();
    }

    /**
     * Überprüft, ob eine Map existiert
     * @param mapName Name der Map
     * @return 200 OK, wenn die Map existiert,
     *         404 Not Found, wenn die Map nicht existiert
     */
    public ResponseEntity<Void> existsMapByName(String mapName) {
        if (mapRepository.findByMapName(mapName).isPresent()) {
            return ResponseEntity.ok().build(); // Gibt HTTP 200 OK zurück
        }
        return ResponseEntity.notFound().build(); // Gibt HTTP 404 Not Found zurück
    }
}
