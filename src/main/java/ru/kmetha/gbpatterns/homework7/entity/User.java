package ru.kmetha.gbpatterns.homework7.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
}
