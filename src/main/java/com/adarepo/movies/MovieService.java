package com.adarepo.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        return repository.findAll();
    }
    public List<Movie> findMovieByTitle(String title) {
        return repository.findByTitleContainingIgnoreCase(title);
    }
}
