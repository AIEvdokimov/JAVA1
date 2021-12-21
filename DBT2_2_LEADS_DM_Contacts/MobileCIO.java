package com.company.DBT2_2_LEADS_DM_Contacts;

public class MobileCIO {
    private String name = " ";
    private String number = " ";

    private MobileCIO( String n, String nr){
        name = n;
        number = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String nr) {
        number = nr;
    }

    private String MobileCIO(){
        return " n" + " nr";
    }
}
