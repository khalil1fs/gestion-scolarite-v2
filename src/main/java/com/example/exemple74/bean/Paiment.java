package com.example.exemple74.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Paiment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pid;
    private String mois;
    private Double montant;
    private String type;  // cheque,especes

    @ManyToOne
    private AnneScolaire anneScolaire;

    @ManyToOne
    private Student student;


}
