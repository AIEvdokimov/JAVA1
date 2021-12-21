package com.company.DTB7DVDbase;

public class Table2 {
    private String filmCategory = " ";
    private String inventory = " ";
    private String language = "";
    private String staff = "";
    private String store = "";
    private String filmID = "";
    private Integer payment = 0;
    private Integer rental = 0;

    private Table2( String a, String b, String c, String d, String e, String f, Integer g, Integer h){
        filmCategory = a;
        inventory = b;
        language = c;
        staff = d;
        store = e;
        filmID = f;
        payment = g;
        rental = h;
    }

    public String FilmLanguageDTB(){return filmID + filmCategory + language;}

    public String FilmRentalDTB(){return filmID + payment + rental;}

    public String FilmInventory(){return filmID + inventory + store + staff;}

    public String getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(String a) {
        filmCategory = a;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String b) {
        inventory = b;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String c) {
        language = c;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String d) {
        staff = d;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String e) {
        store = e;
    }

    public String getFilmID() {return filmID;}

    public void setFilmID(String f) {filmID = f;}

    public Integer getPayment() {return payment;}

    public void setPayment(Integer g) {payment = g;}

    public Integer getRental() {return rental;}

    public void setRental(Integer h) {rental = h;}

}
