package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class GameDTO {

    private Integer gameId;
    private LocalDateTime startTime;

    private ArenaDTO arena;
    private PlayerStatsDTO winner;
    private PlayerStatsDTO loser;

}
