package com.company.DTB31OutstaffWorkers;

public class emailClient {
    private String email = "";
    private String clientID = "";

    private emailClient(String e, String cid){
        email = e;
        clientID = cid;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String e){
        email = e;
    }

    public String getClientID(){
        return clientID;
    }

    public void setClientID(String cid){
        clientID = cid;
    }


}
