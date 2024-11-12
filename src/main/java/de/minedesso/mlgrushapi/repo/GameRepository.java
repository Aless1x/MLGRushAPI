package de.minedesso.mlgrushapi.repo;

import de.minedesso.mlgrushapi.objects.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
