package com.example.exemple74.ws.chercheur;

import com.example.exemple74.bean.Department;
import com.example.exemple74.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/department")
public class DepartmentRestAdmin {

    @PostMapping("/")
    public int save(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @GetMapping("/")
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @PutMapping("/")
    public int update(@RequestBody Department department) {
        return departmentService.update(department);
    }

    @GetMapping("/name/{name}")
    public Department findByName(@PathVariable String name) {
        return departmentService.findByName(name);
    }

    @DeleteMapping("/name/{name}")
    public int deleteByName(@PathVariable String name) {
        return departmentService.deleteByName(name);
    }


    @Autowired
    private DepartmentService departmentService;
}
