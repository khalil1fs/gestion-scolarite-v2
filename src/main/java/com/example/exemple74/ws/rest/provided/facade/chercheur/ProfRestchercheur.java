package com.example.exemple74.ws.rest.provided.facade.chercheur;

import com.example.exemple74.bean.Prof;
import com.example.exemple74.service.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/chercheur/prof")
public class ProfRestchercheur {

    @PostMapping("/")
    public int save(@RequestBody Prof prof) {
        return profService.save(prof);
    }

    @GetMapping("/")
    public List<Prof> findAll() {
        return profService.findAll();
    }

    @GetMapping("/cin/{cin}")
    public Prof findByCin(@PathVariable String cin) {
        return profService.findByCin(cin);
    }

    @DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return profService.deleteByCin(cin);
    }

    @Autowired
    private ProfService profService;
}
