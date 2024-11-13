package de.minedesso.mlgrushapi.objects.dto;

import de.minedesso.mlgrushapi.common.LocationSelection;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class TeamLocationDTO {

    private final Integer teamId;
    private final String worldName;
    private final int x;
    private final int y;
    private final int z;
    private final float yaw;
    private final float pitch;
    private final LocationSelection locationSelection;

    private MapDTO map;
    private BedLocationDTO bedLocation;

}
