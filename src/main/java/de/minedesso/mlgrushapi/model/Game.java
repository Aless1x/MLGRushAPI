package de.minedesso.mlgrushapi.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Game {

    @Id
    private Integer gameId;
    private LocalDateTime startTime;
    @ManyToOne
    @JoinColumn(name = "winner")
    private PlayerStats winner;
    @ManyToOne
    @JoinColumn(name = "loser")
    private PlayerStats loser;

}
