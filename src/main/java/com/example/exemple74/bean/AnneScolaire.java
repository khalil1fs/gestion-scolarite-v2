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
public class AnneScolaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String anne;

    @OneToMany(mappedBy = "anneScolaire")
    private List<Inscription> inscriptions;

    @OneToMany(mappedBy = "anneScolaire")
    private List<Module> modules;


    @OneToMany(mappedBy = "anneScolaire")
    private List<Paiment> paiments;


}
