package com.fiqri.challange4.service;

import com.fiqri.challange4.entity.Film;
import com.fiqri.challange4.entity.Schedule;

import java.util.List;

public interface FilmService {
    Film addFilm(Film film);

    void updateFilm(Film film);

    void deleteFilm(String filmCode);

    List<String> sedangTayang();

    List<Schedule> jadwalFilm(String filmCode);

}
