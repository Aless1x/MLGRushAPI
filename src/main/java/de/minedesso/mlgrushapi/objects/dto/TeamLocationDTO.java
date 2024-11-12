package de.minedesso.mlgrushapi.objects.dto;

import de.minedesso.mlgrushapi.common.LocationSelection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamLocationDTO {

    private Integer teamId;
    private String worldName;
    private int x;
    private int y;
    private int z;
    private float yaw;
    private float pitch;

    private MapDTO map;
    private BedLocationDTO bedLocation;
    private LocationSelection locationSelection;

}
