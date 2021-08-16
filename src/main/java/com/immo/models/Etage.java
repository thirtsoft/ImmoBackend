package com.immo.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "etage")
@AllArgsConstructor
@NoArgsConstructor
public class Etage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reference", length = 50, unique = true)
    private String reference;
    @Column(name = "numero", length = 50)
    private String numero;
    @Column(name = "nombreBureau", length = 10)
    private int nombreBureau;
}
