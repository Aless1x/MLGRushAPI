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

        return new TeamLocationDTO(teamLocation.getTeamId(),
                teamLocation.getWorldName(),
                teamLocation.getX(),
                teamLocation.getY(),
                teamLocation.getZ(),
                teamLocation.getYaw(),
                teamLocation.getPitch(),
                teamLocation.getLocationSelection());
    }

}
