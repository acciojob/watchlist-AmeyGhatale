package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public void addMoviesInDirector(String movieName, String dirName){
        Map<String, List<Movie>> dirMovieDb = repoObj.getMoviesByDirectorDb();
        List<Movie> list = dirMovieDb.get(dirName);
        Movie movie = getMovie(movieName);
        list.add(movie);
        dirMovieDb.put(dirName, list);
    }


    public List<Movie> getDirectorMovieList(String directorName) {
        Map<String, List<Movie>> dirDb = repoObj.getMoviesByDirectorDb();
        return dirDb.get(directorName);
    }

    public List<Movie> getAllMovies() {
        return repoObj.getAllMovieList();
    }


    public void removeDirectorMovieList(String directorName) {
        Map<String, List<Movie>> directorListDb = repoObj.getMoviesByDirectorDb();
        Map<String, Movie> moviesDb = repoObj.getMoviesDb();
        List<Movie> list = directorListDb.get(directorName);

        for(Movie movie : list){
            moviesDb.remove(movie.getMovieName());
        }

        directorListDb.remove(directorName);
    }

    public void removeAllMovie() {
        Map<String, Movie> movieDb = repoObj.getMoviesDb();
        movieDb.clear();
    }
}
