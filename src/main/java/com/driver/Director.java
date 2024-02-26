package com.driver;

public class Director {
    private String directorName;

    public Director(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public Director() {
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}
