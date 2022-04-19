package com.example.exemple74.ws.rest.provided.facade.admin;

import com.example.exemple74.bean.Prof;
import com.example.exemple74.service.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/prof")
public class ProfRestAdmin {

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
