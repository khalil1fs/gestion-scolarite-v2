package com.example.exemple74.Dao;


import com.example.exemple74.bean.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscriptionDao extends JpaRepository<Inscription,Long> {

    List<Inscription> findByStudentApoge(String apoge);

    List<Inscription> findByStudentCne(String cne);

    int deleteByCode(String code);

    int deleteByNiveauSemester(String semester);
    int deleteByStudentCne(String cne);
    int deleteByAnneScolaireAnne(String anne);
    int deleteByFiliereNom(String nom);
}
