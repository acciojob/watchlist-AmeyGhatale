package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MovieService {

    @Autowired
    MovieRepository repoObj;
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

    public void addMoviesInDirector(String movieName, String dirName){
        Map<String, List<String>> dirMovieDb = repoObj.getMoviesByDirectorDb();
        List<String> list = dirMovieDb.get(dirName);
        list.add(movieName);
        dirMovieDb.put(dirName, list);
    }


    public List<String> getDirectorMovieList(String directorName) {
        Map<String, List<String>> dirDb = repoObj.getMoviesByDirectorDb();
        return dirDb.get(directorName);
    }

    public List<String> getAllMovies() {
        return repoObj.getAllMovieList();
    }


    public void removeDirectorMovieList(String directorName) {
        Map<String, List<String>> directorListDb = repoObj.getMoviesByDirectorDb();
        Map<String, Movie> moviesDb = repoObj.getMoviesDb();
        List<String> list = directorListDb.get(directorName);

        for(String movie : list){
            moviesDb.remove(movie);
        }
        directorListDb.remove(directorName);
    }

    public void removeAllMovie() {
        Map<String, Movie> movieDb = repoObj.getMoviesDb();
        movieDb.clear();
    }
}
