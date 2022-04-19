package com.example.exemple74.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Module implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String nom;

    @ManyToOne
    private Prof prof;
    @ManyToOne
    private AnneScolaire anneScolaire;
    @ManyToOne
    private Filiere filiere;
    @ManyToOne
    private Niveau niveau;

    @OneToMany(mappedBy = "module")
    private List<Note> notes;



}
