package com.example.exemple74.Dao;

import com.example.exemple74.bean.AnneScolaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnneScolaireDao  extends JpaRepository<AnneScolaire,Long> {
    AnneScolaire findByAnne(String anne);
    int deleteByAnne(String anne);

}
