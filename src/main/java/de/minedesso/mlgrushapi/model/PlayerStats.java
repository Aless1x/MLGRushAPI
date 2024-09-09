package de.minedesso.mlgrushapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlayerStats {

    @Id
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

}
