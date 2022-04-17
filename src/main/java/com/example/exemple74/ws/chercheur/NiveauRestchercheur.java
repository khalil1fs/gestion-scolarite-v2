package com.example.exemple74.ws.chercheur;


import com.example.exemple74.bean.Niveau;
import com.example.exemple74.service.NiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/chercheur/niveau")
public class NiveauRestchercheur {

    @PostMapping("/")
    public int save(@RequestBody Niveau niveau) {
        return niveauService.save(niveau);
    }

    @GetMapping("/")
    public List<Niveau> findAll() {
        return niveauService.findAll();
    }

    @PutMapping("/")
    public int update(@RequestBody Niveau niveau) {
        return niveauService.update(niveau);
    }

    @GetMapping("/semester/{semester}")
    public Niveau findBySemester(@PathVariable String semester) {
        return niveauService.findBySemester(semester);
    }

    @DeleteMapping("/semester/{semester}")
    public int deleteBySemester(@PathVariable String semester) {
        return niveauService.deleteBySemester(semester);
    }


    @Autowired
    private NiveauService niveauService;

}
