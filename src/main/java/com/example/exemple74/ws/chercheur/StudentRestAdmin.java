package com.example.exemple74.ws.chercheur;

import com.example.exemple74.bean.Student;
import com.example.exemple74.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/student")
public class StudentRestAdmin {

    @PostMapping("/")
    public int save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @PutMapping("/")
    public int update(@RequestBody Student student) {
        return studentService.update(student);
    }

    @GetMapping("/cne/{cne}")
    public Student findByCne(@PathVariable String cne) {
        return studentService.findByCne(cne);
    }

//    @GetMapping("/apoge/{apoge}")
//    public Student findByApoge(@PathVariable String apoge) {
//        return studentService.findByApoge(apoge);
//    }

    @DeleteMapping("/cne/{cne}")
    public int deleteByCne(@PathVariable String cne) {
        return studentService.deleteByCne(cne);
    }

    @GetMapping("/apoge/{apoge}")
    public List<Student> findByApogeLike(@PathVariable String apoges) {
        return studentService.findByApogeLike(apoges);
    }

    @Autowired
    private StudentService studentService;
}
