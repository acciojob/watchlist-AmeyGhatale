package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiceLayer {

    @Autowired
    RepositoryLayer repoObj;
//    Map<String, Director> directorDb = repoObj.getDirectorsDb();

    public void addMovie(Movie movie) {
        repoObj.addMovie(movie);
    }

    public void addDirector(Director director) {
        repoObj.addDirector(director);
    }

    public void updateMovieUsingPut(Movie movie) {
        addMovie(movie);
    }

    public Movie getMovie(String name) {
        Map<String, Movie> movieDb = repoObj.getMoviesDb();
        return movieDb.get(name);
    }

    public Director getDirector(String name) {
        Map<String, Director> directorDb = repoObj.getDirectorsDb();
        return directorDb.get(name);
    }


    public String directorMovieList(String directorName) {
        Map<String, Movie> movieDb = repoObj.getMoviesDb();
        String response = "";
        for (Movie movie : movieDb.values()) {
            String director = movie.getDirName();
            if (director.equals(directorName))
                response += movie.getMovieName() + "\n";
        }
        return response;
    }

    public StringBuilder getAllMovies() {
        Map<String, Movie> movieDb = repoObj.getMoviesDb();
        StringBuilder response = new StringBuilder();
        for (Movie movie : movieDb.values()) {
            response.append(movie.getMovieName() + "\n");
        }
        return response;
    }


    public void removeDirectorMovieList(String directorName) {
        Map<String, Movie> movieDb = repoObj.getMoviesDb();
        for (Movie movie : movieDb.values()) {
            String director = movie.getDirName();
            if (director.equals(directorName))
                movieDb.remove(movie.getMovieName());
        }
    }

    public void removeAllMovie() {
        Map<String, Movie> movieDb = repoObj.getMoviesDb();
        movieDb.clear();
    }
}
