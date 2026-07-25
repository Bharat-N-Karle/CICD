package com.yumcart.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "login")
@EqualsAndHashCode(callSuper = true)
public class Login extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;
}
