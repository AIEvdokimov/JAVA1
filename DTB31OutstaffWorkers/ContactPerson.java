package com.company.DTB31OutstaffWorkers;

public class ContactPerson {
    private String personID = "";
    private String name = "";

    private ContactPerson(String p, String n){
        personID = p;
        name = n;
    }

    public String getPersonID(){
        return personID;
    }

    public void setPersonID(String p){
        personID = p;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}
