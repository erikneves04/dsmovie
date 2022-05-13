package com.enc.dsmovie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enc.dsmovie.entities.Score;
import com.enc.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}