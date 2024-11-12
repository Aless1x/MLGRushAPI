package de.minedesso.mlgrushapi.objects.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @JoinColumn(name = "arenaId")
    private Arena arena;

    @ManyToOne
    @JoinColumn(name = "winner")
    private PlayerStats winner;

    @ManyToOne
    @JoinColumn(name = "loser")
    private PlayerStats loser;

}
