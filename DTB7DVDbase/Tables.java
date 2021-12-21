package com.company.DTB7DVDbase;

public class Tables {
    private String actor = " ";
    private String address = " ";
    private String category = "";
    private String city = "";
    private String country = "";
    private String customer = "";
    private String film = "";
    private String filmActor = "";


    private Tables( String a, String b, String c, String d, String e, String f, String g, String h){
        actor = a;
        address = b;
        category = c;
        city = d;
        country = e;
        customer = f;
        film = g;
        filmActor = h;
    }

    public String FilmDTB (){return film + filmActor + category;}

    public String CustomerFilmDTB(){return customer + city + country + film;}

    public String getActor() {
        return actor;
    }

    public void setActor(String a) {
        actor = a;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String b) {
        address = b;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String c) {
        category = c;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String d) {
        city = d;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String e) {
        country = e;
    }

    public String getCustomer() {return customer;}

    public void setCustomer(String f) {customer = f;}

    public String getFilm() {return film;}

    public void setFilm(String g) {film = g;}

    public String getFilmActor() {return filmActor;}

    public void setFilmActor(String h) {filmActor = h;}

}
