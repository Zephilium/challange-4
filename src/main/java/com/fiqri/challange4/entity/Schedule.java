package com.fiqri.challange4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Schedule {
    @Id
    @Column(name = "schedule_id")
    private String scheduleId;

    @Column(name = "tanggal_tayang")
    private LocalDate tanggalTayang;

    @Column(name = "jam_mulai")
    private LocalTime jamMulai;

    @Column(name = "jam_selesai")
    private LocalTime jamSelesai;
}