package de.minedesso.mlgrushapi.controller;

import de.minedesso.mlgrushapi.model.Map;
import de.minedesso.mlgrushapi.service.MapService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class MapController {

    private final MapService mapService;

    @GetMapping("/get/map/list")
    public ResponseEntity<List<Map>> getMapList() {
        return mapService.getMapList();
    }

}
