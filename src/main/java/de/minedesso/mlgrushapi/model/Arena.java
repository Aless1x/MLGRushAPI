package de.minedesso.mlgrushapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Arena {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer arenaId;
    private String arenaName;
    @OneToMany
    @JoinColumn(name = "arenaId")
    private List<Game> games;

}
