package com.immo.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "typeMaterial")
public class TypeMaterial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reference", length = 50, unique = true)
    private String reference;
    @Column(name = "libelle", length = 90)
    private String libelle;

}
