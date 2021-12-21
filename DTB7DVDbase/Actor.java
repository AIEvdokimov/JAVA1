package com.company.DTB7DVDbase;

public class Actor {
    private String actorID = " ";
    private String firstName = " ";
    private String lastName = "";
    private String update = "";
    private String country = "";
    private String maxRating = "";
    private Integer age = 0;
    private Integer maxSalary = 0;

    private Actor( String a, String b, String c, String d, String e, String f, Integer g, Integer h){
        actorID = a;
        firstName = b;
        lastName = c;
        update = d;
        country = e;
        maxRating = f;
        age = g;
        maxSalary = h;
    }

    public String actornameDTB(){return actorID + firstName + lastName;    }

    public String salaryDTB(){return actorID + age + maxSalary;}

    public String getActorID() {
        return actorID;
    }

    public void setActorID(String a) {
        actorID = a;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String b) {
        firstName = b;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String c) {
        lastName = c;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String d) {
        update = d;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String e) {
        country = e;
    }

    public String getMaxRating() {return maxRating;}

    public void setMaxRating(String f) {maxRating = f;}

    public Integer getAge() {return age;}

    public void setAge(Integer g) {age = g;}

    public Integer getMaxSalary() {return maxSalary;}

    public void setMaxSalary(Integer h) {maxSalary = h;}
}
