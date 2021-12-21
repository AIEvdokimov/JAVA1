package com.company.DTB31OutstaffWorkers;

public class Suppliers {
    private String supplierID = " ";
    private String companyName = " ";
    private Integer workers = 0;

    private Suppliers( String s, String c, Integer w){
        supplierID = s;
        companyName = c;
        workers = w;
    }

    public String getFname() {
        return supplierID;
    }

    public void setFname(String s) {
        supplierID = s;
    }

    public String getLname() {
        return companyName;
    }

    public void setLname(String c) {
        companyName = c;
    }

    public Integer getTitle() {
        return workers;
    }

    public void setTitle(Integer w) {
        workers = w;
    }
}
