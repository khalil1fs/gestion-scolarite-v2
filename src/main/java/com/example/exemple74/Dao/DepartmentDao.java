package com.example.exemple74.Dao;


import com.example.exemple74.bean.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends JpaRepository<Department,Long> {
    Department findByName(String name);
    int deleteByName(String name);
}
