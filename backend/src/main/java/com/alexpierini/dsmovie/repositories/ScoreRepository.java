package com.alexpierini.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexpierini.dsmovie.entities.Score;
import com.alexpierini.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
