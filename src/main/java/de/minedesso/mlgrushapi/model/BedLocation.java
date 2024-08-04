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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BedLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bedId;
    private int x1;
    private int y1;
    private int z1;
    private int x2;
    private int y2;
    private int z2;

}
