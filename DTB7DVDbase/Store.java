package com.company.DTB7DVDbase;

public class Store {
    private String columns = " ";
    private String addressID = " ";
    private String lastUpdate = "";
    private String managerStaffID = "";
    private String storeID = "";
    private String languageID = "";
    private String name = "";
    private String indexes = "";


    private Store( String a, String b, String c, String d, String e, String f, String g, String h){
        columns = a;
        addressID = b;
        lastUpdate = c;
        managerStaffID = d;
        storeID = e;
        languageID = f;
        name = g;
        indexes = h;
    }

    public void storeConstructor4(){}

    public String konsruct1(){return addressID + storeID + indexes;}

    public String konstruct2(){return columns + storeID + languageID;}

    public String konstruct3(){return managerStaffID + storeID + name;}


    public String getColumns() {
        return columns;
    }

    public void setColumns(String a) {
        columns = a;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String b) {
        addressID = b;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String c) {
        lastUpdate = c;
    }

    public String getManagerStaffID() {
        return managerStaffID;
    }

    public void setManagerStaffID(String d) { managerStaffID = d; }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String e) {
        storeID = e;
    }

    public String getLanguageID() {return languageID;}

    public void setLanguageID(String f) {languageID = f;}

    public String getName() {return name;}

    public void setName(String g) {name = g;}

    public String getIndexes() {return indexes;}

    public void setIndexes(String h) {indexes = h;}
}
