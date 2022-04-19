package com.example.exemple74.Dao;

import com.example.exemple74.bean.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleDao extends JpaRepository<Module,Long> {
    Module findByCode(String code);

    @Query("SELECT c FROM Module c WHERE c.niveau.semester=:semestre AND c.filiere.nom=:filiere AND c.anneScolaire.anne=:anne")
    List<Module> prepare(@Param("semestre") String semestre,@Param("filiere") String filiere,@Param("anne") String anne);

    List<Module> findByProfCin(String cin);

    int deleteByCode(String code);

    int deleteByProfCin(String cin);

    int deleteByNiveauSemester(String semester);

    int deleteByAnneScolaireAnne(String anne);

    int deleteByFiliereNom(String nom);

}
