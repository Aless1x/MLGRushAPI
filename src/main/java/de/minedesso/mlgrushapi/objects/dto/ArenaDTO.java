package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArenaDTO {

        private Integer arenaId;
        private String arenaName;

        private MapDTO map;
        private List<GameDTO> games;
}
