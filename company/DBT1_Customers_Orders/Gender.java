package com.company.DBT1_Customers_Orders;

public class Gender {
    private String gendr = "";
    private Integer number = 0;

    public Gender(String gr, Integer nr){
        gendr = gr;
        number = nr;
    }

    public String createCustomerID (){
        return gendr + number;
    }
}
