package com.company.DBT2_2_LEADS_DM_Contacts;

public class TD {
    private String tdid = " ";
    private String companyid = " ";
    private String name = "";

    private TD( String n, String t, String c){
        name = n;
        tdid = t;
        companyid = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getcompanyid() {
        return companyid;
    }

    public void setcompanyid(String t) {
        companyid = t;
    }

    public String gettdid() {
        return tdid;
    }

    public void settdid(String a) {
        tdid = a;
    }
}
