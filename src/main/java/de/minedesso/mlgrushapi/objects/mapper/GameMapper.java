package de.minedesso.mlgrushapi.objects.mapper;

import de.minedesso.mlgrushapi.objects.dto.GameDTO;
import de.minedesso.mlgrushapi.objects.model.Game;

public class GameMapper {

    public static GameDTO toGameDTO(Game game) {
        if (game == null) return null;

        GameDTO gameDTO = toGameLightDTO(game);

        gameDTO.setArena(ArenaMapper.toArenaLightDTO(game.getArena()));
        gameDTO.setWinner(PlayerStatsMapper.toPlayerStatsLightDTO(game.getWinner()));
        gameDTO.setLoser(PlayerStatsMapper.toPlayerStatsLightDTO(game.getLoser()));

        return gameDTO;
    }

    public static GameDTO toGameLightDTO(Game game) {
        if (game == null) return null;

        return new GameDTO(game.getGameId(), game.getStartTime());
    }

}
