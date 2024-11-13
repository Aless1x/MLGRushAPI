package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class SpectatorLocationDTO {

    private final Integer spectatorId;
    private final String worldName;
    private final int x;
    private final int y;
    private final int z;
    private final float yaw;
    private final float pitch;

    private MapDTO map;

}
