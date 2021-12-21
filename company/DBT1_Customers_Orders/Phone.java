package com.company.DBT1_Customers_Orders;

public class Phone {
    private String phoneNum = "";
    private Integer number = 0;

    public Phone(String phn, Integer nr){
        phoneNum = phn;
        number = nr;
    }

    public String createCustomerID (){
        return phoneNum + number;
    }
}
