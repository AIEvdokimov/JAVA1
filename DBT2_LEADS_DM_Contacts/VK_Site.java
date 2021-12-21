package com.company.DBT2_LEADS_DM_Contacts;

public class VK_Site {
    private String companyName = " ";
    private String webAddress = "";
    private String brand = "";
    private String companyID = "";
    private String publicID = "";

    private VK_Site( String cn, String wa, String br, String pi){
        companyName = cn;
        webAddress = wa;
        brand = br;
        publicID = pi;
    }

    private void companyName (){
    }

    private void webAddress (){
    }

    private void brand (){
    }

    private void publicID (){
    }

    private String VK_Site(){
        return companyName + webAddress + brand;
    }
}
