package com.example.exemple74.ws.admin;

import com.example.exemple74.bean.Paiment;
import com.example.exemple74.service.PaimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/paiment")
public class PaimentRestAdmin {

    @PostMapping("/")
    public int save(@RequestBody Paiment paiment) {
        return paimentService.save(paiment);
    }

    @GetMapping("/pid/{pid}")
    public Paiment findByPid(@PathVariable String pid) {
        return paimentService.findByPid(pid);
    }

    @GetMapping("/student/cne/{cne}")
    public List<Paiment> findByStudentCne(@PathVariable String cne) {
        return paimentService.findByStudentCne(cne);
    }

    @GetMapping("/")
    public List<Paiment> findAll() {
        return paimentService.findAll();
    }

    @Autowired
    private PaimentService paimentService;
}
