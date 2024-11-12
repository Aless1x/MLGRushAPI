package de.minedesso.mlgrushapi.objects.mapper;

import de.minedesso.mlgrushapi.objects.dto.TeamLocationDTO;
import de.minedesso.mlgrushapi.objects.model.TeamLocation;

public class TeamLocationMapper {

    public static TeamLocationDTO toTeamLocationDTO(TeamLocation teamLocation) {
        if(teamLocation == null) return null;

        TeamLocationDTO teamLocationDTO = toTeamLocationLightDTO(teamLocation);

        teamLocationDTO.setMap(MapMapper.toMapLightDTO(teamLocation.getMap()));
        teamLocationDTO.setBedLocation(BedLocationMapper.toBedLocationLightDTO(teamLocation.getBedLocation()));

        return teamLocationDTO;
    }

    public static TeamLocationDTO toTeamLocationLightDTO(TeamLocation teamLocation) {
        if(teamLocation == null) return null;

        TeamLocationDTO teamLocationLightDTO = new TeamLocationDTO();

        teamLocationLightDTO.setTeamId(teamLocation.getTeamId());
        teamLocationLightDTO.setWorldName(teamLocation.getWorldName());
        teamLocationLightDTO.setX(teamLocation.getX());
        teamLocationLightDTO.setY(teamLocation.getY());
        teamLocationLightDTO.setZ(teamLocation.getZ());
        teamLocationLightDTO.setYaw(teamLocation.getYaw());
        teamLocationLightDTO.setPitch(teamLocation.getPitch());
        teamLocationLightDTO.setLocationSelection(teamLocation.getLocationSelection());

        return teamLocationLightDTO;
    }

}
