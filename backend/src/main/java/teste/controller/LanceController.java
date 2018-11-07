package teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teste.service.LanceService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "lances")
public class LanceController {

    @Autowired
    private LanceService lanceService;

    private List<String> nomes = new ArrayList<>();

    @GetMapping(path = "/nomes/")
    public List<String> getNome() {
        lanceService.print();
        return nomes;
    }

    @PostMapping(path = "/nomes/")
    public void postNome(@RequestBody String nome) {
        nomes.add(nome);
    }
}
