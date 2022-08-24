package com.apirest.app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = -3089386558123946392L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;
    private String surname;
    @Column(name = "mail",nullable = false, length = 50, unique = true)
    private String email;
    private Boolean enabled;

    public User() {
    }

    public User(String name, String surname, String email, Boolean enabled) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.enabled = enabled;
    }
}
