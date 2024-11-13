package de.minedesso.mlgrushapi.objects.mapper;

import de.minedesso.mlgrushapi.objects.dto.SpectatorLocationDTO;
import de.minedesso.mlgrushapi.objects.model.SpectatorLocation;

public class SpectatorLocationMapper {

    public static SpectatorLocationDTO toSpectatorLocationDTO(SpectatorLocation spectatorLocation) {
        if(spectatorLocation == null) return null;

        SpectatorLocationDTO spectatorLocationDTO = toSpectatorLocationLightDTO(spectatorLocation);

        spectatorLocationDTO.setMap(MapMapper.toMapLightDTO(spectatorLocation.getMap()));

        return spectatorLocationDTO;
    }

    public static SpectatorLocationDTO toSpectatorLocationLightDTO(SpectatorLocation spectatorLocation) {
        if(spectatorLocation == null) return null;

        return new SpectatorLocationDTO(spectatorLocation.getSpectatorId(),
                spectatorLocation.getWorldName(),
                spectatorLocation.getX(),
                spectatorLocation.getY(),
                spectatorLocation.getZ(),
                spectatorLocation.getYaw(),
                spectatorLocation.getPitch());
    }

}
