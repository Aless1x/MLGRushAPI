package de.minedesso.mlgrushapi.objects.mapper;

import de.minedesso.mlgrushapi.objects.dto.GameDTO;
import de.minedesso.mlgrushapi.objects.dto.PlayerStatsDTO;
import de.minedesso.mlgrushapi.objects.model.PlayerStats;

import java.util.List;

public class PlayerStatsMapper {

    public static PlayerStatsDTO toPlayerStatsDTO(PlayerStats playerStats) {
        if(playerStats == null) return null;

        PlayerStatsDTO playerStatsDTO = toPlayerStatsLightDTO(playerStats);

        List<GameDTO> wonGames = playerStats.getWonGames().stream().map(GameMapper::toGameLightDTO).toList();
        playerStatsDTO.setWonGames(wonGames);

        List<GameDTO> lostGames = playerStats.getLostGames().stream().map(GameMapper::toGameLightDTO).toList();
        playerStatsDTO.setLostGames(lostGames);

        return playerStatsDTO;
    }

    public static PlayerStatsDTO toPlayerStatsLightDTO(PlayerStats playerStats) {
        if(playerStats == null) return null;

        return new PlayerStatsDTO(playerStats.getPlayerId(),
                playerStats.getWins(),
                playerStats.getLosses(),
                playerStats.getKills(),
                playerStats.getDeaths(),
                playerStats.getPlayedGames(),
                playerStats.getBedsDestroyed(),
                playerStats.getBedsLost(),
                playerStats.getBlocksPlaced(),
                playerStats.getBlocksBroken(),
                playerStats.getItemsBought(),
                playerStats.getItemsDropped(),
                playerStats.getStickSlot(),
                playerStats.getPickAxeSlot(),
                playerStats.getBlockSlot());
    }

}
