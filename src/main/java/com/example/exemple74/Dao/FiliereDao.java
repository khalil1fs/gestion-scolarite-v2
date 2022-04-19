package com.example.exemple74.Dao;

import com.example.exemple74.bean.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereDao extends JpaRepository<Filiere,Long> {
    Filiere findByNom(String nom);
    int deleteByNom(String nom);
}
