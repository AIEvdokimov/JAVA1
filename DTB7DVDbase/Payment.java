package com.company.DTB7DVDbase;

public class Payment {
    private String amount = " ";
    private String customerID = " ";
    private String paymentDate = "";
    private String paymentID = "";
    private String rentalID = "";
    private String staffID = "";
    private String date = "";
    private String paymentType = "";


    private Payment( String a, String b, String c, String d, String e, String f, String g, String h){
        amount = a;
        customerID = b;
        paymentDate = c;
        paymentID = d;
        rentalID = e;
        staffID = f;
        date = g;
        paymentType = h;
    }

    public void paymentConstructor4(){}

    public String konsruct1(){return amount + customerID + paymentID;}

    public String konstruct2(){return paymentType + paymentID + rentalID;}

    public String konstruct3(){return staffID + paymentID + amount;}


    public String getAmount() {
        return amount;
    }

    public void setAmount(String a) {
        amount = a;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String b) {
        customerID = b;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String c) {
        paymentDate = c;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String d) {
        paymentID = d;
    }

    public String getRentalID() {
        return rentalID;
    }

    public void setRentalID(String e) {
        rentalID = e;
    }

    public String getStaffID() {return staffID;}

    public void setStaffID(String f) {staffID = f;}

    public String getFilmAgeRating() {return date;}

    public void setDate(String g) {date = g;}

    public String getPaymentType() {return paymentType;}

    public void setPaymentType(String h) {paymentType = h;}
}
