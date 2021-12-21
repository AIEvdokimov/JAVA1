package com.company.DBT2_2_LEADS_DM_Contacts;

public class Description {
    private String text = " ";
    private String info = " ";
    private Integer number = 0;

    private Description( String t, String i, Integer n){
        text = t;
        info = i;
        number = n;
    }

    public String getText() {
        return text;
    }

    public void setName(String t) {
        text = t;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String t) {
        info = "i";
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer n) {
        number = n;
    }
}
