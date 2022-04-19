package com.example.exemple74.Dao;

import com.example.exemple74.bean.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NiveauDao  extends JpaRepository<Niveau,Long> {
    Niveau findBySemester(String semester);
    int deleteBySemester(String semester);

//    int deleteByPromoCode(String code);
//    List<Niveau> findByPromoCode(String code);


}
