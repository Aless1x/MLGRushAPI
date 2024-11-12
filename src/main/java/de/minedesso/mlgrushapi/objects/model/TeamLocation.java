package de.minedesso.mlgrushapi.objects.model;

import de.minedesso.mlgrushapi.common.LocationSelection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeamLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer teamId;
    private String worldName;
    private int x;
    private int y;
    private int z;
    private float yaw;
    private float pitch;

    @ManyToOne
    @JoinColumn(name = "mapId")
    private Map map;

    @OneToOne(mappedBy = "teamLocation")
    private BedLocation bedLocation;

    @Enumerated(EnumType.STRING)
    private LocationSelection locationSelection;
}
