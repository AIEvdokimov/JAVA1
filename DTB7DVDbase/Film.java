package com.company.DTB7DVDbase;

public class Film {
    private String description = " ";
    private String filmID = " ";
    private String languageID = "";
    private String lenght = "";
    private String rating = "";
    private String releaseYear = "";
    private String rentalRate = "";
    private String title = "";


    private Film( String a, String b, String c, String d, String e, String f, String g, String h){
        description = a;
        filmID = b;
        languageID = c;
        lenght = d;
        rating = e;
        releaseYear = f;
        rentalRate = g;
        title = h;
    }

    public String ratingDTB(){return title + rating + releaseYear;}

    public String rentalDTB(){return filmID + rentalRate + lenght;}

    public String getDescription() {
        return description;
    }

    public void setDescription (String a) {
        description = a;
    }

    public String getFilmID() {
        return filmID;
    }

    public void setFilmID(String b) {
        filmID = b;
    }

    public String getLanguageID() {
        return languageID;
    }

    public void setLanguageID(String c) {
        languageID = c;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String d) {
        lenght = d;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String e) {
        rating = e;
    }

    public String getReleaseYear() {return releaseYear;}

    public void setReleaseYear(String f) {releaseYear = f;}

    public String getRentalRate() {return rentalRate;}

    public void setRentalRate(String g) {rentalRate = g;}

    public String getTitle() {return title;}

    public void setTitle(String h) {title = h;}

}
