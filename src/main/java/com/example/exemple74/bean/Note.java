package com.example.exemple74.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Note implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nombreAbsenceTotal;
    private int nombreAbsenceJustifier;
    private BigDecimal resultat;

    @ManyToOne
    private Module module;
    @ManyToOne
    private Student student;


}
