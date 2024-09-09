package de.minedesso.mlgrushapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SpectatorLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer spectatorId;
    private String worldName;
    private int x;
    private int y;
    private int z;
    private float yaw;
    private float pitch;

}
