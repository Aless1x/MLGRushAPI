package de.minedesso.mlgrushapi.repo;

import de.minedesso.mlgrushapi.objects.model.Map;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MapRepository extends JpaRepository<Map, Integer> {
    Optional<Map> findByMapName(String mapName);
}
