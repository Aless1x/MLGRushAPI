package de.minedesso.mlgrushapi.objects.model;

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

    @ManyToOne
    @JoinColumn(name = "mapId")
    private Map map;

    @OneToMany(mappedBy = "arena")
    private List<Game> games;

}
