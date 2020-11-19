package com.example.movies;


import android.media.Image;

public class Movies {

    // variable/attribute declaration
    private String MovieName;
    private double rating;
    private String description;
    private Image image;

// default constructor

    public Movies() {
    }

//parameterized constructor

    public Movies(String movieName, double rating, String description, Image image) {
        MovieName = movieName;
        this.rating = rating;
        this.description = description;
        this.image = image;
    }

// getters and setters or accessors and mutators

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}