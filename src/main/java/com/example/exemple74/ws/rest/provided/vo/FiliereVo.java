package com.example.exemple74.ws.rest.provided.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


public class FiliereVo {
    private String id;
    private String nom;
    private List<InscriptionVo> inscriptionsVo;
    private List<ModuleVo> modules;
}
