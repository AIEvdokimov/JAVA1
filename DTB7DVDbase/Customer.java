package com.company.DTB7DVDbase;

public class Customer {
    private String activebool = " ";
    private String addressID = "";
    private String createDate = "";
    private String customerID = "";
    private String email = "";
    private String name = "";
    private String lastUpdate = "";
    private String storeID = "";


    private Customer( String a, String b, String c, String d, String e, String f, String g, String h){
        activebool = a;
        addressID = b;
        createDate = c;
        customerID = d;
        email = e;
        name = f;
        lastUpdate = g;
        storeID = h;
    }

    public String customerDTB(){return name + customerID + addressID + email;}

    public String dateofLast(){return customerID + lastUpdate + email;}

    public String getActivebool() { return activebool; }

    public void setActivebool(String a) {
        activebool = a;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String b) {
        addressID = b;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String c) {
        createDate = c;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String d) {
        customerID = d;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }

    public String getName() {return name;}

    public void setName(String f) {name = f;}

    public String getLastUpdate() {return lastUpdate;}

    public void setLastUpdate(String g) {lastUpdate = g;}

    public String getStoreID() {return storeID;}

    public void setStoreID(String h) {storeID = h;}

}
