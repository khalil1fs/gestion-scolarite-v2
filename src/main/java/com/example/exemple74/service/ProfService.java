package com.example.exemple74.service;

import com.example.exemple74.Dao.ProfDao;
import com.example.exemple74.bean.Department;
import com.example.exemple74.bean.Prof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ProfService {

    public int save(Prof prof)
    {
        Department department = departmentService.findByName(prof.getDepartment().getName());
        if(findByCin(prof.getCin())!=null) return -1;
       else if(department==null) return -1;

        else {
            prof.setDateStartWork(new Date());
            prof.setDepartment(department);
            profDao.save(prof);
            return 1;
        }
    }

    public Prof findByCin(String cin) {
        return profDao.findByCin(cin);
    }

    @Transactional
    public int deleteByCin(String cin) {
        int x = deleteByDepartmentName(cin);
        int y = profDao.deleteByCin(cin);
        return x + y;
    }


    public List<Prof> findAll() {
        return profDao.findAll();
    }

    @Transactional
    public int deleteByDepartmentName(String name) {
        return profDao.deleteByDepartmentName(name);
    }

    @Autowired
    private ProfDao profDao;
    @Autowired
    private DepartmentService departmentService;
}
