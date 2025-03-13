package com.moviesite.movies.service;

import com.moviesite.movies.repositories.MovieRepository;
import com.moviesite.movies.entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        return repository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}
