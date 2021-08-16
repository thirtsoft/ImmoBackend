package com.immo.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bureau")
public class Bureau implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reference", length = 50, unique = true)
    private String reference;
    @Column(name = "libelle", length = 50)
    private String libelle;
    @Column(name = "nombreBureau", length = 10)
    private int nombreMaterial;

    @ManyToOne
    @JoinColumn(name = "batId")
    private Batiment batiment;
}
