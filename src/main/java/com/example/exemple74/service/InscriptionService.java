package com.example.exemple74.service;


import com.example.exemple74.Dao.InscriptionDao;
import com.example.exemple74.bean.*;
import com.example.exemple74.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class InscriptionService {

    public int save(Inscription inscription) {
        Student student =  studentService.findByCne(inscription.getStudent().getCne());
        Niveau niveau = niveauService.findBySemester(inscription.getNiveau().getSemester());
        Filiere filiere = filiereService.findByNom(inscription.getFiliere().getNom());
        AnneScolaire anneScolaire = anneScolaireService.findByAnne(inscription.getAnneScolaire().getAnne());

        if(student == null) return -1;
        else if(niveau == null) return -2;
        else if(filiere == null) return -3;
        else if(anneScolaire == null) return -4;
        else if(!student.getActive()) return -5;
        else if(prepare(findByStudentApoge(student.getApoge()),inscription)) return -6;
        else {
            inscription.setDateInscription(new Date());
            inscription.setCode("I"+ StringUtil.codeApogesIncrement());
            inscription.setNiveau(niveau);
            inscription.setFiliere(filiere);
            inscription.setAnneScolaire(anneScolaire);
            inscription.setStudent(student);
            inscriptionDao.save(inscription);
            return 1;
        }
    }

    private boolean prepare(List<Inscription> inscriptions,Inscription inscription)
    {
        for (Inscription inscription1 : inscriptions) {
              if(inscription1.getAnneScolaire().getAnne().equals(inscription.getAnneScolaire().getAnne()) &&
                    inscription1.getFiliere().getNom().equals(inscription.getFiliere().getNom()) &&
                    inscription1.getNiveau().getSemester().equals(inscription.getNiveau().getSemester())
            ) return true;
        }
        return false;
    }

    public List<Inscription> findByStudentApoge(String apoge) {
        return inscriptionDao.findByStudentApoge(apoge);
    }

    public List<Inscription> findByStudentCne(String cne) {
        return inscriptionDao.findByStudentCne(cne);
    }

    public List<Inscription> findAll() {
        return inscriptionDao.findAll();
    }


    @Transactional
    public int deleteByCode(String code) {
        int i1 = deleteByFiliereNom(code);
        int i2 = deleteByAnneScolaireAnne(code);
        int i3 = deleteByNiveauSemester(code);
        int i4 = deleteByStudentCne(code);
        int i5 = inscriptionDao.deleteByCode(code);
        return i1+i2+i3+i4+i5;
    }

    public int deleteByNiveauSemester(String semester) {
        return inscriptionDao.deleteByNiveauSemester(semester);
    }

    public int deleteByStudentCne(String cne) {
        return inscriptionDao.deleteByStudentCne(cne);
    }

    public int deleteByAnneScolaireAnne(String anne) {
        return inscriptionDao.deleteByAnneScolaireAnne(anne);
    }

    public int deleteByFiliereNom(String nom) {
        return inscriptionDao.deleteByFiliereNom(nom);
    }

    @Autowired
    private InscriptionDao inscriptionDao;
    @Autowired
    private StudentService studentService;
    @Autowired
    private FiliereService filiereService;
    @Autowired
    private NiveauService niveauService;
    @Autowired
    private AnneScolaireService anneScolaireService;


}
