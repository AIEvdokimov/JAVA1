package com.company.DBT1_Customers_Orders;

public class FirstName {
    private String custName = "";
    private Integer number = 0;

    public FirstName(String cn, Integer nr){
        custName = cn;
        number = nr;
    }

    public String createCustomerID (){
        return custName + number;
    }
}
