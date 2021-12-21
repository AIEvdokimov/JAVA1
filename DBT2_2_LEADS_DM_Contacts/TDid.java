package com.company.DBT2_2_LEADS_DM_Contacts;

public class TDid {
    private String tdid = " ";
    private Integer number = 0;

    private TDid( String ti, Integer n ){
        number = n;
        tdid = ti;
    }

    public String getTdid() {
        return tdid;
    }

    public Integer getnumber() {
        return number;
    }

}
