package com.example.exemple74.ws.rest.provided.facade.chercheur;


import com.example.exemple74.bean.Inscription;
import com.example.exemple74.service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/chercheur/inscription")
public class InscriptionRestchercheur {

    @PostMapping("/")
    public int save(@RequestBody Inscription inscription) {
        return inscriptionService.save(inscription);
    }

    @GetMapping("/")
    public List<Inscription> findAll() {
        return inscriptionService.findAll();
    }

    @GetMapping("/apoge/{apoge}")
    public List<Inscription> findByStudentApoge(@PathVariable String apoge) {
        return inscriptionService.findByStudentApoge(apoge);
    }

    @GetMapping("/cne/{cne}")
    public List<Inscription> findByStudentCne(@PathVariable String cne) {
        return inscriptionService.findByStudentCne(cne);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return inscriptionService.deleteByCode(code);
    }

    @Autowired
    private InscriptionService inscriptionService;
}
