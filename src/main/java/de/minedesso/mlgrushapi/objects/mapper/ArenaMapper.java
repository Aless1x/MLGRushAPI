package de.minedesso.mlgrushapi.objects.mapper;

import de.minedesso.mlgrushapi.objects.dto.ArenaDTO;
import de.minedesso.mlgrushapi.objects.dto.GameDTO;
import de.minedesso.mlgrushapi.objects.model.Arena;

import java.util.List;

public class ArenaMapper {

    public static ArenaDTO toArenaDTO(Arena arena) {
        if(arena == null) return null;

        ArenaDTO arenaDTO = toArenaLightDTO(arena);

        arenaDTO.setMap(MapMapper.toMapLightDTO(arena.getMap()));

        List<GameDTO> games = arena.getGames().stream().map(GameMapper::toGameLightDTO).toList();
        arenaDTO.setGames(games);

        return arenaDTO;
    }

    public static ArenaDTO toArenaLightDTO(Arena arena) {
        if(arena == null) return null;

        return new ArenaDTO(arena.getArenaId(), arena.getArenaName());
    }

}
