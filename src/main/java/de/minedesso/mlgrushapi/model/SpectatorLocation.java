package de.minedesso.mlgrushapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SpectatorLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer spectatorId;
    private int x;
    private int y;
    private int z;
    private float yaw;
    private float pitch;

}
