package com.example.exemple74.service;

import com.example.exemple74.Dao.AnneScolaireDao;
import com.example.exemple74.bean.AnneScolaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnneScolaireService {
    public int save(AnneScolaire anneScolaire)
    {
        if(findByAnne(anneScolaire.getAnne())!=null) return -1;
        else {
            anneScolaireDao.save(anneScolaire);
            return 1;
        }
    }

    // you must provide the id
    public int update(AnneScolaire anneScolaire)
    {
        if(findByAnne(anneScolaire.getAnne())!=null) return -1;
        else {
            anneScolaireDao.save(anneScolaire);
            return 1;
        }
    }

    public AnneScolaire findByAnne(String anne) {
        return anneScolaireDao.findByAnne(anne);
    }

    @Transactional
    public int deleteByAnne(String anne) {
        return anneScolaireDao.deleteByAnne(anne);
    }

    public List<AnneScolaire> findAll() {
        return anneScolaireDao.findAll();
    }

    @Autowired
    private AnneScolaireDao anneScolaireDao;

}
