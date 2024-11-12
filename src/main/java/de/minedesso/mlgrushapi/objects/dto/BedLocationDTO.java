package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BedLocationDTO {

    private Integer bedId;
    private String worldName;
    private int x1;
    private int y1;
    private int z1;
    private int x2;
    private int y2;
    private int z2;

    private TeamLocationDTO teamLocation;

}
