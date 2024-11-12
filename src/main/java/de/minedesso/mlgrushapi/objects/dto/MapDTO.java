package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MapDTO {

    private Integer mapId;
    private String mapName;
    private String materialName;

    private List<ArenaDTO> arenas;
    private List<TeamLocationDTO> teamLocations;
    private SpectatorLocationDTO spectatorLocation;

}
