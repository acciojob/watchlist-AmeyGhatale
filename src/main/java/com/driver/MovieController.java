package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController
{
    @Autowired
    MovieService serviceObj;

    @PostMapping("/movies/add-movie")
    public void addMovie(@RequestBody Movie movie)
    {
        serviceObj.addMovie(movie);
//        return new ResponseEntity<>("Movie has been added", HttpStatus.CREATED);
    }

    @PostMapping("/movies/add-director")
    public void addDirector(@RequestBody Director director)
    {
        serviceObj.addDirector(director);
//        return new ResponseEntity<>("Director has been added", HttpStatus.CREATED);
    }

    @PutMapping("/movies/add-movie-director-pair")
    public void addMovieDirectorPair(@RequestParam("movieName") String movieName,
                                              @RequestParam("dirName") String dirName)
    {
        serviceObj.addMoviesInDirector(movieName, dirName);
//        return new ResponseEntity<>("Movie has been updated", HttpStatus.ACCEPTED);
    }

    @GetMapping("/movies/get-movie-by-name/{movieName}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable("movieName") String name)
    {
        return new ResponseEntity<>(serviceObj.getMovie(name), HttpStatus.FOUND);
    }

    @GetMapping("/movies/get-director-by-name/{directorName}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable("directorName") String name)
    {
        return new ResponseEntity<>(serviceObj.getDirector(name), HttpStatus.FOUND);
    }

    @GetMapping("/movies/get-movies-by-director-name/{dirName}")

    public ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable("dirName") String  name)
    {
        return new ResponseEntity<>(serviceObj.getDirectorMovieList(name), HttpStatus.FOUND);
    }

    @GetMapping("/movies/get-all-movies")
    public ResponseEntity<List<Movie>> findAllMovies()
    {
        return new ResponseEntity<>(serviceObj.getAllMovies(), HttpStatus.FOUND);
    }

    @DeleteMapping("/movies/delete-director-by-name")
    public void deleteDirectorByName(@RequestParam("directorName") String name)
    {
        serviceObj.removeDirectorMovieList(name);
//        return new ResponseEntity<>("All movies of "+name+" has been deleted", HttpStatus.GONE);
    }

    @DeleteMapping("/movies/delete-all-directors")
    public void deleteAllDirectors()
    {
        serviceObj.removeAllMovie();
//        return new ResponseEntity<>("All movies are gone", HttpStatus.GONE);
    }


}
