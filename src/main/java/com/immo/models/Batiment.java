package com.immo.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "batiment")
@AllArgsConstructor
@NoArgsConstructor
public class Batiment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reference", length = 50, unique = true)
    private String reference;
    @Column(name = "libelle", length = 50)
    private String libelle;
    @Column(name = "nombreBureau", length = 10)
    private int nombreBureau;

}
