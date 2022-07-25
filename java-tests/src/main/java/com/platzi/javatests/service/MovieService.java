package com.platzi.javatests.service;

import com.platzi.javatests.data.MovieRepository;
import com.platzi.javatests.model.Genre;
import com.platzi.javatests.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByLength(int length) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());
    }

    public Collection<Movie> findByName(String name) {
        return movieRepository.findByName(name.toLowerCase());
    }

    public Collection<Movie> findMoviesByTemplate(Movie template) {
        return movieRepository.findAll().stream()
                .filter(movie -> {
                    return movie.getName().equalsIgnoreCase(template.getName()) ||
                            movie.getMinutes().equals(template.getMinutes()) ||
                            movie.getGenre().equals(template.getGenre());
                }).collect(Collectors.toList());
    }
}
