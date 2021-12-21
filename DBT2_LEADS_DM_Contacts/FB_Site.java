package com.company.DBT2_LEADS_DM_Contacts;

public class FB_Site {
    private String companyName = " ";
    private String webAddress = "";
    private String brand = "";
    private String companyID = "";

    private FB_Site( String cn, String wa, String br){
        companyName = cn;
        webAddress = wa;
        brand = br;
    }

    private void companyName (){
    }

    private void webAddress (){
    }

    private void brand (){
    }

    private String FB_Site(){
        return companyName + webAddress + brand;
    }
}
