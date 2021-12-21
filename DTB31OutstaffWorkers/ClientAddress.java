package com.company.DTB31OutstaffWorkers;

public class ClientAddress {
    private String clientID = "";
    private String addressMail = "";
    private String aggressJustice = "";

    private ClientAddress(String c, String m, String j){
        clientID = c;
        addressMail = m;
        aggressJustice = j;
    }

    public String getClientID(){
        return clientID;
    }

    public void setClientID(String c){
        clientID =c;
    }

    public String getAddressMail(){
        return addressMail;
    }

    public void setAddressMail(String m){
        addressMail = m;
    }

    public String getAggressJustice(){
        return aggressJustice;
    }

    public void setAggressJustice(String j){
        aggressJustice = j;
    }

}
