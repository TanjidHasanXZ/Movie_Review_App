package com.moviesite.movies.controller;

import com.moviesite.movies.entities.Movie;
import com.moviesite.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<List<Movie>>(service.findAllMovies(), HttpStatus.OK);
    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
     return new ResponseEntity<Optional<Movie>>(service.singleMovie(imdbId), HttpStatus.OK);
    }

}
