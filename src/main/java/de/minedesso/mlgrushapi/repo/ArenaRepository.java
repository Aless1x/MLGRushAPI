package de.minedesso.mlgrushapi.repo;

import de.minedesso.mlgrushapi.model.Arena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArenaRepository extends JpaRepository<Arena, Integer> {
}