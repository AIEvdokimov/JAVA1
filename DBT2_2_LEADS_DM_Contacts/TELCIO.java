package com.company.DBT2_2_LEADS_DM_Contacts;

public class TELCIO {
    private String name = " ";
    private String telnumber = " ";
    private String addnumber = "";

    private TELCIO( String n, String t, String a){
        name = n;
        telnumber = t;
        addnumber = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String t) {
        telnumber = t;
    }
    public String getAddnumber() {
        return addnumber;
    }

    public void setAddnumber(String a) {
        addnumber = a;
    }

    private String TELCIO(){
        return " n" + " t" + " a";
    }
}
