package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class MapDTO {

    private final Integer mapId;
    private final String mapName;
    private final String materialName;

    private List<ArenaDTO> arenas;
    private List<TeamLocationDTO> teamLocations;
    private SpectatorLocationDTO spectatorLocation;

}
