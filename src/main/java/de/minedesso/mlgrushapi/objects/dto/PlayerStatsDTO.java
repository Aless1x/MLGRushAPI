package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class PlayerStatsDTO {

    private UUID playerId;
    private int wins;
    private int losses;
    private int kills;
    private int deaths;
    private int playedGames;
    private int bedsDestroyed;
    private int bedsLost;
    private int blocksPlaced;
    private int blocksBroken;
    private int itemsBought;
    private int itemsDropped;
    private int stickSlot;
    private int pickAxeSlot;
    private int blockSlot;

    private List<GameDTO> wonGames;
    private List<GameDTO> lostGames;

}
