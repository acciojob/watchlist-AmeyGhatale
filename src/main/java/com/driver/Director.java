package com.driver;

public class Director {

    private String directorName;
    private int numberOfMovies;
    private  double imdbRating;

    Director(){

    }
    public Director(String directorName, int numberOfMovies, double imdbRating){
        this.imdbRating=imdbRating;
        this.numberOfMovies=numberOfMovies;
        this.directorName = directorName;

    }

    public double getImdbRating() {
        return imdbRating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }
}