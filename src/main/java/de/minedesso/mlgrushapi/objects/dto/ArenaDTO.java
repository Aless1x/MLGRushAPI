package de.minedesso.mlgrushapi.objects.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class ArenaDTO {

        private final Integer arenaId;
        private final String arenaName;

        private MapDTO map;
        private List<GameDTO> games;
}
