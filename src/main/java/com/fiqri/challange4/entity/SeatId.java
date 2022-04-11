package com.fiqri.challange4.entity;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SeatId implements Serializable {
    private String studio;
    private String no;

    public SeatId(String studio, String no) {
        this.studio = studio;
        this.no = no;
    }


}
