package com.fiqri.challange4.service;

import com.fiqri.challange4.entity.Film;

public interface FilmService {
    Film addFilm(Film film);

    void updateFilm(Film film);

    void deleteFilm(String filmCode);
}
