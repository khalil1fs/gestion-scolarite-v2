package com.example.exemple74.service;


import com.example.exemple74.Dao.PaimentDao;
import com.example.exemple74.bean.AnneScolaire;
import com.example.exemple74.bean.Paiment;
import com.example.exemple74.bean.Student;
import com.example.exemple74.util.StringUtil;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaimentService {
    public int save(Paiment paiment)
    {
        Paiment paiment1 = findByPid(paiment.getPid());
        AnneScolaire anneScolaire = anneScolaireService.findByAnne(paiment.getAnneScolaire().getAnne());
        Student student1 = studentService.findByCne(paiment.getStudent().getCne());
        if(paiment1!=null) return -1;
        else if(anneScolaire==null) return -2;
        else if (student1==null) return -3;
        else {
            paiment.setAnneScolaire(anneScolaire);
            paiment.setStudent(student1);
            paiment.setPid("EE"+StringUtil.codeApogesIncrement());
            paimentDao.save(paiment);
         return 1;
        }
    }


    public Paiment findByPid(String pid) {
        return paimentDao.findByPid(pid);
    }


    public List<Paiment> findByStudentCne(String cne) {
        return paimentDao.findByStudentCne(cne);
    }

    public List<Paiment> findAll() {
        return paimentDao.findAll();
    }

    @Autowired
    private PaimentDao paimentDao;
    @Autowired
    private AnneScolaireService anneScolaireService;
    @Autowired
    private StudentService studentService;
}
