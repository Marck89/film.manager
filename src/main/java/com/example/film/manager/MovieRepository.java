package com.example.film.manager;
import com.example.film.manager.model.Movie;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface MovieRepository extends MongoRepository<Movie, String> {
       Movie findMovieById(String movieId);
}