package com.fiqri.challange4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    private String username;
    private String email;
    private String password;
}
