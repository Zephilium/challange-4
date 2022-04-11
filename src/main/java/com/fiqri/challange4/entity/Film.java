package com.fiqri.challange4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Film {
    @Id
    @Column(name = "film_code")
    private String filmCode;

    @Column(name = "film_name")
    private String filmName;

    @Column(name = "tayang")
    private String tayang;

    @OneToMany(targetEntity = Schedule.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "film_code", referencedColumnName = "film_code")
    private List<Schedule> jadwal;

}
