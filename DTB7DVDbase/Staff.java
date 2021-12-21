package com.company.DTB7DVDbase;

public class Staff {
    private String active = " ";
    private String addressID = " ";
    private String email = "";
    private String name = "";
    private String password = "";
    private String picture = "";
    private String staffID = "";
    private String username = "";


    private Staff( String a, String b, String c, String d, String e, String f, String g, String h){
        active = a;
        addressID = b;
        email = c;
        name = d;
        password = e;
        picture = f;
        staffID = g;
        username = h;
    }

    public void staffConstructor4(){}

    public String konsruct1(){return email + name + picture;}

    public String konstruct2(){return addressID + name + active;}

    public String konstruct3(){return email + password + username;}


    public String getActive() {
        return active;
    }

    public void setActive(String a) {
        active = a;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String b) {
        addressID = b;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String c) {
        email = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String d) { name = d; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String e) {
        password = e;
    }

    public String getPicture() {return picture;}

    public void setPicture(String f) {picture = f;}

    public String getStaffID() {return staffID;}

    public void setStaffID(String g) {staffID = g;}

    public String getUsername() {return username;}

    public void setUsername(String h) {username = h;}
}
