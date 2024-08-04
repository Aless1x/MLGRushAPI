package de.minedesso.mlgrushapi.model;

import de.minedesso.mlgrushapi.common.LocationSelection;
import jakarta.persistence.*;

@Entity
public class TeamLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer teamId;
    private int x;
    private int y;
    private int z;
    private float yaw;
    private float pitch;
    @OneToOne
    private BedLocation bedLocation;
    @Enumerated(EnumType.STRING)
    private LocationSelection locationSelection;
}
