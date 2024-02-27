package com.driver;

public class Movie {

    private String movieName;
    private int durationInMinutes;
    private double imdbRating;

    Movie(){

    }
    public Movie(String movieName, int durationInMinutes, double imdbRating){
        this.durationInMinutes=durationInMinutes;
        this.movieName = movieName;
        this.imdbRating=imdbRating;
    }


    public String getMovieName() {
        return movieName;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}