package de.minedesso.mlgrushapi.objects.mapper;

import de.minedesso.mlgrushapi.objects.dto.ArenaDTO;
import de.minedesso.mlgrushapi.objects.dto.MapDTO;
import de.minedesso.mlgrushapi.objects.dto.TeamLocationDTO;
import de.minedesso.mlgrushapi.objects.model.Map;

import java.util.List;

public class MapMapper {

    public static MapDTO toMapDTO(Map map) {
        if(map == null) return null;

        MapDTO mapDTO = toMapLightDTO(map);

        List<ArenaDTO> arenas = map.getArenas().stream().map(ArenaMapper::toArenaLightDTO).toList();
        mapDTO.setArenas(arenas);

        List<TeamLocationDTO> teamLocations = map.getTeamLocations().stream().map(TeamLocationMapper::toTeamLocationLightDTO).toList();
        mapDTO.setTeamLocations(teamLocations);

        mapDTO.setSpectatorLocation(SpectatorLocationMapper.toSpectatorLocationLightDTO(map.getSpectatorLocation()));

        return mapDTO;
    }

    public static MapDTO toMapLightDTO(Map map) {
        if(map == null) return null;

        MapDTO mapLightDTO = new MapDTO();

        mapLightDTO.setMapId(map.getMapId());
        mapLightDTO.setMapName(map.getMapName());
        mapLightDTO.setMaterialName(map.getMaterialName());

        return mapLightDTO;
    }

}
