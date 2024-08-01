package org.example.movieservicesystem.controller;

import lombok.RequiredArgsConstructor;
import org.example.movieservicesystem.repository.DirectorsRepository;
import org.example.movieservicesystem.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AddRemoveDataController {

    private final DirectorsService directorsService;
    private final MoviesService moviesService;

    @PostMapping("/add")
    public void add(@RequestParam(value="name", required = false) String name) {
        directorsService.addDirectors(name.toUpperCase());
    }

    @DeleteMapping("/remove")
    public void remove(@RequestParam(value="id", required = false) int id) {
        directorsService.deleteDirectorsById(id);
    }

}
