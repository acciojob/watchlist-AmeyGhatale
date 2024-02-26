package com.driver;

public class Movie {
    private String movieName;
    private String directorName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public Movie() {
    }

    public Movie(String movieName, String directorName) {
        this.movieName = movieName;
        this.directorName = directorName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirName() {
        return directorName;
    }

    public void setDirName(String directorName) {
        this.directorName = directorName;
    }
}
