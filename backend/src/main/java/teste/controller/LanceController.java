package teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teste.domain.Lance;
import teste.service.LanceService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "lances")
public class LanceController {

    @Autowired
    private LanceService lanceService;

    private List<Lance> lances = new ArrayList<>();

    @GetMapping(path = "/nomes/")
    public ResponseEntity<List<Lance>> getNome() {
        lanceService.print();
        return ResponseEntity.ok(lances);
    }

    @PostMapping(path = "/nomes/")
    public void postNome(@RequestBody Lance lance) {
        lances.add(lance);
    }
}
