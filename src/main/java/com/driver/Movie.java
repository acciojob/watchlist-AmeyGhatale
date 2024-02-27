package com.driver;

public class Movie {

    private String name;
    private int durationInMinutes;
    private double imdbRating;

    Movie(){

    }
    public Movie(String name, int durationInMinutes, double imdbRating){
        this.durationInMinutes=durationInMinutes;
        this.name = name;
        this.imdbRating=imdbRating;
    }


    public String getName() {
        return name;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}