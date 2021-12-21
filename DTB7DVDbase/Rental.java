package com.company.DTB7DVDbase;

public class Rental {
    private String columns = " ";
    private String customerID = " ";
    private String inventoryID = "";
    private String lastUpdate = "";
    private String rentalDate = "";
    private String rentalID = "";
    private String returnDate = "";
    private String staffID = "";


    private Rental( String a, String b, String c, String d, String e, String f, String g, String h){
        columns = a;
        customerID = b;
        inventoryID = c;
        lastUpdate = d;
        rentalDate = e;
        rentalID = f;
        returnDate = g;
        staffID = h;
    }

    public void rentalConstructor4(){}

    public String konsruct1(){return columns + customerID + returnDate;}

    public String konstruct2(){return customerID + returnDate + rentalID;}

    public String konstruct3(){return staffID + customerID + rentalID;}


    public String getColumns() {
        return columns;
    }

    public void setColumns(String a) {
        columns = a;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String b) {
        customerID = b;
    }

    public String getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(String c) {
        inventoryID = c;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String d) { lastUpdate = d; }

    public String getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(String e) {
        rentalDate = e;
    }

    public String getRentalID() {return rentalID;}

    public void setRentalID(String f) {rentalID = f;}

    public String getReturnDate() {return returnDate;}

    public void setReturnDate(String g) {rentalDate = g;}

    public String getStaffID() {return staffID;}

    public void setStaffID(String h) {staffID = h;}
}
