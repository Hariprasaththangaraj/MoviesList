package com.movieslist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieslist.model.Movies;


@Repository
public interface repo extends JpaRepository<Movies, Integer>{

}
