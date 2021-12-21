package com.company.DBT1_Customers_Orders;

public class Customer {
    private Integer customerID = 0;
    private String  first_Name  = "";
    private String last_Name = "";
    private String phone = "";
    private String email = "";
    private String gender = "";


    public Customer (Integer cid, String fn, String ln, String ph, String el, String gn){
        customerID = cid;
        first_Name = fn;
        last_Name = ln;
        phone = ph;
        email = el;
        gender = gn;

    }

    public String createCustomer (){
       return customerID + first_Name + last_Name + phone + email + gender;
    }

}
