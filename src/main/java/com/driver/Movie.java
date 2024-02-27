package com.driver;

public class Movie {
    private String movieName;
//    private double duration;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public Movie() {
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


}
