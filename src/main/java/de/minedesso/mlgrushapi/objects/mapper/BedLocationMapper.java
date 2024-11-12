package de.minedesso.mlgrushapi.objects.mapper;

import de.minedesso.mlgrushapi.objects.dto.BedLocationDTO;
import de.minedesso.mlgrushapi.objects.model.BedLocation;

public class BedLocationMapper {

    public static BedLocationDTO toBedLocationDTO(BedLocation bedLocation) {
        if(bedLocation == null) return null;

        BedLocationDTO bedLocationDTO = toBedLocationLightDTO(bedLocation);

        bedLocationDTO.setTeamLocation(TeamLocationMapper.toTeamLocationLightDTO(bedLocation.getTeamLocation()));

        return bedLocationDTO;
    }

    public static BedLocationDTO toBedLocationLightDTO(BedLocation bedLocation) {
        if(bedLocation == null) return null;

        BedLocationDTO bedLocationLightDTO = new BedLocationDTO();

        bedLocationLightDTO.setBedId(bedLocation.getBedId());
        bedLocationLightDTO.setWorldName(bedLocation.getWorldName());
        bedLocationLightDTO.setX1(bedLocation.getX1());
        bedLocationLightDTO.setY1(bedLocation.getY1());
        bedLocationLightDTO.setZ1(bedLocation.getZ1());
        bedLocationLightDTO.setX2(bedLocation.getX2());
        bedLocationLightDTO.setY2(bedLocation.getY2());
        bedLocationLightDTO.setZ2(bedLocation.getZ2());

        return bedLocationLightDTO;
    }

}
