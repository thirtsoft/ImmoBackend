package com.immo.models;

import com.immo.enums.Role;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "utilisateur", uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")
})
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "username", length = 90)
    private String username;

    @Column(name = "mobile", length = 60)
    private String mobile;

    @Column(name = "email", length = 90)
    private String email;

    @Column(name = "photo", length = 90)
    private String photo;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name = "activated")
    private final boolean activated = false;

    @Column(name = "password", length = 80)
    private String password;

    @Column(name = "accountVerified")
    private boolean accountVerified;

    @Enumerated(EnumType.STRING)
    private Role role;

}
