package com.fiqri.challange4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Getter
@Setter
@IdClass(SeatId.class)
public class Seat {
    @Id
    private String studio;
    @Id
    private String no;
}
