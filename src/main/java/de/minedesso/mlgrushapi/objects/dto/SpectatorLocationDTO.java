package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpectatorLocationDTO {

    private Integer spectatorId;
    private String worldName;
    private int x;
    private int y;
    private int z;
    private float yaw;
    private float pitch;

    private MapDTO map;

}
