package de.minedesso.mlgrushapi.objects.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mapId;
    private String mapName;
    private String materialName;

    @OneToMany(mappedBy = "map")
    private List<Arena> arenas;

    @OneToMany(mappedBy = "map")
    private List<TeamLocation> teamLocations;

    @OneToOne(mappedBy = "map")
    private SpectatorLocation spectatorLocation;

}
