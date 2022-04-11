package com.fiqri.challange4.controller;

import com.fiqri.challange4.entity.Film;
import com.fiqri.challange4.entity.Schedule;
import com.fiqri.challange4.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostMapping("/add")
    public Film addFilm(@RequestBody Film film) {
        return filmService.addFilm(film);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFilm(@RequestBody Film film) {
        try {
            filmService.updateFilm(film);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{filmCode}")
    public ResponseEntity<String> deleteFilm(@PathVariable String filmCode) {
        try {
            filmService.deleteFilm(filmCode);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/tayang")
    public List<String> filmTayang() {
        return filmService.sedangTayang();
    }

    @GetMapping("/jadwal/{filmCode}")
    public List<Schedule> jadwalFilm(@PathVariable String filmCode) {
        return filmService.jadwalFilm(filmCode);
    }
}
