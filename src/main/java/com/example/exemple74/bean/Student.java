package com.example.exemple74.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String apoge;
    private String cne;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String city;
    private String country;
    private Boolean active;
    private String gender;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    @OneToMany(mappedBy = "student")
    private List<Inscription> inscriptions;

    @OneToMany(mappedBy = "student")
    private List<Paiment> paiments;

    @OneToMany(mappedBy = "student")
    private List<Note> notes;



}
