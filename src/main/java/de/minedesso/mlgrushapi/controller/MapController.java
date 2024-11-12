package de.minedesso.mlgrushapi.controller;

import de.minedesso.mlgrushapi.objects.dto.MapDTO;
import de.minedesso.mlgrushapi.objects.model.Map;
import de.minedesso.mlgrushapi.service.MapService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/mlgrush/api")
public class MapController {

    private final MapService mapService;

    @GetMapping("/get/map/list")
    public ResponseEntity<List<MapDTO>> getMapList() {
        return mapService.getMapList();
    }

    @PostMapping(value = "/save/map", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveMap(@RequestBody Map map) {

        return mapService.saveMap(map);
    }

    @PostMapping(value = "/delete/map", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteMap(@RequestBody String mapName) {
        return mapService.deleteMapByName(mapName);
    }

    @GetMapping("/get/map")
    public ResponseEntity<MapDTO> getMapByName(@RequestParam("mapName") String mapName) {
        return mapService.getMapByName(mapName);
    }

    @GetMapping("/get/exist/map")
    public ResponseEntity<Void> existsMap(@RequestParam("mapName") String mapName) {
        return mapService.existsMapByName(mapName);
    }

}
