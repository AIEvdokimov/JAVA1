package com.company.DBT1_Customers_Orders;

public class CustomerID {
    private String custid = "";
    private Integer number = 0;

    public CustomerID(String ci, Integer nr){
        custid = ci;
        number = nr;
    }

    public String createCustomerID (){
        return custid + number;
    }

}
