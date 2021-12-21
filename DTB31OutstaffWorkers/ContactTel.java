package com.company.DTB31OutstaffWorkers;

public class ContactTel {
    private String personID = "";
    private String telephone = "";
    private String messenger = "";

    private ContactTel(String p, String t, String m){
        personID = p;
        telephone = t;
        messenger = m;
    }

    public String getPersonID(){
        return personID;
    }

    public void setPersonID(String p){
        personID = p;
    }

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String t){
        telephone = t;
    }

    public String getMessenger(){
        return telephone;
    }

    public void setMessenger(String m){
        messenger =m;
    }

}
