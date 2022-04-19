package com.example.exemple74.service;

import com.example.exemple74.Dao.FiliereDao;
import com.example.exemple74.bean.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FiliereService {
    public  int save(Filiere filiere) {
        if(findByNom(filiere.getNom())!=null) return -1;
        else{
            filiereDao.save(filiere);
            return 1;
        }
    }

    public int update(Filiere filiere)
    {
        Filiere filiere1 = findByNom(filiere.getNom());
        if(filiere1!=null) return -1;
        else {
            filiereDao.save(filiere);
            return 1;
        }
    }

    public Filiere findByNom(String nom) {
        return filiereDao.findByNom(nom);
    }

    @Transactional
    public int deleteByNom(String nom) {
        return filiereDao.deleteByNom(nom);
    }

    public List<Filiere> findAll() {
        return filiereDao.findAll();
    }

    @Autowired
    private FiliereDao filiereDao;
}
