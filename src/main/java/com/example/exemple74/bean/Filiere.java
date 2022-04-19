package com.example.exemple74.bean;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Filiere implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "filiere")
    private List<Inscription> inscriptions;

    @OneToMany(mappedBy = "filiere")
    private List<Module> modules;
}
