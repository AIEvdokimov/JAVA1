package com.company.DTB31OutstaffWorkers;

public class ClientContactsID {
    private String clientID = "";
    private Integer number = 0;

    private ClientContactsID(String cid, Integer n){
        clientID = cid;
        number = n;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public Integer getNumber(){
        return number;
    }

    public void setNumber(Integer n){
        number = n;
    }
}
