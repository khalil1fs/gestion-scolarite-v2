package com.example.exemple74.Dao;

import com.example.exemple74.bean.Prof;
import com.example.exemple74.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfDao  extends JpaRepository<Prof,Long> {
    Prof findByCin(String cin);

    @Query("SELECT c FROM ProfVo c WHERE 1=1 order by c.id desc ")
    List<Prof> findAll();

    int deleteByCin(String cin);
    int deleteByDepartmentName(String name);
}
