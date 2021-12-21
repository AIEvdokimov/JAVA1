package com.company.DTB31OutstaffWorkers;

public class SupplierName {
    private String fullName = " ";
    private String ShortName = " ";
    private String brand = "";

    private SupplierName( String f, String s, String b){
        fullName = f;
        ShortName = s;
        brand = b;
    }

    public String getFname() {
        return fullName;
    }

    public void setFname(String f) {
        fullName = f;
    }

    public String getLname() {
        return ShortName;
    }

    public void setLname(String s) {
        ShortName = s;
    }

    public String getTitle() {
        return brand;
    }

    public void setTitle(String b) {
        brand = b;
    }
}
