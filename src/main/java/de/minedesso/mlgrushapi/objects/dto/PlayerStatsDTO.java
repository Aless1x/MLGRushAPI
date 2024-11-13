package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Getter
@Setter
public class PlayerStatsDTO {

    private final UUID playerId;
    private final int wins;
    private final int losses;
    private final int kills;
    private final int deaths;
    private final int playedGames;
    private final int bedsDestroyed;
    private final int bedsLost;
    private final int blocksPlaced;
    private final int blocksBroken;
    private final int itemsBought;
    private final int itemsDropped;
    private final int stickSlot;
    private final int pickAxeSlot;
    private final int blockSlot;

    private List<GameDTO> wonGames;
    private List<GameDTO> lostGames;

}
