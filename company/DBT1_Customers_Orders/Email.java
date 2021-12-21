package com.company.DBT1_Customers_Orders;

public class Email {
    private String email = "";
    private Integer number = 0;

    public Email(String eml, Integer nr){
        email = eml;
        number = nr;
    }

    public String createCustomerID (){
        return email + number;
    }
}
