package com.example.exemple74.ws.chercheur;


import com.example.exemple74.bean.Filiere;
import com.example.exemple74.service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*   filiere ca marche   */

@RestController
@RequestMapping("api/admin/filiere")
public class FiliereRestAdmin {

    @PostMapping("/")
    public int save(@RequestBody Filiere filiere) {
        return filiereService.save(filiere);
    }

    @GetMapping("/")
    public List<Filiere> findAll() {
        return filiereService.findAll();
    }

    @PutMapping("/")
    public int update(@RequestBody Filiere filiere) {
        return filiereService.update(filiere);
    }

    @GetMapping("/nom/{nom}")
    public Filiere findByNom(@PathVariable String nom) {
        return filiereService.findByNom(nom);
    }

    @DeleteMapping("/nom/{nom}")
    public int deleteByNom(@PathVariable String nom) {
        return filiereService.deleteByNom(nom);
    }


    @Autowired
    private FiliereService filiereService;


}
