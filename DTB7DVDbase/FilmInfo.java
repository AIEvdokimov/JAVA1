package com.company.DTB7DVDbase;

public class FilmInfo {
    private String actorID = " ";
    private String filmID = " ";
    private String lastFilmUpdate = "";
    private String filmActor = "";
    private String filmCategory = "";
    private String categoryID = "";
    private String filmAgeRating = "";
    private String lastCatogoryUpdate = "";


    private FilmInfo( String a, String b, String c, String d, String e, String f, String g, String h){
        actorID = a;
        filmID = b;
        lastFilmUpdate = c;
        filmActor = d;
        filmCategory = e;
        categoryID = f;
        filmAgeRating = g;
        lastCatogoryUpdate = h;
    }

    public void filmInfoMetod1(){}

    public String konsruct1(){return actorID + filmActor + filmCategory;}

    public String konstruct2(){return filmID + lastFilmUpdate + filmAgeRating;}

    public String konstruct3(){return filmID + filmAgeRating + lastCatogoryUpdate;}


    public String getActorID() {
        return actorID;
    }

    public void setActorID(String a) {
        actorID = a;
    }

    public String getFilmID() {
        return filmID;
    }

    public void setFilmID(String b) {
        filmID = b;
    }

    public String getLastFilmUpdate() {
        return lastFilmUpdate;
    }

    public void setLastFilmUpdate(String c) {
        lastFilmUpdate = c;
    }

    public String getFilmActor() {
        return filmActor;
    }

    public void setFilmActor(String d) {
        filmActor = d;
    }

    public String getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(String e) {
        filmCategory = e;
    }

    public String getCategoryID() {return categoryID;}

    public void setCategoryID(String f) {categoryID = f;}

    public String getFilmAgeRating() {return filmAgeRating;}

    public void setFilmAgeRating(String g) {filmAgeRating = g;}

    public String getLastCatogoryUpdate() {return lastCatogoryUpdate;}

    public void setLastCatogoryUpdate(String h) {lastCatogoryUpdate = h;}
}
