package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class BedLocationDTO {

    private final Integer bedId;
    private final String worldName;
    private final int x1;
    private final int y1;
    private final int z1;
    private final int x2;
    private final int y2;
    private final int z2;

    private TeamLocationDTO teamLocation;

}
