package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class RepositoryLayer {
    private Map<String, Movie> moviesDb = new HashMap<>();
    private Map<String, Director> directorDb = new HashMap<>();

    public void addMovie(Movie movie){
        String movieName = movie.getMovieName();
        moviesDb.put(movieName, movie);
    }

    public void addDirector(Director director){
        String directorName = director.getDirectorName();
        directorDb.put(directorName, director);
    }

    public Map<String, Director> getDirectorsDb(){
        return directorDb;
    }

    public Map<String, Movie> getMoviesDb(){
        return moviesDb;
    }

}
