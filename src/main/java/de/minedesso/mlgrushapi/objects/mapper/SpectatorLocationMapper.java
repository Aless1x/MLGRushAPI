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

        SpectatorLocationDTO spectatorLocationDTO = new SpectatorLocationDTO();

        spectatorLocationDTO.setSpectatorId(spectatorLocation.getSpectatorId());
        spectatorLocationDTO.setWorldName(spectatorLocation.getWorldName());
        spectatorLocationDTO.setX(spectatorLocation.getX());
        spectatorLocationDTO.setY(spectatorLocation.getY());
        spectatorLocationDTO.setZ(spectatorLocation.getZ());
        spectatorLocationDTO.setYaw(spectatorLocation.getYaw());
        spectatorLocationDTO.setPitch(spectatorLocation.getPitch());

        return spectatorLocationDTO;
    }

}
