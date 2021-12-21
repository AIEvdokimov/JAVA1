package com.company.DTB31OutstaffWorkers;

public class Workers {
    private String workerID = "";
    private String supplierID = "";
    private Integer number = 0;

    private Workers(String w, String s, Integer n){
        workerID = w;
        supplierID = s;
        number = n;
    }

    public String getWorkerID(){
        return workerID;
    }

    public void setWorkerID(String w){
        workerID = w;
    }

    public String getSupplierID(){
        return supplierID;
    }

    public void setSupplierID(String s){
        supplierID = s;
    }

    public Integer getNumber(){
        return number;
    }

    public void setNumber(Integer n){
        number = n;
    }
}
