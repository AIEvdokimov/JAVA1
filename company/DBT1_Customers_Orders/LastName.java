package com.company.DBT1_Customers_Orders;

public class LastName {
    private String lastName = "";
    private Integer number = 0;

    public LastName(String ln, Integer nr){
        lastName = ln;
        number = nr;
    }

    public String createCustomerID (){
        return lastName + number;
    }
}
