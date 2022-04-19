package com.example.exemple74.service;

import com.example.exemple74.Dao.ModuleDao;
import com.example.exemple74.bean.*;
import com.example.exemple74.bean.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Date;
import java.util.List;

@Service
public class ModuleService {

    public int save(Module module)  {
        Prof prof = profService.findByCin(module.getProf().getCin());
        Niveau semester = niveauService.findBySemester(module.getNiveau().getSemester());
        Filiere filiere = filiereService.findByNom(module.getFiliere().getNom());
        AnneScolaire anneScolaire = anneScolaireService.findByAnne(module.getAnneScolaire().getAnne());

        if(prof==null) return -1;
        else if(semester==null) return -2;
        else if(filiere==null) return -3;
        else if(anneScolaire==null) return -4;
        else if(existModule(prepare(module.getNiveau().getSemester(),module.getFiliere().getNom(),module.getAnneScolaire().getAnne()),module.getNom())) return -5;
        else {
            module.setProf(prof);
            module.setNiveau(semester);
            module.setFiliere(filiere);
            module.setAnneScolaire(anneScolaire);

            module.setCode("M"+new Date().getTime());
            moduleDao.save(module);
            return 1;
        }
    }

    private boolean existModule(List<Module> modules,String subject) {
        for (Module module : modules) {
            if (module.getNom().equals(subject)) return true;
        }
        return false;
    }

    @Transactional
    public int deleteByCode(String code) {
        int i1 = deleteByFiliereNom(code);
        int i2 = deleteByAnneScolaireAnne(code);
        int i3 = deleteByProfCin(code);
        int i4 = deleteByNiveauSemester(code);
        int i5 = moduleDao.deleteByCode(code);
        return i1+i2+i3+i4+i5;
    }


    public List<Module> findAll() {
        return moduleDao.findAll();
    }

    public Module findByCode(String code) {
        return moduleDao.findByCode(code);
    }



    public List<Module> findByProfCin(String cin) {
        return moduleDao.findByProfCin(cin);
    }

    public List<Module> prepare(String semestre, String filiere, String anne) {
        return moduleDao.prepare(semestre, filiere, anne);
    }



    @Transactional
    public int deleteByProfCin(String cin) {
        return moduleDao.deleteByProfCin(cin);
    }

    @Transactional
    public int deleteByNiveauSemester(String semester) {
        return moduleDao.deleteByNiveauSemester(semester);
    }

    @Transactional
    public int deleteByAnneScolaireAnne(String anne) {
        return moduleDao.deleteByAnneScolaireAnne(anne);
    }

    @Transactional
    public int deleteByFiliereNom(String nom) {
        return moduleDao.deleteByFiliereNom(nom);
    }

    @Autowired
    private ModuleDao moduleDao;

    @Autowired
    private  ProfService profService;

    @Autowired
    private FiliereService filiereService;
    @Autowired
    private NiveauService niveauService;
    @Autowired
    private AnneScolaireService anneScolaireService;
    
    
}
