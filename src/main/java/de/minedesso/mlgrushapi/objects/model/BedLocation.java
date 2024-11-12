package de.minedesso.mlgrushapi.objects.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BedLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bedId;
    private String worldName;
    private int x1;
    private int y1;
    private int z1;
    private int x2;
    private int y2;
    private int z2;

    @OneToOne
    @JoinColumn(name = "teamId")
    private TeamLocation teamLocation;

}
