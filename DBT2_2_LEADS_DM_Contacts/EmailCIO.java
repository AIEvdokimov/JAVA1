package com.company.DBT2_2_LEADS_DM_Contacts;

public class EmailCIO {
    private String eaddress = " ";
    private String domen = " ";

    private EmailCIO( String ea, String d){
        eaddress = ea;
        domen = d;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String ea) {
        eaddress = ea;
    }
    public String getDomen() {
        return domen;
    }

    public void setDomen(String d) {
        domen = d;
    }

    private String EmailCIO(){
        return " ea" + " d";
    }
}

