package de.minedesso.mlgrushapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
