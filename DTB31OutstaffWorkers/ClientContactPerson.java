package com.company.DTB31OutstaffWorkers;

public class ClientContactPerson {
    private String clientID = "";
    private String personID = "";
    private Integer number = 0;

    private ClientContactPerson(String c, String p, Integer n){
        clientID = c;
        personID = p;
        number = n;
    }

    public String getClientID(){
        return clientID;
    }

    public void setClientID(String c){
        clientID = c;
    }

    public String getPersonID(){
        return personID;
    }

    public void setPersonID(String p){
        personID = p;
    }

    public Integer getNumber(){
        return number;
    }

    public void setNumber(Integer n){
        number = n;
    }

}
