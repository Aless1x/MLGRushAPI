package de.minedesso.mlgrushapi.repo;

import de.minedesso.mlgrushapi.objects.model.TeamLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamLocationRepository extends JpaRepository<TeamLocation, Integer> {
}
