package com.company.DTB31OutstaffWorkers;

public class SupplierAgreement {
    private String supplierID = " ";
    private String agreementID = " ";
    private String agreementStatus = "";

    private SupplierAgreement(String s, String c, String a){
        supplierID = s;
        agreementID = c;
        agreementStatus = a;
    }

    public String getFname() {
        return supplierID;
    }

    public void setFname(String s) {
        supplierID = s;
    }

    public String getLname() {
        return agreementID;
    }

    public void setLname(String c) {
        agreementID = c;
    }

    public String getTitle() {
        return agreementStatus;
    }

    public void setTitle(String a) {
        agreementStatus = a;
    }
}
