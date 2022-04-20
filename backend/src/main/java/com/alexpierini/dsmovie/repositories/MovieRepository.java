package com.alexpierini.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexpierini.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
