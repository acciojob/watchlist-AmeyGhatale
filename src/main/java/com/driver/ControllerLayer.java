package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerLayer
{
    @Autowired
    ServiceLayer serviceObj;

    @PostMapping("/movies/add-movie")
    public String addMovie(@RequestBody Movie movie)
    {
        serviceObj.addMovie(movie);
        return "Movie has been added";
    }

    @PostMapping("/movies/add-director")
    public String addDirector(@RequestBody Director director)
    {
        serviceObj.addDirector(director);
        return "Director has been added";
    }

    @PutMapping("/movies/add-movie-director-pair")
    public String updateMovie(@RequestBody Movie movie)
    {
        addMovie(movie);
        return "Movie has been updated";
    }

    @GetMapping("/movies/get-movie-by-name/{movieName}")
    public Movie getMovieByName(@PathVariable("movieName") String name)
    {
        return serviceObj.getMovie(name);
    }

    @GetMapping("/movies/get-director-by-name/{directorName}")
    public Director getDirectorByName(@PathVariable("directorName") String name)
    {
        return serviceObj.getDirector(name);
    }

    @GetMapping("/movies/get-movies-by-director-name/{dirName}")
    public String getMovieByDirector(@PathVariable("dirName") String  name)
    {
        return serviceObj.directorMovieList(name);
    }

    @GetMapping("/movies/get-all-movies")
    public StringBuilder getAllMovies()
    {
        return serviceObj.getAllMovies();
    }

//    @DeleteMapping("/movies/delete-director-by-name")
//    public void deleteDirector  MovieByName()
//{
//
//}

    @DeleteMapping("/movies/delete-all-directors")
    public String deleteAllMovies()
    {
        serviceObj.removeAllMovie();
        return "All movies are gone";
    }


}
