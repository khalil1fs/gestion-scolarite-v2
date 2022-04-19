package com.example.exemple74.service;

import com.example.exemple74.Dao.NiveauDao;
import com.example.exemple74.bean.Niveau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NiveauService {
    public int save(Niveau niveau) {
        if(findBySemester(niveau.getSemester())!=null) return -1;
        else{
            niveauDao.save(niveau);
            return 1;
        }
    }

    public int update(Niveau niveau) {
        Niveau entity = findBySemester(niveau.getSemester());
        if (entity != null) {
            return -1;
        }else{
         niveauDao.save(niveau);
         return 1;
        }
    }

    public Niveau findBySemester(String semester) {
        return niveauDao.findBySemester(semester);
    }
    @Transactional
    public int deleteBySemester(String semester) {
        return niveauDao.deleteBySemester(semester);
    }


    public List<Niveau> findAll() {
        return niveauDao.findAll();
    }

    @Autowired
    private NiveauDao niveauDao;
}
