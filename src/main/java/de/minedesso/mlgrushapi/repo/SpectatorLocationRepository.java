package de.minedesso.mlgrushapi.repo;

import de.minedesso.mlgrushapi.objects.model.SpectatorLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpectatorLocationRepository extends JpaRepository<SpectatorLocation, Integer> {
}
