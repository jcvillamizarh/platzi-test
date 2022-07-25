package com.platzi.javatests.service;

import com.platzi.javatests.data.MovieRepository;
import com.platzi.javatests.model.Genre;
import com.platzi.javatests.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MovieServiceShould {
    private MovieService movieService;

    @Before
    public void setUp() throws Exception {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark knight", 152, Genre.ACTION,"Director1"),
                        new Movie(2, "Memento", 113, Genre.THRILLER, "Director2"),
                        new Movie(3, "There's Something about Mery", 119, Genre.COMEDY, "Director3"),
                        new Movie(4, "Super 8", 112, Genre.THRILLER, "Director4"),
                        new Movie(5, "Scream", 111, Genre.HORROR, "Director5"),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY, "Director6"),
                        new Movie(7, "Matrix", 136, Genre.ACTION, "Director7")
                )
        );
        movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movies_by_genre() {
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        List<Integer> movieIds = getMovieIDs(movies);
        assertThat(movieIds, is(Arrays.asList(3, 6)));
    }

    @Test
    public void return_movies_by_duration() {
        Collection<Movie> movies = movieService.findMoviesByLength(120);
        assertThat(getMovieIDs(movies), is(Arrays.asList(2, 3, 4, 5, 6)));
    }

    @Test
    public void load_movies_by_template() {
        Movie movie = new Movie("Matrix", null, null, null);
        Collection<Movie> movies = movieService.findMoviesByTemplate(movie);
        assertThat(movies, is(Arrays.asList(new Movie(7, "Matrix", 136, Genre.ACTION, "Director7"))));
    }
    private List<Integer> getMovieIDs(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }
}