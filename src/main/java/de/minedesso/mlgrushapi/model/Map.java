package de.minedesso.mlgrushapi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mapId;
    private String mapName;
    private String materialName;
    @OneToMany
    @JoinColumn(name = "mapId")
    private List<Arena> arenas;
    @OneToMany
    @JoinColumn(name = "mapId")
    private List<TeamLocation> teamLocations;
    @OneToOne
    private SpectatorLocation spectatorLocation;

}
