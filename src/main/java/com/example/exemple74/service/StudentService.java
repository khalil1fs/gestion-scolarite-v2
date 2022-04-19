package com.example.exemple74.service;

import com.example.exemple74.Dao.StudentDao;
import com.example.exemple74.bean.Student;
import com.example.exemple74.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    public int save(Student student) {
        if(findByCne(student.getCne())!=null) return -1;
        else if(findByApoge(student.getApoge())!=null) return -2;
        else {
            student.setActive(true);
            student.setApoge("E"+ StringUtil.codeApogesIncrement());
            studentDao.save(student);
            return 1;
        }
    }

    public int update(Student student){
        if(findByApoge(student.getApoge())==null) return -1;
        else {
            studentDao.save(student);
            return 1;
        }
    }

    public Student findByCne(String cne) {
        return studentDao.findByCne(cne);
    }

    public Student findByApoge(String apoge) {
        return studentDao.findByApoge(apoge);
    }

    @Transactional
    public int deleteByCne(String cne) {
        return studentDao.deleteByCne(cne);
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }

    public List<Student> findByApogeLike(String apoges) {
        return studentDao.findByApogeLike("%"+apoges+"%");
    }

    @Autowired
    private StudentDao studentDao;
}
