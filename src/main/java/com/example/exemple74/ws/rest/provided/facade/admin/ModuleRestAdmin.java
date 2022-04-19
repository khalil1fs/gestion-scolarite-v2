package com.example.exemple74.ws.rest.provided.facade.admin;


import com.example.exemple74.bean.Module;
import com.example.exemple74.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/module")
public class ModuleRestAdmin {

    @PostMapping("/")
    public int save(@RequestBody Module module) {
        return moduleService.save(module);
    }

    @GetMapping("/")
    public List<Module> findAll() {
        return moduleService.findAll();
    }

    @GetMapping("/code/{code}")
    public Module findByCode(@PathVariable String code) {
        return moduleService.findByCode(code);
    }

    @GetMapping("/find-prof-module/{cin}")
    public List<Module> findByProfCin(@PathVariable String cin) {
        return moduleService.findByProfCin(cin);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return moduleService.deleteByCode(code);
    }

    @Autowired
    private ModuleService moduleService;
}
