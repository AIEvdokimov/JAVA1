package com.company.DTB31OutstaffWorkers;

public class ClientSite {
    private String clientID = "";
    private String clientCompany = "";
    private String websiteClient = "";

    private ClientSite(String cid, String cc, String wc){
        clientID = cid;
        clientCompany = cc;
        websiteClient = wc;
    }

    public String getClientID(){
        return clientID;
    }

    public void setClientID(String cid){
        clientID = cid;
    }

    public String getClientCompany(){
        return clientCompany;
    }

    public void setClientCompany(String cc){
        clientCompany = cc;
    }

    public String getWebsiteClient(){
        return websiteClient;
    }

    public void setWebsiteClient(String wc){
        websiteClient = wc;
    }

}
