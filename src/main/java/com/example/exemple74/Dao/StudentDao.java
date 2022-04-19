package com.example.exemple74.Dao;

import com.example.exemple74.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface StudentDao  extends JpaRepository<Student,Long> {

    @Query("SELECT c FROM StudentVo c WHERE 1=1 order by c.id desc ")
    List<Student> findAll();
    Student findByCne(String cne);
    Student findByApoge(String apoge);

    List<Student> findByApogeLike(String apoges);
    int deleteByCne(String cne);

}
