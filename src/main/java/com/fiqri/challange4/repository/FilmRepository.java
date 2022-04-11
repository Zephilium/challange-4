package com.fiqri.challange4.repository;

import com.fiqri.challange4.entity.Film;
import com.fiqri.challange4.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.websocket.server.PathParam;
import java.util.List;

public interface FilmRepository extends JpaRepository<Film, String> {
    @Query("SELECT f.filmName from Film f where f.tayang='Y'")
    public List<String> sedangTayang();

    //    SELECT * FROM schedule s JOIN film f on f.film_code = s.film_code;
    @Query("SELECT f.jadwal FROM Film f WHERE f.filmCode=:filmCode")
    public List<Schedule> jadwalFilm(@PathParam("filmCode") String filmCode);


}