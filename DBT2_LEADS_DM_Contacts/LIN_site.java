package com.company.DBT2_LEADS_DM_Contacts;

public class LIN_site {
    private String companyName = " ";
    private String webAddress = "";
    private String brand = "";
    private String companyID = "";

    private LIN_site( String cn, String wa, String br){
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

    private String LIN_site(){
        return companyName + webAddress + brand;
    }
}
