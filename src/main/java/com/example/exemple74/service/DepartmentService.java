package com.example.exemple74.service;

import com.example.exemple74.Dao.DepartmentDao;
import com.example.exemple74.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentService {

    public int save(Department department) {
        Department entity = findByName(department.getName());
        if (entity != null) {
            return -1;
        }
        else {
           departmentDao.save(department);
           return 1;
        }
    }

    public int update(Department department){
        Department department1 = findByName(department.getName());
        if(department1!=null) return -1;
        else{
            departmentDao.save(department);
            return 1;
        }
    }

    public Department findByName(String name) {
        return departmentDao.findByName(name);
    }

    @Transactional
    public int deleteByName(String name) {
        return departmentDao.deleteByName(name);
    }

    public List<Department> findAll() {
        return departmentDao.findAll();
    }

    @Autowired
    private DepartmentDao departmentDao;


}
