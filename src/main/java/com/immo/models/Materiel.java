package com.immo.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "material")
public class Materiel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reference", length = 50, unique = true)
    private String reference;
    @Column(name = "libelle", length = 50)
    private String libelle;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;
    @Lob
    @Column(name = "description", length = 250)
    private String description;

    @ManyToOne
    @JoinColumn(name = "bureauId")
    private Bureau bureau;

    @ManyToOne
    @JoinColumn(name = "typeMaterialId")
    private TypeMaterial typeMaterial;
}
