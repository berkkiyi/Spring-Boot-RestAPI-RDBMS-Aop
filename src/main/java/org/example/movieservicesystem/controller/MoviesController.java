package org.example.movieservicesystem.controller;

import lombok.RequiredArgsConstructor;
import org.example.movieservicesystem.entity.Movies;
import org.example.movieservicesystem.repository.DirectorsRepository;
import org.example.movieservicesystem.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/movieApi")
@RequiredArgsConstructor
public class MovieController {

    @Autowired
    private final MoviesService moviesService;

    @PostMapping("/addMovie")
    public ResponseEntity<Movies> addMovie(@RequestBody Movies movie) {
        Movies savedMovie = moviesService.addMovie(movie);
        return ResponseEntity.ok(savedMovie);
    }

}
