package org.example.movieservicesystem.mapper;

import org.example.movieservicesystem.entity.Movies;
import org.example.movieservicesystem.dto.MoviesDto;

public class MovieMapper {

    public static MoviesDto toDTO(Movies movies) {
        MoviesDto dto = new MoviesDto();
        dto.setMovie_name(movies.getMovie_name());
        dto.setRevenues(movies.getRevenues());
        dto.setYear(movies.getYear());
        return dto;
    }

    public static Movies toEntity(MoviesDto dto) {
        Movies movies = new Movies();
        movies.setMovie_name(dto.getMovie_name());
        movies.setRevenues(dto.getRevenues());
        movies.setYear(dto.getYear());
        return movies;
    }

}
