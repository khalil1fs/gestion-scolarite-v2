package com.example.exemple74.ws.rest.provided.vo;


import javax.persistence.*;
import java.util.List;


public class ModuleVo {

    private String id;
    private String code;
    private String nom;
    private ProfVo profVo;
    private AnneScolaireVo anneScolaireVo;
    private FiliereVo filiereVo;
    private NiveauVo niveauVo;
    private List<NoteVo> notesVo;

}
