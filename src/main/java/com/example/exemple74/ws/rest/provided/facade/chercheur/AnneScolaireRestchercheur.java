package com.example.exemple74.ws.rest.provided.facade.chercheur;


import com.example.exemple74.bean.AnneScolaire;
import com.example.exemple74.service.AnneScolaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/chercheur/anne-acolaire")
public class AnneScolaireRestchercheur {

    @PostMapping("/")
    public int save(@RequestBody AnneScolaire anneScolaire) {
        return anneScolaireService.save(anneScolaire);
    }

    @GetMapping("/")
    public List<AnneScolaire> findAll() {
        return anneScolaireService.findAll();
    }

    @GetMapping("/anne/{anne}")
    public AnneScolaire findByAnne(@PathVariable String anne) {
        return anneScolaireService.findByAnne(anne);
    }

    @DeleteMapping("/anne/{anne}")
    public int deleteByAnne(@PathVariable String anne) {
        return anneScolaireService.deleteByAnne(anne);
    }

    @PutMapping("/")
    public int update(@RequestBody AnneScolaire anneScolaire) {
        return anneScolaireService.update(anneScolaire);
    }

    @Autowired
    private AnneScolaireService anneScolaireService;
}
