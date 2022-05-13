package com.enc.dsmovie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enc.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}