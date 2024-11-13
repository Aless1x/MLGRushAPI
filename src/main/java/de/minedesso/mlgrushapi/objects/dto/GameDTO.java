package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
@Setter
public class GameDTO {

    private final Integer gameId;
    private final LocalDateTime startTime;

    private ArenaDTO arena;
    private PlayerStatsDTO winner;
    private PlayerStatsDTO loser;

}
