package com.example.exemple74.Dao;

import com.example.exemple74.bean.Paiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PaimentDao extends JpaRepository<Paiment,Long> {
    Paiment findByPid(String pid);

    List<Paiment> findByStudentCne(String cne);


}
