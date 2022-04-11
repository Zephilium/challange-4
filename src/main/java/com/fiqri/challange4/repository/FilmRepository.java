package com.fiqri.challange4.repository;

import com.fiqri.challange4.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, String> {
}