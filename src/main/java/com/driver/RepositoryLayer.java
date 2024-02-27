package com.driver;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RepositoryLayer {
    private Map<String, Movie> moviesDb = new HashMap<>();
    private Map<String, Director> directorDb = new HashMap<>();
    private Map<String, List<Movie>> movieListOfDirectorDb = new HashMap<>();

    public void addMovie(Movie movie){
        String movieName = movie.getName();
        moviesDb.put(movieName, movie);
    }

    public void addDirector(Director director){
        String directorName = director.getName();
        directorDb.put(directorName, director);
        movieListOfDirectorDb.put(directorName, new ArrayList<>());
    }

    public Map<String, Director> getDirectorsDb(){
        return directorDb;
    }

    public Map<String, Movie> getMoviesDb(){
        return moviesDb;
    }
    public List<Movie> getAllMovieList(){
        return new ArrayList<>(moviesDb.values());
    }

    public Map<String, List<Movie>> getMoviesByDirectorDb(){
        return movieListOfDirectorDb;
    }

}
