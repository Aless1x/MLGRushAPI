package de.minedesso.mlgrushapi.objects.mapper;

import de.minedesso.mlgrushapi.objects.dto.BedLocationDTO;
import de.minedesso.mlgrushapi.objects.model.BedLocation;

public class BedLocationMapper {

    public static BedLocationDTO toBedLocationDTO(BedLocation bedLocation) {
        if (bedLocation == null) return null;

        BedLocationDTO bedLocationDTO = toBedLocationLightDTO(bedLocation);

        bedLocationDTO.setTeamLocation(TeamLocationMapper.toTeamLocationLightDTO(bedLocation.getTeamLocation()));

        return bedLocationDTO;
    }

    public static BedLocationDTO toBedLocationLightDTO(BedLocation bedLocation) {
        if (bedLocation == null) return null;

        return new BedLocationDTO(bedLocation.getBedId(),
                bedLocation.getWorldName(),
                bedLocation.getX1(),
                bedLocation.getY1(),
                bedLocation.getZ1(),
                bedLocation.getX2(),
                bedLocation.getY2(),
                bedLocation.getZ2());
    }

}
