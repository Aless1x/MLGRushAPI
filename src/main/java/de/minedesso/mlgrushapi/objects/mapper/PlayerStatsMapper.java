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

        PlayerStatsDTO playerStatsDTO = new PlayerStatsDTO();
        playerStatsDTO.setPlayerId(playerStats.getPlayerId());
        playerStatsDTO.setWins(playerStats.getWins());
        playerStatsDTO.setLosses(playerStats.getLosses());
        playerStatsDTO.setKills(playerStats.getKills());
        playerStatsDTO.setDeaths(playerStats.getDeaths());
        playerStatsDTO.setPlayedGames(playerStats.getPlayedGames());
        playerStatsDTO.setBedsDestroyed(playerStats.getBedsDestroyed());
        playerStatsDTO.setBedsLost(playerStats.getBedsLost());
        playerStatsDTO.setBlocksPlaced(playerStats.getBlocksPlaced());
        playerStatsDTO.setBlocksBroken(playerStats.getBlocksBroken());
        playerStatsDTO.setItemsBought(playerStats.getItemsBought());
        playerStatsDTO.setItemsDropped(playerStats.getItemsDropped());
        playerStatsDTO.setStickSlot(playerStats.getStickSlot());
        playerStatsDTO.setPickAxeSlot(playerStats.getPickAxeSlot());
        playerStatsDTO.setBlockSlot(playerStats.getBlockSlot());
        return playerStatsDTO;
    }

}
