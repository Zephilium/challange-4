package com.fiqri.challange4.service;

import com.fiqri.challange4.entity.Film;
import com.fiqri.challange4.entity.Schedule;
import com.fiqri.challange4.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepository filmRepository;

    @Override
    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public void updateFilm(Film film) {
        filmRepository.save(film);
    }

    @Override
    public void deleteFilm(String filmCode) {
        filmRepository.deleteById(filmCode);
    }

    @Override
    public List<String> sedangTayang() {
        return filmRepository.sedangTayang();
    }

    @Override
    public List<Schedule> jadwalFilm(String filmCode) {
        return filmRepository.jadwalFilm(filmCode);
    }

}
