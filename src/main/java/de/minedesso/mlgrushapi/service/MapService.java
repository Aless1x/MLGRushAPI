package de.minedesso.mlgrushapi.service;

import de.minedesso.mlgrushapi.model.Map;
import de.minedesso.mlgrushapi.repo.MapRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MapService {

    private final MapRepository mapRepository;

    public ResponseEntity<List<Map>> getMapList() {
        return ResponseEntity.ok(mapRepository.findAll());
    }

}
